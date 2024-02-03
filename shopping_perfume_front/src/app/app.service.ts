import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'

@Injectable({
  providedIn: 'root'
})
export class AppService {

  constructor(private http:HttpClient) { } //cree instance de la classe 'HttpClient'
   getPerfumes() { 
    console.log("blabla");
    return this.http.get("http://localhost:8080/shoppingPerfume/perfumes") ;
  }
  getCompanies() {
    return this.http.get("http://localhost:8080/shoppingPerfume/companies")
  }

}
