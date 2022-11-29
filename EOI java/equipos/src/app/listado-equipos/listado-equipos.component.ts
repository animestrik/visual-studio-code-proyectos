import { BackendService } from './../services/backend.service';
import { Component, OnInit } from '@angular/core';
import Swal from 'sweetalert2';
import { registerLocaleData } from '@angular/common';
import localeEs from '@angular/common/locales/es';

@Component({
  selector: 'app-listado-equipos',
  templateUrl: './listado-equipos.component.html',
  styleUrls: ['./listado-equipos.component.css']
})
export class ListadoEquiposComponent implements OnInit {
  equipos:any;

  constructor(private backend:BackendService) { }

  ngOnInit(): void {
    registerLocaleData(localeEs);
    this.getEquipos();
  }

  getEquipos() {
    this.backend.getEquipos().subscribe((equipos) => {
      this.equipos = equipos;
      this.equipos = this.equipos.sort((a: any, b: any) => a.nombre.localeCompare(b.nombre));
      console.log(this.equipos);
    })
  }

  deleteEquipo(equipo:any) {
    this.backend.deleteEquipo(equipo.id).subscribe(() => {
      Swal.fire({
        icon: 'success',
        title: 'Registro borrado',
        text: `El equipo ${equipo.nombre} se ha borrado correctamente`
      });
      this.backend.getEquipos().subscribe((equipos) => {
        this.equipos = equipos;
      });
    });
  }
}
