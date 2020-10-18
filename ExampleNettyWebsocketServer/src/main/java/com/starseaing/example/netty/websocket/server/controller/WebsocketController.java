package com.starseaing.example.netty.websocket.server.controller;

import com.starseaing.example.netty.websocket.server.handler.WebSocketServerHandler;
import io.netty.channel.Channel;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class WebsocketController {

    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");

    @GetMapping("/send-msg")
    public String sendMessage(@RequestParam String data) {
        for (Channel channel : WebSocketServerHandler.channels) {
            channel.writeAndFlush(new TextWebSocketFrame("[系统消息sendMessage]:"+ "  " + data));
        }
        return String.format("[%s] success", sdf.format(new Date()));
    }
}
