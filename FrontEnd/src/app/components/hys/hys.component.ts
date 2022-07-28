import { Component, OnInit } from '@angular/core';
import { HyS } from 'src/app/model/hys';
import { TokenService } from 'src/app/service/token.service';
import { SHySService } from 'src/app/service/s-hys.service';

@Component({
  selector: 'app-hys',
  templateUrl: './hys.component.html',
  styleUrls: ['./hys.component.css']
})
export class HySComponent implements OnInit {
hys: HyS[] = [];

  constructor(private sHyS: SHySService, private tokenService: TokenService) { }
 
  isLogged = false;

  ngOnInit(): void {
    this.cargarHyS();
    if (this.tokenService.getToken()) {
      this.isLogged = true;
    } else {
      this.isLogged = false;
    }
  }

  cargarHyS(): void {
    this.sHyS.lista().subscribe(data => { this.hys = data; })
  }

  delete(id?: number){
    if(id != undefined){
      this.sHyS.delete(id).subscribe(
        data => {
          this.cargarHyS();
        }, err => {
          alert("No se pudo borrar la habilidad");
        }
      )
    }
  }
}