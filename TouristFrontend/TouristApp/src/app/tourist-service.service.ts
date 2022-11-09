import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Tourist } from './tourist';

import { Observable } from 'rxjs';

@Injectable()
export class TouristService {

  private usersUrl: string;
  private usersUrl2:string;

  constructor(private http: HttpClient) {
    this.usersUrl = 'http://localhost:8081/api/tourist/tourists';
    this.usersUrl2='http://localhost:8081/api/tourist/findtourists';
  }

  public findAll(): Observable<Tourist[]> {
    return this.http.get<Tourist[]>(this.usersUrl2);
  }

  public save(tourist:Tourist) {
    return this.http.post<Tourist>(this.usersUrl, tourist);
  }
}
