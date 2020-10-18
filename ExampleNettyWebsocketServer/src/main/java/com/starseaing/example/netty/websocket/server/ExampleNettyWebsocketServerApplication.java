package com.starseaing.example.netty.websocket.server;

import com.starseaing.example.netty.websocket.server.server.WebSocketServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExampleNettyWebsocketServerApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ExampleNettyWebsocketServerApplication.class, args);

        new WebSocketServer().run(8088);
    }

}
