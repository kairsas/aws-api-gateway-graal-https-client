package aws.api.gateway.graal;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;

@Client("https://www.boredapi.com/api")
public interface BoredApiClient {
    @Get("/activity")
    BoredApiResponse getActivity();
}
