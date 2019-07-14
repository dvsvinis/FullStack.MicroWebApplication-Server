import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { UserListComponent } from './components/user-list/user-list.component';
import { UserFormComponent } from './components/user-form/user-form.component';
import { UserService } from './services/user-service.service';
// import { VideoListComponent } from './components/video-list/video-list.component';
// import { VideoFormComponent } from './components/video-form/video-form.component';
// import { VideoService } from './services/video-service.service';
import { commentListComponent } from './components/comment-list/comment-list.component';
import { CommentFormComponent } from './components/comment-form/comment-form.component';
import { CommentService } from './services/comment-services.service';

@NgModule({
  declarations: [
    AppComponent,
    UserListComponent,
    UserFormComponent,
    // VideoListComponent,
    // VideoFormComponent,
    commentListComponent,
    CommentFormComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  // providers: [UserService, VideoService, CommentService],
  bootstrap: [AppComponent]
})
export class AppModule { }
