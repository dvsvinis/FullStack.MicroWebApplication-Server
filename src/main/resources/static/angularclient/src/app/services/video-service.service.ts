import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { Video } from '../model/video';
import { Observable } from 'rxjs';

@Injectable()
export class VideoService {

  private videoUrl: string;

  constructor(private http: HttpClient) {
    this.videoUrl = 'http://localhost:8080/video';
  }

  public findAll(): Observable<Video[]> {
    return this.http.get<Video[]>(this.videoUrl);
  }

  public save(video: Video) {
    return this.http.post<Video>(this.videoUrl, video);
  }
}
