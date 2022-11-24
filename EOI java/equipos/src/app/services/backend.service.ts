import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

const SERVER = `http://localhost:8080/`;

@Injectable({
  providedIn: 'root'
})
export class BackendService {

  constructor(private http: HttpClient) { }

  getEquipos () {
    return this.http.get(`${SERVER}equipos`);
  }

  postEquipos(equipo:any) {
    return this.http.post(`${SERVER}equipos`, equipo)
  }

  deleteEquipo(id:number) {
    return this.http.delete(`${SERVER}equipos/${id}`);
  }
  getjugadores () {
    return this.http.get(`${SERVER}jugadores?equipo=4`);
  }

  postjugadores(jugador:any) {
    return this.http.post(`${SERVER}jugadores`, jugador)
  }

  deletejugador(id:number) {
    return this.http.delete(`${SERVER}jugador/${id}`);
  }
}
