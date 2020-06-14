package com.vigour.vigourserver.controllers;

import com.vigour.vigourserver.models.ChatEvent;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

@Controller
public class PrivateChatController {

    @MessageMapping("/chat/privateMessage")
    @SendTo("/topic/private")
    public ChatEvent sendPrivateMessage(@Payload ChatEvent chatEvent) {
        return chatEvent;
    }

    @MessageMapping("/chat/addUser")
    @SendTo("/topic/private")
    public ChatEvent addPrivateUser(@Payload ChatEvent chatEvent, SimpMessageHeaderAccessor headerAccessor) {
        headerAccessor.getSessionAttributes().put("private-user", chatEvent.getOwner());
        return chatEvent;
    }
}
