package zipcode.group3.showboat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import zipcode.group3.showboat.model.Comment;
import zipcode.group3.showboat.repository.CommentRepository;


import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CommentController {


    private CommentRepository commentRepository;

    @Autowired
    public CommentController(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @GetMapping("/comments")
    public List<Comment> commentslist() {
        return (List<Comment>) commentRepository.findAll();


    }

    @PostMapping("/comments")
    @ResponseStatus(HttpStatus.OK)
    public void addComment(@RequestBody Comment comments) {
        commentRepository.save(comments);
    }

    @RequestMapping(value = "comments/{id}", method = RequestMethod.GET)
    public Comment getComment (@PathVariable Long id) {
        return commentRepository.getOne(id);
    }

    @GetMapping("/{id}")
    public Comment get(@PathVariable("id")long id) {
        return commentRepository.getOne(id);
    }
}




