import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListadoJugadoresComponent } from './listado-jugadores.component';

describe('ListadoJugadoresComponent', () => {
  let component: ListadoJugadoresComponent;
  let fixture: ComponentFixture<ListadoJugadoresComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListadoJugadoresComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ListadoJugadoresComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
