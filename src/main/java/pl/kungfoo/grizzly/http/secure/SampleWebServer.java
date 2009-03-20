package pl.kungfoo.grizzly.http.secure;

import com.sun.grizzly.http.embed.GrizzlyWebServer;

import java.io.IOException;

/**
 * Sample web server.
 *
 * @author Hubert Iwaniuk
 */
public class SampleWebServer {
    public static void main(String[] args) throws IOException {
        // GWS without security
        GrizzlyWebServer gws = new GrizzlyWebServer(
            8888, "src/main/resources", false/*not secure*/);
        gws.start();
    }
}
