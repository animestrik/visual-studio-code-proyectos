import { ListadoEquiposComponent } from './../listado-equipos/listado-equipos.component';
import { Component, OnInit } from '@angular/core';
import Swal from 'sweetalert2';
import { BackendService } from '../services/backend.service';

@Component({
  selector: 'app-listado-jugadores',
  templateUrl: './listado-jugadores.component.html',
  styleUrls: ['./listado-jugadores.component.css']
})
export class ListadoJugadoresComponent implements OnInit {
  jugadores:any;

  constructor(private backend:BackendService) { }

  ngOnInit(): void {
    this.getJugadores();
  }

  getJugadores() {
    this.backend.getjugadores().subscribe((jugadores) => {
      this.jugadores = jugadores;
      this.jugadores = this.jugadores.sort((a: any, b: any) => a.nombre.localeCompare(b.nombre));
      console.log(this.jugadores);
    })
  }

  deleteJugadores(jugador:any) {
    Swal.fire({
      icon: 'question',
      title: '¿Estás seguro?',
      showCancelButton: true,
      cancelButtonText: 'Cancelar',
    }).then((result) => {
      if (result.isConfirmed) {
        this.backend.deletejugador(jugador.id).subscribe(() => {
          this.getJugadores();
          Swal.fire({
            icon: 'success',
            title: `El jugador '${jugador.nombre}' se ha borrado correctamente`
          })
        });
      }
    })
  }

}
