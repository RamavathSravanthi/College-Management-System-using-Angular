import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Faculty } from '../faculty';
import { FacultyService } from '../faculty.service';

@Component({
  selector: 'app-viewfacultybystudent',
  templateUrl: './viewfacultybystudent.component.html',
  styleUrl: './viewfacultybystudent.component.css'
})
export class ViewfacultybystudentComponent implements OnInit {

  
  facultys!:Faculty[];
  alldata!:Faculty[];

  facultysearch = "";
  

  constructor(private facultyService:FacultyService , private router:Router){

  }

  p:number = 1;
  count:number = 8;
  totalList:any;


  ngOnInit(): void {
   this.getFacultys();
  }
  private getFacultys() {
    this.facultyService.getFacultysList().subscribe((data)=>
      {
        this.facultys=data;
        this.alldata=data;
        this.totalList = data.length;
      });
  }



  filterdata() {
    this.facultys = this.alldata. filter((p) =>
    {
      return p.lastName.toLowerCase().includes(this.facultysearch.toLowerCase());
    });
  }

}
