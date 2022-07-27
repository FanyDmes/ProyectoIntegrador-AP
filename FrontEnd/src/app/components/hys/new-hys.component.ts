import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { HyS } from 'src/app/model/hys';
import { SHySService } from 'src/app/service/s-hys.service';

@Component({
  selector: 'app-new-hys',
  templateUrl: './new-hys.component.html',
  styleUrls: ['./new-hys.component.css']
})
export class NewHySComponent implements OnInit {
  nombreHyS: string = '';
  descripcionHyS: string = '';
  imgHyS: string = '';
  porcentaje: string = '';
    

  constructor(private sHyS: SHySService, private router: Router) { }

  ngOnInit(): void {
  }

  
  onCreate(): void {
    const hys = new HyS(this.nombreHyS, this.descripcionHyS, this.imgHyS, this.porcentaje);
    this.sHyS.save(hys).subscribe(
      data => {
        alert("Habilidad añadida");
        this.router.navigate(['']);
      }, err => {
        alert("Falló");
        this.router.navigate(['']);
      }
    )
  }

}

