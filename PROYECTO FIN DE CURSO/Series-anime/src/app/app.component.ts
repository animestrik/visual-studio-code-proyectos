import { Component } from '@angular/core';
import { BackendService } from './services/backend.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Series-anime';
  series:any;

  constructor(private backend: BackendService) { }

  ngOnInit(): void {

  }

  getSeries() {
    this.backend.getSeries().subscribe((series) => {
      this.series = series;
      this.series = this.series.sort((a: any, b: any) => a.nombre.localeCompare(b.nombre));
      console.log(this.series);
    })
  }

}
