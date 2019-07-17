import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { VideoService } from '../../services/video-service.service';
import { Video } from '../../model/video';

@Component({
  selector: 'app-video-form',
  templateUrl: './video-form.component.html',
  styleUrls: ['./video-form.component.css']
})
export class VideoFormComponent {

  video: Video;

  constructor(private route: ActivatedRoute, private router: Router, private videoService: VideoService) {
    this.video = new Video();
  }

  onSubmit() {
    this.videoService.save(this.video).subscribe(result => this.gotoVideoList());
  }

  gotoVideoList() {
    this.router.navigate(['/video']);
  }
}
