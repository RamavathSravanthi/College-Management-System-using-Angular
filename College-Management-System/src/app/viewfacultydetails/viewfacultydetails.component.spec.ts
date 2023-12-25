import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewfacultydetailsComponent } from './viewfacultydetails.component';

describe('ViewfacultydetailsComponent', () => {
  let component: ViewfacultydetailsComponent;
  let fixture: ComponentFixture<ViewfacultydetailsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ViewfacultydetailsComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(ViewfacultydetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
