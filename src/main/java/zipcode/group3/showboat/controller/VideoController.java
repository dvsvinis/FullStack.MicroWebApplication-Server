package zipcode.group3.showboat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import zipcode.group3.showboat.model.Video;
import zipcode.group3.showboat.repository.VideoRepository;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
//@RequestMapping("/video")
public class VideoController {

    private VideoRepository videoRepository;

    @Autowired
    public VideoController(VideoRepository videoRepository) {
        this.videoRepository = videoRepository;
    }

    /**
     * returns a list of videos
     */
    @GetMapping("/video")
    public List<Video> videoList() {
        return (List<Video>) videoRepository.findAll();
    }

    /**
     * return a specific video
     * @param id - the primary key of the video as a path
     * @return a video matching that id
     */
    @RequestMapping(value = "video/{id}", method = RequestMethod.GET)
    public Video getVideo(@PathVariable Long id) {
        return videoRepository.getOne(id);
    }

    /**
     * Creates a new video from a json object
     * @param file - a video created from a json object in the Body of the request
     */
    @PostMapping("/video")
    @ResponseStatus(HttpStatus.OK)
    public void addVideo(@RequestParam("file") MultipartFile file,@RequestParam("name") String name,
                         @RequestParam("filepath") String filepath, @RequestParam("datecreated") String datecreated,
                         @RequestParam("description") String description) {
        Video video = new Video(name,filepath,datecreated,description,file);
        String fileName = file.getOriginalFilename();
        videoRepository.save(video);
    }
}
