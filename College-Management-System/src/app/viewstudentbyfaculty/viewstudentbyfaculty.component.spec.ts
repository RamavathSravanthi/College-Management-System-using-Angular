import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewstudentbyfacultyComponent } from './viewstudentbyfaculty.component';

describe('ViewstudentbyfacultyComponent', () => {
  let component: ViewstudentbyfacultyComponent;
  let fixture: ComponentFixture<ViewstudentbyfacultyComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ViewstudentbyfacultyComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(ViewstudentbyfacultyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
