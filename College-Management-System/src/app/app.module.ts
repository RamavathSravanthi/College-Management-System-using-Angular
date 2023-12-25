import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { HomeComponent } from './home/home.component';
import { MatToolbarModule } from '@angular/material/toolbar';
import { HttpClientModule } from '@angular/common/http';
import { ReactiveFormsModule,FormsModule } from '@angular/forms';
import { MatButtonModule } from '@angular/material/button';
import { MatInputModule } from '@angular/material/input';
import { MatFormFieldModule } from "@angular/material/form-field";
import { MatIconModule } from "@angular/material/icon";
import { FooterComponent } from './footer/footer.component';
import { LoginComponent } from './login/login.component';
import { AddStudentsComponent } from './add-students/add-students.component';
import { StudentsListComponent } from './students-list/students-list.component';
import { AddFacultyComponent } from './add-faculty/add-faculty.component';
import { FacultyListComponent } from './faculty-list/faculty-list.component';
import { LogoutComponent } from './logout/logout.component';
import { AdminHomeComponent } from './admin-home/admin-home.component';
import { AboutUsComponent } from './about-us/about-us.component';
import { ContactComponent } from './contact/contact.component';
import { StudentdetailsComponent } from './studentdetails/studentdetails.component';
import { UpdatestudentComponent } from './updatestudent/updatestudent.component';
import { FacultyDetailsComponent } from './faculty-details/faculty-details.component';
import { UpdateFacultyComponent } from './update-faculty/update-faculty.component';
import { StudentLoginComponent } from './student-login/student-login.component';
import { FacultyLoginComponent } from './faculty-login/faculty-login.component';
import { LoginOptionComponent } from './login-option/login-option.component';
import { StudentportalComponent } from './studentportal/studentportal.component';
import { FacultyportalComponent } from './facultyportal/facultyportal.component';
import { StudentaboutComponent } from './studentabout/studentabout.component';
import { FacultyaboutComponent } from './facultyabout/facultyabout.component';
import { FacultycontactComponent } from './facultycontact/facultycontact.component';
import { StudentcontactComponent } from './studentcontact/studentcontact.component';
import { ViewfacultydetailsComponent } from './viewfacultydetails/viewfacultydetails.component';
import { NgxPaginationModule } from 'ngx-pagination';
import { StudentregisterComponent } from './studentregister/studentregister.component';
import { UpdatestudentbyfacultyComponent } from './updatestudentbyfaculty/updatestudentbyfaculty.component';
import { ViewstudentbyfacultyComponent } from './viewstudentbyfaculty/viewstudentbyfaculty.component';
import { ViewfacultybystudentComponent } from './viewfacultybystudent/viewfacultybystudent.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    FooterComponent,
    LoginComponent,
    AddStudentsComponent,
    StudentsListComponent,
    AddFacultyComponent,
    FacultyListComponent,
    LogoutComponent,
    AdminHomeComponent,
    AboutUsComponent,
    ContactComponent,
    StudentdetailsComponent,
    UpdatestudentComponent,
    FacultyDetailsComponent,
    UpdateFacultyComponent,
    StudentLoginComponent,
    FacultyLoginComponent,
    LoginOptionComponent,
    StudentportalComponent,
    FacultyportalComponent,
    StudentaboutComponent,
    FacultyaboutComponent,
    FacultycontactComponent,
    StudentcontactComponent,
    ViewfacultydetailsComponent,
    StudentregisterComponent,
    UpdatestudentbyfacultyComponent,
    ViewstudentbyfacultyComponent,
    ViewfacultybystudentComponent,
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule,
    FontAwesomeModule,
    BrowserAnimationsModule,
    MatToolbarModule ,
    HttpClientModule,
    MatFormFieldModule,
    ReactiveFormsModule,
    FormsModule,
    MatButtonModule,
    MatInputModule,
    MatIconModule,
    NgxPaginationModule ,
    
  
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
