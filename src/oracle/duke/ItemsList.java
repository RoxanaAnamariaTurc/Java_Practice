package oracle.duke;

import io.helidon.common.http.Http;
import io.helidon.webserver.Handler;
import io.helidon.webserver.ServerRequest;
import io.helidon.webserver.ServerResponse;

public class ItemsList implements Handler {
    private Clothing[] items;

    public ItemsList(Clothing[] items) {
        this.items = items;
    }

    @Override
    public void accept(ServerRequest req, ServerResponse res) {
        res.status(Http.Status.OK_200);
        res.headers().put("Content-Type", "text/plain; charset=UTF-8");
        StringBuilder result = new StringBuilder();
        for (Clothing item : items) {
            result.append(item + "\n");
        }
        res.send(result);
    }
}
