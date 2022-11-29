import { BackendService } from './../services/backend.service';
import { Component, OnInit } from '@angular/core';
import { switchAll } from 'rxjs';
import Swal from 'sweetalert2';
import { ImageCroppedEvent, LoadedImage } from 'ngx-image-cropper';

@Component({
  selector: 'app-formulario-series',
  templateUrl: './formulario-series.component.html',
  styleUrls: ['./formulario-series.component.css']
})
export class FormularioSeriesComponent implements OnInit {
  series = {
    nombre: "",
    imagen: "",
    tipo: "",
    sinopsis: "",
    fecha_inicio: ""
  }

  imageChangedEvent: any = '';
  croppedImage: any = '';

  constructor(private backend: BackendService) { }

  ngOnInit(): void {
  }

  postSeries() {
    this.backend.postSeries(this.series).subscribe(() => {
      Swal.fire({
        icon: 'success',
        title: 'Registro guardado',
        text: `El anime ${this.series.nombre} se ha guardado correctamente`
      }).then(() => {
        location.reload();
      });
    });
  }

  fileChangeEvent(event: any): void {
    this.imageChangedEvent = event;
  }

  imageCropped(event: ImageCroppedEvent) {
    this.croppedImage = event.base64;
    this.series.nombre = this.croppedImage;
  }

}
