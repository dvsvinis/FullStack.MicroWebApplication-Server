import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UserListComponent } from './components/user-list/user-list.component';
import { UserFormComponent } from './components/user-form/user-form.component';
import { VideoListComponent } from './components/video-list/video-list.component';
import { VideoFormComponent } from './components/video-form/video-form.component';
import { commentListComponent } from './components/comment-list/comment-list.component';
import { CommentFormComponent } from './components/comment-form/comment-form.component';

const routes: Routes = [
  { path: 'users', component: UserListComponent },
  { path: 'adduser', component: UserFormComponent },
  { path: 'videos', component: VideoListComponent },
  { path: 'addvideo', component: VideoFormComponent },
  { path: 'comments', component: commentListComponent },
  { path: 'addcomments', component: CommentFormComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
