package org.example.dto;


import org.example.entity.Message;

public class MessageMapper {

    public static MessageDto map(Message message) {
        MessageDto messageDto = new MessageDto();
        messageDto.setUsername(message.getUser().getName());
        messageDto.setDateTime(message.getDateTime().toString());
        messageDto.setText(message.getMessage());
        return messageDto;
    }
}
