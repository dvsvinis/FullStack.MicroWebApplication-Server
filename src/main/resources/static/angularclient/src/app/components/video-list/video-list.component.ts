import { Component, OnInit } from '@angular/core';
import { Video } from '../../model/video';
import { VideoService } from '../../services/video-service.service';

@Component({
  selector: 'app-video-list',
  templateUrl: './video-list.component.html',
  styleUrls: ['./video-list.component.css']
})
export class VideoListComponent implements OnInit {

  videos: Video[];

  constructor(private userService: VideoService) {
  }

  ngOnInit() {
    this.userService.findAll().subscribe(data => {
      this.videos = data;
    });
  }
}
