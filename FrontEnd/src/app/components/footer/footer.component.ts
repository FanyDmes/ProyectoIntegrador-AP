import { Component, OnInit } from '@angular/core';
import { SFooterService } from 'src/app/service/s-footer.service';
import { Footer } from 'src/app/model/footer';
import { TokenService } from 'src/app/service/token.service';


@Component({
  selector: 'app-footer',
  templateUrl: './footer.component.html',
  styleUrls: ['./footer.component.css']
})
export class FooterComponent implements OnInit {
footer: Footer[] = [];
  constructor(private sFooter: SFooterService, private tokenService: TokenService ) { }

  isLogged = false;

  ngOnInit(): void {
    this.cargarFooter();
    if (this.tokenService.getToken()) {
      this.isLogged = true;
    } else {
      this.isLogged = false;
    }
  }

  cargarFooter(): void {
    this.sFooter.lista().subscribe(data => { this.footer = data; })
  }

  delete(id?: number){
    if(id != undefined){
      this.sFooter.delete(id).subscribe(
        data => {
          this.cargarFooter();
        }, err => {
          alert("No se pudo borrar");
        }
      )
    }
  }
}