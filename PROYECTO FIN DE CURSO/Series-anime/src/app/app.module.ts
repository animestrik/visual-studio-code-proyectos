import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { ListadoSeriesComponent } from './listado-series/listado-series.component';
import { FormularioSeriesComponent } from './formulario-series/formulario-series.component';
import { Route, RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { ImageCropperModule } from 'ngx-image-cropper';
import { NgbModule, NgbPopoverModule } from '@ng-bootstrap/ng-bootstrap';

const APP_ROUTES: Route[] = [

  { path: '', component: ListadoSeriesComponent },
  { path: 'listado-series', component: ListadoSeriesComponent },
  { path: 'insertar-series', component: FormularioSeriesComponent },
];

@NgModule({
  declarations: [
    AppComponent,
    ListadoSeriesComponent,
    FormularioSeriesComponent
  ],
  imports: [
    RouterModule.forRoot(APP_ROUTES, { initialNavigation: 'enabledBlocking', onSameUrlNavigation: 'reload' }),
    BrowserModule,
    HttpClientModule,
    FormsModule,
    ImageCropperModule,
    NgbModule,
    NgbPopoverModule,

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
