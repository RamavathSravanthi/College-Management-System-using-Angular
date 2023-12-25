import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewfacultybystudentComponent } from './viewfacultybystudent.component';

describe('ViewfacultybystudentComponent', () => {
  let component: ViewfacultybystudentComponent;
  let fixture: ComponentFixture<ViewfacultybystudentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ViewfacultybystudentComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(ViewfacultybystudentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
