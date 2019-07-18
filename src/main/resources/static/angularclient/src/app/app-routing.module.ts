import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UserListComponent } from './components/user-list/user-list.component';
import { UserFormComponent } from './components/user-form/user-form.component';
import { VideoListComponent } from './components/video-list/video-list.component';
import { VideoFormComponent } from './components/video-form/video-form.component';
import { commentListComponent } from './components/comment-list/comment-list.component';
import { CommentFormComponent } from './components/comment-form/comment-form.component';
import { UserComponent } from './components/user/user.component';
import { LoginComponent } from './components/login/login.component';
import { LogoutComponent } from './components/logout/logout.component';
import { AuthGoodService } from './services/auth-good.service';
import { AddUserComponent } from './components/add-user/add-user.component';

const routes: Routes = [

  { path: '', component: UserComponent,canActivate:[AuthGoodService] },
  { path: 'adduser', component: UserFormComponent },
  { path: 'login', component: LoginComponent },
  { path: 'logout', component: LogoutComponent },
  { path: 'login', component: LoginComponent },
  { path: 'users', component: UserListComponent },
  { path: 'logout', component: LogoutComponent,canActivate:[AuthGoodService] },
  { path: 'adduser', component: AddUserComponent,canActivate:[AuthGoodService]},
  { path: 'videos', component: VideoListComponent },
  { path: 'addvideo', component: VideoFormComponent },
  { path: 'comments', component: commentListComponent },
  { path: 'addcomments', component: CommentFormComponent,canActivate:[AuthGoodService]},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
