package zipcode.group3.showboat.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int videoid;
    private String comment;

    public Comment() {
    }

    public Comment(String comment) {
        this.comment = comment;
    }

    public Comment(int videoid, String comment) {
        this.videoid = videoid;
        this.comment = comment;
    }

//    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "MM-dd-yyyy")
//    private DataFormat dateCreated;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getVideoid() {
        return videoid;
    }

    public void setVideoid(int videoid) {
        this.videoid = videoid;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", videoid=" + videoid +
                ", comment='" + comment + '\'' +
                '}';
    }

}

