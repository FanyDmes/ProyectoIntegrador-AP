import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Footer } from '../model/footer';

@Injectable({
  providedIn: 'root'
})
export class SFooterService {
  expURL = 'http://localhost:8080/footer/';

  constructor(private httpClient: HttpClient) { }

  public lista(): Observable<Footer[]>{
    return this.httpClient.get<Footer[]>(this.expURL + 'lista');
  }

  public detail(id: number): Observable<Footer>{
    return this.httpClient.get<Footer>(this.expURL + `detail/${id}`);
  } 

  public save(footer: Footer): Observable<any>{
    return this.httpClient.post<any>(this.expURL + 'create', footer);
  }

  public update(id: number, footer: Footer): Observable<any>{
    return this.httpClient.put<any>(this.expURL + `update/${id}`, footer);
  }

  public delete(id: number): Observable<any>{
    return this.httpClient.delete<any>(this.expURL + `delete/${id}`);
  }
}