import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HyS } from '../model/hys';

@Injectable({
  providedIn: 'root'
})
export class SHySService {
  expURL = 'http://localhost:8080/hys/';

  constructor(private httpClient: HttpClient) { }

  public lista(): Observable<HyS[]>{
    return this.httpClient.get<HyS[]>(this.expURL + 'lista');
  }

  public detail(id: number): Observable<HyS>{
    return this.httpClient.get<HyS>(this.expURL + `detail/${id}`);
  } 

  public save(hys: HyS): Observable<any>{
    return this.httpClient.post<any>(this.expURL + 'create', hys);
  }

  public update(id: number, hys: HyS): Observable<any>{
    return this.httpClient.put<any>(this.expURL + `update/${id}`, hys);
  }

  public delete(id: number): Observable<any>{
    return this.httpClient.delete<any>(this.expURL + `delete/${id}`);
  }
}