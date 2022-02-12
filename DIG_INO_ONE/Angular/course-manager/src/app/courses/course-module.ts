import { ReplacePipe } from '../pipe/replace.pipe';
import { RouterModule } from '@angular/router';
import { NgModule } from "@angular/core";
import { CourseInfoComponent } from './course-info-component';
import { CourseListComponent } from './course-list.component';
import { starComponent } from '../star/star-component';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    CourseListComponent,
    CourseInfoComponent,
    starComponent,
    ReplacePipe
  ],
  imports: [
    FormsModule,
    CommonModule,
    RouterModule.forChild([
      {
        path: 'courses', component: CourseListComponent
      },
      {
        path: 'courses/info/:id', component: CourseInfoComponent
      }
    ])
  ]
})
export class CourseModule {

}
