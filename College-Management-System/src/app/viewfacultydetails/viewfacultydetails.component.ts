import { Component, OnInit } from '@angular/core';
import { Faculty } from '../faculty';
import { FacultyService } from '../faculty.service';
import { ActivatedRoute, Router } from '@angular/router';
import { Student } from '../student';
import { StudentService } from '../student.service';

@Component({
  selector: 'app-viewfacultydetails',
  templateUrl: './viewfacultydetails.component.html',
  styleUrl: './viewfacultydetails.component.css'
})
export class ViewfacultydetailsComponent implements OnInit{

 
  students!:Student[];

  alldata!:Student[];

  studentsearch = "";
  
  constructor(private studentService:StudentService, private router:Router){

  }

  p:number = 1;
  count:number = 8;
  totalList:any;

  
  
  ngOnInit(): void {
    this.getStudents();
  }
  private getStudents() {
    this.studentService.getStudentsList().subscribe(data=>
      {
        this.students=data;
        this.totalList = data.length;
        this.alldata=data;
      });
  }

  studentDetails(id:number)
  {
    this.router.navigate(["viewstudentbyfaculty",id]);
  }

  updateStudent(id:number)
  {
    this.router.navigate(["updatestudentbyfaculty",id]);
  }

  deleteStudent(id:number)
  {
    this.studentService.deleteStudent(id).subscribe(data=>
      {
        console.log(data);
        this.getStudents();
      });
  }

  filterdata() {
    this. students= this.alldata. filter((p) =>
    {
      return p.lastName.toLowerCase().includes(this.studentsearch.toLowerCase());
    });
  }

}
