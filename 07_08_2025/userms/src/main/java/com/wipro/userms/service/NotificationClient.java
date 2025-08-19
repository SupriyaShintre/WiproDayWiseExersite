package com.wipro.userms.service;

import com.wipro.userms.dto.UserNotificationDTO;
import com.wipro.userms.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NotificationClient {

    @Autowired
    private RestTemplate restTemplate;

    public void notifyUser(User user, String action) {
        UserNotificationDTO dto = new UserNotificationDTO();
        dto.setUser(user);
        dto.setAction(action);

      //  restTemplate.postForObject("http://localhost:8082/notify", dto, Void.class);
    }
}
