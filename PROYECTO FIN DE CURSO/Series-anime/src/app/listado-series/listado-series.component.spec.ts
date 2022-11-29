import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListadoSeriesComponent } from './listado-series.component';

describe('ListadoSeriesComponent', () => {
  let component: ListadoSeriesComponent;
  let fixture: ComponentFixture<ListadoSeriesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListadoSeriesComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ListadoSeriesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
