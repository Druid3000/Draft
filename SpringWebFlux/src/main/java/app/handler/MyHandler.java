package app.handler;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.BodyInserters.fromValue;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Component
public class MyHandler {

    public static Mono<ServerResponse> handle(ServerRequest request){
        return ok().body(fromValue("My handler works!"));
    }
}
