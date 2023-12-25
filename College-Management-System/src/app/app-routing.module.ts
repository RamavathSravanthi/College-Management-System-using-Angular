import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { FooterComponent } from './footer/footer.component';
import { LoginComponent } from './login/login.component';
import { AddStudentsComponent } from './add-students/add-students.component';
import { StudentsListComponent } from './students-list/students-list.component';
import { AdminHomeComponent } from './admin-home/admin-home.component';
import { AddFacultyComponent } from './add-faculty/add-faculty.component';
import { FacultyListComponent } from './faculty-list/faculty-list.component';
import { AboutUsComponent } from './about-us/about-us.component';
import { ContactComponent } from './contact/contact.component';
import { StudentdetailsComponent } from './studentdetails/studentdetails.component';
import { UpdatestudentComponent } from './updatestudent/updatestudent.component';
import { FacultyDetailsComponent } from './faculty-details/faculty-details.component';
import { UpdateFacultyComponent } from './update-faculty/update-faculty.component';
import { LoginOptionComponent } from './login-option/login-option.component';
import { StudentLoginComponent } from './student-login/student-login.component';
import { FacultyLoginComponent } from './faculty-login/faculty-login.component';
import { StudentportalComponent } from './studentportal/studentportal.component';
import { FacultyportalComponent } from './facultyportal/facultyportal.component';
import { StudentaboutComponent } from './studentabout/studentabout.component';
import { StudentcontactComponent } from './studentcontact/studentcontact.component';
import { FacultyaboutComponent } from './facultyabout/facultyabout.component';
import { FacultycontactComponent } from './facultycontact/facultycontact.component';
import { ViewfacultydetailsComponent } from './viewfacultydetails/viewfacultydetails.component';
import { StudentregisterComponent } from './studentregister/studentregister.component';
import { UpdatestudentbyfacultyComponent } from './updatestudentbyfaculty/updatestudentbyfaculty.component';
import { ViewstudentbyfacultyComponent } from './viewstudentbyfaculty/viewstudentbyfaculty.component';
import { ViewfacultybystudentComponent } from './viewfacultybystudent/viewfacultybystudent.component';

const routes: Routes = [
  {path:'home', component:HomeComponent},
  {path:'',redirectTo:'home',pathMatch:'full'},
  {path:'footer', component:FooterComponent},
  {path:'login', component:LoginComponent},
  {path:'add-students', component:AddStudentsComponent},
  {path:'students-list',component:StudentsListComponent},
  {path:'admin-home', component:AdminHomeComponent},
  {path:'add-faculty', component:AddFacultyComponent},
  {path:'faculty-list', component:FacultyListComponent},
  {path:'about-us', component:AboutUsComponent},
  {path:'contact' , component:ContactComponent},
  {path:'studentdetails/:id', component:StudentdetailsComponent},
  {path:'updatestudent/:id', component:UpdatestudentComponent},
  {path:'facultydetails/:id', component:FacultyDetailsComponent},
  {path:'updatefaculty/:id', component:UpdateFacultyComponent},
  {path:'loginoption', component:LoginOptionComponent},
  {path:'studentlogin', component:StudentLoginComponent},
  {path:'facultylogin', component:FacultyLoginComponent},
  {path:'studentportal', component:StudentportalComponent},
  {path:'facultyportal', component:FacultyportalComponent},
  {path:'studentabout' , component:StudentaboutComponent},
  {path:'studentcontact', component:StudentcontactComponent},
  {path:'facultyabout', component:FacultyaboutComponent},
  {path:'facultycontact', component:FacultycontactComponent},
  {path:'viewfacultydetails' , component:ViewfacultydetailsComponent},
  {path:'studentregister' , component:StudentregisterComponent},
  {path:'updatestudentbyfaculty/:id', component:UpdatestudentbyfacultyComponent},
  {path:'viewstudentbyfaculty/:id' , component:ViewstudentbyfacultyComponent},
  {path:'viewfacultybystudent' , component:ViewfacultybystudentComponent},

  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
