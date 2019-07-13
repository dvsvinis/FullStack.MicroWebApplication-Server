package zipcode.group3.showboat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import zipcode.group3.showboat.model.Video;
import zipcode.group3.showboat.repository.VideoRepository;

import java.util.List;

@RestController
//@RequestMapping("/video")
public class VideoController {

    @Autowired
    private VideoRepository videoRepository;

    /**
     * returns a list of videos
     */
    @GetMapping("/video")
    public List<Video> list() {
        return videoRepository.findAll();
    }

    /**
     * return a specific video
     * @param id - the primary key of the video as a path
     * @return a video matching that id
     */
    @RequestMapping(value = "video/{id}", method = RequestMethod.GET)
    public Video get(@PathVariable Long id) {
        return videoRepository.getOne(id);
    }

    /**
     * Creates a new video from a json object
     * @param video - a video created from a json object in the Body of the request
     */
    @PutMapping("video")
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Video video) {
        videoRepository.save(video);
    }
}
