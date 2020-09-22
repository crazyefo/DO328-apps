package io.vertx.example;

import io.vertx.core.Vertx;


/**
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
public class HelloWorldEmbedded {

  public static void main(String[] args) {
    // Create an HTTP server which simply returns "Hello World!" to each request.
<<<<<<< HEAD
    Vertx.vertx().createHttpServer().requestHandler(req -> req.response().end("Hello World! eric1\n")).listen(8080);
=======
    Vertx.vertx().createHttpServer().requestHandler(req -> req.response().end("Hello World! from Erics PC\n")).listen(8080);
>>>>>>> 48ac8aa03a9bc7b86a2add9ead1d73c632eb7143
  }

}
