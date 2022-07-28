import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Acerca} from 'src/app/model/acerca';
import { SAcercaService } from 'src/app/service/s-acerca.service';

@Component({
  selector: 'app-new-acerca-de',
  templateUrl: './new-acerca-de.component.html',
  styleUrls: ['./new-acerca-de.component.css']
})
export class NewAcercaComponent implements OnInit {
  nombreA: string = '';
  descripcionA: string = '';
  tituloA: string = '';
  imgA: string = '';


  constructor(private sAcerca: SAcercaService, private router: Router) { }

  ngOnInit(): void {
  }

  onCreate(): void {
    const acerca = new Acerca(this.nombreA, this.descripcionA, this.tituloA, this.imgA);
    this.sAcerca.save(acerca).subscribe(
      data => {
        alert("Contenido añadido");
        this.router.navigate(['']);
      }, err => {
        alert("Falló");
        this.router.navigate(['']);
      }
    )
  }

}
