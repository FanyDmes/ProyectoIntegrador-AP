import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Banner } from '../model/banner';

@Injectable({
  providedIn: 'root'
})
export class SBannerService {
  expURL = 'https://apbackended.herokuapp.com/';

  constructor(private httpClient: HttpClient) { }

  public lista(): Observable<Banner[]>{
    return this.httpClient.get<Banner[]>(this.expURL + 'lista');
  }

  public detail(id: number): Observable<Banner>{
    return this.httpClient.get<Banner>(this.expURL + `detail/${id}`);
  } 

  public save(banner: Banner): Observable<any>{
    return this.httpClient.post<any>(this.expURL + 'create', banner);
  }

  public update(id: number, banner: Banner): Observable<any>{
    return this.httpClient.put<any>(this.expURL + `update/${id}`, banner);
  }

  public delete(id: number): Observable<any>{
    return this.httpClient.delete<any>(this.expURL + `delete/${id}`);
  }
}