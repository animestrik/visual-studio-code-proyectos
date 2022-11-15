import { Component, OnInit } from '@angular/core';

import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-ciudad',
  templateUrl: './ciudad.component.html',
  styleUrls: ['./ciudad.component.css']
})

export class CiudadComponent implements OnInit {
  url = "https://api.openweathermap.org/data/2.5/weather?appid=36716e91288f48d1fb0d996c17c7ce73&lang=es&units=metric&q=Alicante";
  datos:any;

  constructor(private http:HttpClient) { }

  ngOnInit(): void {
    this.http.get(this.url).subscribe((datos) => {
      this.datos = datos;
    });
  }
}
