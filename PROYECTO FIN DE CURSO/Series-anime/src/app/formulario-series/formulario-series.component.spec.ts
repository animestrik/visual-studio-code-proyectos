import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormularioSeriesComponent } from './formulario-series.component';

describe('FormularioSeriesComponent', () => {
  let component: FormularioSeriesComponent;
  let fixture: ComponentFixture<FormularioSeriesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FormularioSeriesComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FormularioSeriesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
