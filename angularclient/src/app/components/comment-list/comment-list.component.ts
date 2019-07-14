import { Component, OnInit } from '@angular/core';
import { Comment } from '../../model/comment';

import {CommentService} from "../../services/comment-services.service";

@Component({
  selector: 'app-comment-list',
  templateUrl: './comment-list.component.html',
  styleUrls: ['./comment-list.component.css']
})
export class commentListComponent implements OnInit {

  comments: Comment[];

  constructor(private commentService: CommentService) {
  }

  ngOnInit() {
    this.commentService.findAll().subscribe(data => {
      this.comments = data;
    });
  }
}
