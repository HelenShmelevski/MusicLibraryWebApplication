import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TableGenreComponent } from './table-genre.component';

describe('TableGenreComponent', () => {
  let component: TableGenreComponent;
  let fixture: ComponentFixture<TableGenreComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TableGenreComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TableGenreComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
