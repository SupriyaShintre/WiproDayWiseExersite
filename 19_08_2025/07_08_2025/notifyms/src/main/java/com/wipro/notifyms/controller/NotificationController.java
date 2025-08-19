package com.wipro.notifyms.controller;

import com.wipro.notifyms.dto.UserNotificationDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class NotificationController {

    @PostMapping("/notify")
    @ResponseStatus(HttpStatus.OK)
    public void notify(@RequestBody UserNotificationDTO dto) {
        System.out.println("User " + dto.getUser().getUsername() + " information is " + dto.getAction());
    }
}
