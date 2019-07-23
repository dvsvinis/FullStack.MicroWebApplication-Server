package zipcode.group3.showboat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zipcode.group3.showboat.model.Video;
import zipcode.group3.showboat.repository.VideoRepository;

import java.util.List;

@Service
public class VideoService {

    private VideoRepository repository;
    private FileStorageService fileStorageService;
    @Autowired
    public VideoService(VideoRepository repository, FileStorageService fileStorageService) {
        this.repository = repository;
        this.fileStorageService = fileStorageService;
    }

    public Video create(Video video) {
        video = repository.save(video);
        fileStorageService.storeWithFileName(video.getFile(),video.getId().toString());
        return video;
    }

    public Video read(Long id) {
        return repository.findById(id).get();
    }
    public List<Video> readAll() {
        return repository.findAll();
    }

    public Video update(Long id, Video updatedVideo) {
        Video video = read(id);
        video.setName(updatedVideo.getName());
        video.setFilepath(updatedVideo.getFilepath());
        video.setDatecreated(updatedVideo.getDatecreated());
        video.setDescription(updatedVideo.getDescription());
        return repository.save(video);
    }

    public Boolean delete(Long id) {
        repository.deleteById(id);
        return true;
    }
}
