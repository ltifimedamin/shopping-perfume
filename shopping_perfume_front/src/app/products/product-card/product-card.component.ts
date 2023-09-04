import { Component, Input, OnInit } from '@angular/core';
import {MatButtonModule} from '@angular/material/button';
import {MatCardModule} from '@angular/material/card';

@Component({
  selector: 'app-product-card',
  templateUrl: './product-card.component.html',
  styleUrls: ['./product-card.component.css'],
  

})
export class ProductCardComponent implements OnInit {
  @Input() product:any;
ngOnInit(): void {
  console.log(this.product["id"]);
}
}
