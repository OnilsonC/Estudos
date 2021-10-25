import { CourseService } from './course.service';
import { Component, OnInit } from "@angular/core";
import { ActivatedRoute } from "@angular/router";
import { Course } from "./course";

@Component({
  templateUrl: './course-info-component.html'
})
export class CourseInfoComponent implements OnInit {

  courses!: Course;

  constructor(private activatedRoute: ActivatedRoute, private courseService: CourseService) {}

  ngOnInit(): void {
    this.courseService.retrieveById(+this.activatedRoute.snapshot.paramMap.get('id')!).subscribe({
      next: course => this.courses = course,
      error: err => console.log('Error', err)
    })
  }

  save(): void {
    this.courseService.save(this.courses).subscribe({
      next: courses => console.log('Saved success', this.courses),
      error: err => console.log('Error', err)
    })
  }

}
