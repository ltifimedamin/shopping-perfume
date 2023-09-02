import { Component, OnInit } from '@angular/core';
import { AppService } from './app.service';
import { HttpClient, HttpHandler } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'shopping_perfume_front';
  perfumes :any=[];
  companies:any=[];

  constructor (private service:AppService) {}

  ngOnInit(){
   this.service.getPerfumes().subscribe((resultat)=>{this.perfumes=resultat});
   this.service.getCompanies().subscribe((resultat)=>{this.companies=resultat})
  }
}

