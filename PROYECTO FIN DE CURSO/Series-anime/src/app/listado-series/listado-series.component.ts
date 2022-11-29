import { BackendService } from './../services/backend.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-listado-series',
  templateUrl: './listado-series.component.html',
  styleUrls: ['./listado-series.component.css']
})
export class ListadoSeriesComponent implements OnInit {
  series:any;

  constructor(private backend: BackendService) { }

  ngOnInit(): void {
    this.backend.getSeries().subscribe((series) => {
      this.series = series;
      console.log(this.series);
    })
  }

}
