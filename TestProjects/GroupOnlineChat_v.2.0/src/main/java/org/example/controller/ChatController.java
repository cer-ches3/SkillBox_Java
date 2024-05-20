package org.example.controller;



import org.apache.logging.log4j.util.Strings;
import org.example.dto.MessageDto;
import org.example.dto.MessageMapper;
import org.example.entity.Message;
import org.example.entity.User;
import org.example.repository.MessageRepository;
import org.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

@RestController
public class ChatController
{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private MessageRepository messageRepository;
    private MessageMapper messageMapper;



    @GetMapping("/init")
    public HashMap<String, Boolean> init()
    {
        HashMap<String, Boolean> response = new HashMap<>();

        Map<String, Boolean> result = new HashMap<>();
        String sessionId = RequestContextHolder.currentRequestAttributes().getSessionId();
        Optional<User> userOpt = userRepository.findBySessionId(sessionId);

        response.put("result", userOpt.isPresent());
        return response;
    }

    @PostMapping("/auth")
    public HashMap<String, Boolean> auth(@RequestParam String name)
    {
        HashMap<String, Boolean> response = new HashMap<>();
        String sessionId = RequestContextHolder.currentRequestAttributes().getSessionId();
        User user = new User();
        user.setName(name);
        user.setSessionId(sessionId);
        userRepository.save(user);
        response.put("result", true);
        return response;
    }

    @PostMapping("/message")
    public Map<String, Boolean> sendMessage(@RequestParam String message) {
        HashMap<String, Boolean> response = new HashMap<>();
        if (Strings.isEmpty(message)) {
            return Map.of("result", false);
        }
        String sessionId = RequestContextHolder.currentRequestAttributes().getSessionId();
        User user = userRepository.findBySessionId(sessionId).get();

        Message msg = new Message();
        msg.setUser(user);
        msg.setDateTime(LocalDateTime.now());
        msg.setMessage(message);
        messageRepository.saveAndFlush(msg);
        return Map.of("result", true);
    }

    @GetMapping("/message")
    public List<MessageDto> getMessagesList()
    {
        return messageRepository
                .findAll(Sort.by(Sort.Direction.ASC, "dateTime"))
                .stream()
                .map(message -> MessageMapper.map(message))
                .collect(Collectors.toList());
    }

    @GetMapping("/user")
    public HashMap<Integer, String> getUsersList()
    {
        return null;
    }

}

