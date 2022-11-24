import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { ListadoEquiposComponent } from './listado-equipos/listado-equipos.component';
import { FormularioEquipoComponent } from './formulario-equipo/formulario-equipo.component';
import { FormsModule } from '@angular/forms';
import { Route, RouterModule } from '@angular/router';
import { FormularioJugadorComponent } from './formulario-jugador/formulario-jugador.component';
import { ListadoJugadoresComponent } from './listado-jugadores/listado-jugadores.component';
import { ImageCropperModule } from 'ngx-image-cropper';

const APP_ROUTES: Route[] = [
  { path: '', component: ListadoEquiposComponent },
  { path: 'listado-equipos', component: ListadoEquiposComponent },
  { path: 'insertar-equipo', component: FormularioEquipoComponent },
  { path: 'listado-jugadores', component: ListadoJugadoresComponent },
  { path: 'insertar-jugador', component: FormularioJugadorComponent },
];

@NgModule({
  declarations: [
    AppComponent,
    ListadoEquiposComponent,
    FormularioEquipoComponent,
    FormularioJugadorComponent,
    ListadoJugadoresComponent
  ],
  imports: [
    RouterModule.forRoot(APP_ROUTES, { initialNavigation: 'enabledBlocking', onSameUrlNavigation: 'reload' }),
    BrowserModule,
    HttpClientModule,
    FormsModule,
    ImageCropperModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
