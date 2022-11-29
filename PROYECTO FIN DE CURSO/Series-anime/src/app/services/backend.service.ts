import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

const SERVER = `http://localhost:8080/`

@Injectable({
  providedIn: 'root'
})
export class BackendService {

  constructor(private http: HttpClient) { }

  getSeries() {
    return this.http.get(`${SERVER}series`);
  }

  postSeries(series:any) {
    return this.http.post(`${SERVER}series`, series);
  }

  deleteSeries(id:number) {
    return this.http.delete(`${SERVER}series/${id}`);
  }
}
