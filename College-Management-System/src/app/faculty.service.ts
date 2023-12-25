import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Faculty } from './faculty';

@Injectable({
  providedIn: 'root'
})
export class FacultyService {

  private baseURL="http://localhost:8080/api/faculty";

  constructor(private httpClient:HttpClient) { }

  getFacultysList():Observable<Faculty[]>
  {
    return this.httpClient.get<Faculty[]>(`${this.baseURL}`);
  }

  createFaculty(faculty:Faculty):Observable<Object>
  {
    return this.httpClient.post(`${this.baseURL}`,faculty);
  }

  getFacultyById(id:number):Observable<Faculty>
  {
    return this.httpClient.get<Faculty>(`${this.baseURL}/${id}`);
  }

  updateFaculty(id:number, student:Faculty):Observable<Object>
  {
    return this.httpClient.put(`${this.baseURL}/${id}`, student);
  }

  deleteFaculty(id:number):Observable<Object>
  {
    return this.httpClient.delete(`${this.baseURL}/${id}`);
  }

  getFacultyByEmail(email:string):Observable<Object>
  {
    return this.httpClient.get<Faculty>(`${this.baseURL}/${"email"}/${email}`);
  }

}
