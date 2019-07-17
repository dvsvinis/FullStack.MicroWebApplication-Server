import { Component, OnInit } from '@angular/core';
import { Comment } from '../../model/comment';

import {CommentService} from "../../services/comment-service.service";

@Component({
  selector: 'app-comment-list',
  templateUrl: './comment-list.component.html',
  styleUrls: ['./comment-list.component.css']
})
export class commentListComponent implements OnInit {

  comments: Comment[];

  constructor(private commentServices: CommentService) {
  }

  ngOnInit() {
    this.commentServices.findAll().subscribe(data => {
      this.comments = data;
    });
  }
}
