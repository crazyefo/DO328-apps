package io.vertx.example;

import io.vertx.core.Vertx;

public class HelloRedHatEmbedded {
  public static void main(String[] args) {
    Vertx.vertx().createHttpServer().requestHandler(req -> req.response().end("Hello Red Hat! eric 28th:wq!")).listen(8080);
  }
}
