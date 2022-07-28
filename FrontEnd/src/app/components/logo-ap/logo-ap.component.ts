import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Logo } from 'src/app/model/logo';
import { SLogoService } from 'src/app/service/s-logo.service';
import { TokenService } from 'src/app/service/token.service';

@Component({
  selector: 'app-logo-ap',
  templateUrl: './logo-ap.component.html',
  styleUrls: ['./logo-ap.component.css']
})
export class LogoAPComponent implements OnInit {
  logo: Logo[] = [];


  constructor(private sLogo: SLogoService, private router:Router, private tokenService: TokenService) { }

  isLogged = false;
  ngOnInit(): void {
    if(this.tokenService.getToken()){
      this.isLogged=true;
    }else{
      this.isLogged = false;
    }
  }

  cargarLogo(): void {
    this.sLogo.lista().subscribe(data => { this.logo = data; })
  }

 

  onLogOut():void{
    this.tokenService.logOut();
    window.location.reload();
  }

  login(){
    this.router.navigate(['/login'])
  }
  delete(id?: number){
    if(id != undefined){
      this.sLogo.delete(id).subscribe(
        data => {
          this.cargarLogo();
        }, err => {
          alert("No se pudo borrar el logo");
        }
      )
      }

  }
}