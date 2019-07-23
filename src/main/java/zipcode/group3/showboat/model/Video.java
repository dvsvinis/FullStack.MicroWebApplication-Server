package zipcode.group3.showboat.model;

import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;

@Entity
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String filepath;
    private String datecreated;
    private String description;
    @Transient
    private transient MultipartFile file;

    public Video() { }

    public Video(String name, String filepath, String datecreated, String description, MultipartFile file) {
        this.name = name;
        this.filepath = filepath;
        this.datecreated = datecreated;
        this.description = description;
        this.file = file;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public String getDatecreated() {
        return datecreated;
    }

    public void setDatecreated(String datecreated) {
        this.datecreated = datecreated;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", filepath='" + filepath + '\'' +
                ", datecreated='" + datecreated + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
