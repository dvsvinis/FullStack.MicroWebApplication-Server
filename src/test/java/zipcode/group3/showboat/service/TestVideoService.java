package zipcode.group3.showboat.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import zipcode.group3.showboat.ShowboatApplication;
import zipcode.group3.showboat.controller.VideoController;
import zipcode.group3.showboat.model.Video;
import zipcode.group3.showboat.repository.VideoRepository;

import java.util.Optional;

import static org.mockito.Mockito.*;


@RunWith(SpringRunner.class)
@ContextConfiguration(classes = ShowboatApplication.class)
public class TestVideoService {


    private VideoController controller;

    @MockBean
    private VideoService service;

    @Before
    public void setup() {
        this.controller = new VideoController(service);
    }

    @Test
    public void readTest() {
        Video expected = new Video(
                "New Video",
                null,
                null,
                null,
                null
        );
        Long givenId = 1L;
        BDDMockito.given(service.read(givenId))
                .willReturn(expected);

        //When
//        ArgumentCaptor<Optional> captor = ArgumentCaptor.forClass(Optional.class);
//        verify(repositoryMock, times(1)).findById(captor.capture());


        ResponseEntity<Video> response = controller.get(givenId);
        HttpStatus actual = response.getStatusCode();
        Video actualVideo = response.getBody();

        Assert.assertEquals(HttpStatus.OK, actual);
        Assert.assertEquals(expected, actualVideo);

    }



}
