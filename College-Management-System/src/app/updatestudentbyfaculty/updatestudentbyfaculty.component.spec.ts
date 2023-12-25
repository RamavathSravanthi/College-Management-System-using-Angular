import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdatestudentbyfacultyComponent } from './updatestudentbyfaculty.component';

describe('UpdatestudentbyfacultyComponent', () => {
  let component: UpdatestudentbyfacultyComponent;
  let fixture: ComponentFixture<UpdatestudentbyfacultyComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [UpdatestudentbyfacultyComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(UpdatestudentbyfacultyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
