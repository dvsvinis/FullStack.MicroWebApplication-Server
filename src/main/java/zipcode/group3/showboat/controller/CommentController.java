package zipcode.group3.showboat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import zipcode.group3.showboat.model.Comment;
import zipcode.group3.showboat.repository.commentRepository;

import java.util.List;

@RestController
public class CommentController {

    @Autowired
    private commentRepository commentRepository;

    @GetMapping
    public List<Comment> list() {
        return commentRepository.findAll();

    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Comment comments) {

    }

    @GetMapping("/{id}")
    public Comment get(@PathVariable("id")long id) {
        return commentRepository.getOne(id);
    }
}




