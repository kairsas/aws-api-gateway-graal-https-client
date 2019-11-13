package aws.api.gateway.graal;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;

@Controller("/")
public class ExampleController {
    private static final Logger LOG = LoggerFactory.getLogger(ExampleController.class);

    @Inject
    BoredApiClient boredApiClient;

    @Get("/ping")
    public String index() {
        String activity = boredApiClient.getActivity().activity;
        LOG.info("Got activity: {}", activity);
        return "{\"activity\":" + activity + "}";
    }
}
