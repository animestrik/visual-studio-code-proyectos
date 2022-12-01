import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'filtrar'
})
export class FiltrarPipe implements PipeTransform {

  transform(value: any, args?: any): any {
    if (!value) return null;
    if (!args) return value;
    return value.filter(function (data: any) {
      return data.nombre.toLowerCase().includes(args);
    });
  }
}
