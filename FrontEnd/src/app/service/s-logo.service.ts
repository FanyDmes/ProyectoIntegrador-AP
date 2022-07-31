import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Logo } from '../model/logo';

@Injectable({
  providedIn: 'root'
})
export class SLogoService {
  expURL = 'https://backendedap.herokuapp.com/';

  constructor(private httpClient: HttpClient) { }

  public lista(): Observable<Logo[]>{
    return this.httpClient.get<Logo[]>(this.expURL + 'lista');
  }

  public detail(id: number): Observable<Logo>{
    return this.httpClient.get<Logo>(this.expURL + `detail/${id}`);
  } 

  public save(logo: Logo): Observable<any>{
    return this.httpClient.post<any>(this.expURL + 'create', logo);
  }

  public update(id: number, logo: Logo): Observable<any>{
    return this.httpClient.put<any>(this.expURL + `update/${id}`, logo);
  }

  public delete(id: number): Observable<any>{
    return this.httpClient.delete<any>(this.expURL + `delete/${id}`);
  }
}