package zipcode.group3.showboat.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javafx.scene.input.DataFormat;

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
    private Long fkVideoId;
    private String comment;

//    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "MM-dd-yyyy")
//    private DataFormat dateCreated;
//
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFkVideoId() {
        return fkVideoId;
    }

    public void setFkVideoId(Long fkVideoId) {
        this.fkVideoId = fkVideoId;
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
}

