import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ButtonChangeComponent } from './button-change.component';

describe('ButtonChangeComponent', () => {
  let component: ButtonChangeComponent;
  let fixture: ComponentFixture<ButtonChangeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ButtonChangeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ButtonChangeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
