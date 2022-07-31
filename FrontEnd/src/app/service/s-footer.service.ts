import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Footer } from '../model/footer';

@Injectable({
  providedIn: 'root'
})
export class SFooterService {
  footerURL = 'https://backendedap.herokuapp.com/';

  constructor(private httpClient: HttpClient) { }

  public lista(): Observable<Footer[]>{
    return this.httpClient.get<Footer[]>(this.footerURL + 'lista');
  }

  public detail(id: number): Observable<Footer>{
    return this.httpClient.get<Footer>(this.footerURL + `detail/${id}`);
  } 

  public save(footer: Footer): Observable<any>{
    return this.httpClient.post<any>(this.footerURL + 'create', footer);
  }

  public update(id: number, footer: Footer): Observable<any>{
    return this.httpClient.put<any>(this.footerURL + `update/${id}`, footer);
  }

  public delete(id: number): Observable<any>{
    return this.httpClient.delete<any>(this.footerURL + `delete/${id}`);
  }
}