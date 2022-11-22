import { BackendService } from './../services/backend.service';
import { Component, OnInit } from '@angular/core';
import { switchAll } from 'rxjs';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-formulario-equipo',
  templateUrl: './formulario-equipo.component.html',
  styleUrls: ['./formulario-equipo.component.css']
})
export class FormularioEquipoComponent implements OnInit {
  equipo = {
    nombre: "",
    ciudad: "",
    fechaCreacion: ""
  }

  constructor(private backend:BackendService) { }

  ngOnInit(): void {
  }

  postEquipo() {
    this.backend.postEquipos(this.equipo).subscribe(() => {
      Swal.fire({
        icon: 'success',
        title: 'Registro guardado',
        text: `El equipo ${this.equipo.nombre} se ha guardado correctamente`
      }).then(() => {
        location.reload();
      });
    });
  }
}
