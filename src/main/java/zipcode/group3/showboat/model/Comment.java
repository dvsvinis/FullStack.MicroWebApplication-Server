package zipcode.group3.showboat.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int videoid;
    private String comment;

    public Comment(int fkVideoId, String comment) {
        this.videoid = fkVideoId;
        this.comment = comment;
    }

    public Comment() {

    }

//    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "MM-dd-yyyy")
//    private DataFormat dateCreated;




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getFkVideoId() {
        return videoid;
    }

    public void setFkVideoId(int fkVideoId) {
        this.videoid = fkVideoId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

//    public DataFormat getDateCreated() {
//        return dateCreated;
//    }
//
//    public void setDateCreated(DataFormat dateCreated) {
//        this.dateCreated = dateCreated;
//    }


    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", fkVideoId=" + videoid +
                ", comment='" + comment + '\'' +
                '}';
    }
}

