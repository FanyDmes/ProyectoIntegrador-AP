import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Acerca } from '../model/acerca';

@Injectable({
  providedIn: 'root'
})
export class SAcercaService {
  acercaURL = 'https://backendedap.herokuapp.com/';

  constructor(private httpClient: HttpClient) { }

  public lista(): Observable<Acerca[]>{
    return this.httpClient.get<Acerca[]>(this.acercaURL + 'lista');
  }

  public detail(id: number): Observable<Acerca>{
    return this.httpClient.get<Acerca>(this.acercaURL + `detail/${id}`);
  } 

  public save(acerca: Acerca): Observable<any>{
    return this.httpClient.post<any>(this.acercaURL + 'create', acerca);
  }

  public update(id: number, acerca: Acerca): Observable<any>{
    return this.httpClient.put<any>(this.acercaURL + `update/${id}`, acerca);
  }

  public delete(id: number): Observable<any>{
    return this.httpClient.delete<any>(this.acercaURL + `delete/${id}`);
  }
}