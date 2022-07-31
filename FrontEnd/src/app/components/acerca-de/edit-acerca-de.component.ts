import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Acerca } from 'src/app/model/acerca';
import { SAcercaService } from 'src/app/service/s-acerca.service';

@Component({
  selector: 'app-edit-acerca-de',
  templateUrl: './edit-acerca-de.component.html',
  styleUrls: ['./edit-acerca-de.component.css']
})
export class EditAcercaComponent implements OnInit {
  aceLab: Acerca = null;
    

  constructor(private sAcerca: SAcercaService, private activatedRouter: ActivatedRoute,private router: Router) { }

  ngOnInit(): void {
    const id = this.activatedRouter.snapshot.params['id'];
    this.sAcerca.detail(id).subscribe(
      data =>{
        this.aceLab = data;
      }, err =>{
        alert("Error al modificar el contenido");
        this.router.navigate(['']);
      }
    )
  }

  onUpdate(): void{
    const id = this.activatedRouter.snapshot.params['id'];
    this.sAcerca.update(id, this.aceLab).subscribe(
      data => {
        this.router.navigate(['']);
      }, err =>{
         alert("Error al modificar el contenido");
         this.router.navigate(['']);
      }
    )
  }

}