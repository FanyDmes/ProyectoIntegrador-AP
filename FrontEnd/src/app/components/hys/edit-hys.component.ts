import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { HyS } from 'src/app/model/hys';
import { SHySService } from 'src/app/service/s-hys.service';

@Component({
  selector: 'app-edit-hys',
  templateUrl: './edit-hys.component.html',
  styleUrls: ['./edit-hys.component.css']
})
export class EditHySComponent implements OnInit {
  hys: HyS = null;

  constructor(private sHyS: SHySService, private activatedRouter: ActivatedRoute,
    private router: Router) { }

  ngOnInit(): void {
    const id = this.activatedRouter.snapshot.params['id'];
    this.sHyS.detail(id).subscribe(
      data =>{
        this.hys = data;
      }, err =>{
        alert("Error al modificar la habilidad");
        this.router.navigate(['']);
      }
    )
  }

  onUpdate(): void{
    const id = this.activatedRouter.snapshot.params['id'];
    this.sHyS.update(id, this.hys).subscribe(
      data => {
        this.router.navigate(['']);
      }, err =>{
         alert("Error al modificar la habilidad");
         this.router.navigate(['']);
      }
    )
  }

}