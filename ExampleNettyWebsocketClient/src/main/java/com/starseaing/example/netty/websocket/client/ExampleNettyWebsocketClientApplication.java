package com.starseaing.example.netty.websocket.client;

import com.starseaing.example.netty.websocket.client.client.WebSocketClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.URISyntaxException;

@SpringBootApplication
public class ExampleNettyWebsocketClientApplication {

    public static void main(String[] args) throws URISyntaxException, InterruptedException {
        SpringApplication.run(ExampleNettyWebsocketClientApplication.class, args);

        new WebSocketClient().start("ws://localhost:8088");

    }

}
