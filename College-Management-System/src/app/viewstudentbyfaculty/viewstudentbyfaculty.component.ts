import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Student } from '../student';
import { StudentService } from '../student.service';

@Component({
  selector: 'app-viewstudentbyfaculty',
  templateUrl: './viewstudentbyfaculty.component.html',
  styleUrl: './viewstudentbyfaculty.component.css'
})
export class ViewstudentbyfacultyComponent implements OnInit{

  
  id!:number;
  student!:Student;
  constructor(private studentService:StudentService , private route:ActivatedRoute, private router:Router){

  }

  ngOnInit(): void {
    this.id=this.route.snapshot.params["id"];
    this.student=new Student();
    this.studentService["getStudentById"](this.id).subscribe((data:Student)=>
    {
      this.student=data;
    });
    
  }

}
