import { style } from "@angular/animations";
import { Component, OnInit } from "@angular/core";
import { Course } from "./course";

@Component ({
    selector: 'app-course-list',
    templateUrl: './course-list.component.html',
    styleUrls: ['./course-list.component.css']
})
export class CourseListComponent implements OnInit{

  courses: Course[] = [];

  ngOnInit(): void {
    this.courses = [
        {
        id: 1,
        name: 'Angular: Forms',
        imageUrl: '/assets/images/forms.png',
        price: 100.00,
        code: 'AFO01',
        duration: 80,
        rating: 4,
        releaseDate: 'Octuber, 7, 2021'
      },
      {
        id: 2,
        name: 'Angular: HTML',
        imageUrl: '/assets/images/http.png',
        price: 130.00,
        code: 'AHTMLO01',
        duration: 100,
        rating: 5,
        releaseDate: 'November, 3, 2021'
     }
   ]
  }
}
