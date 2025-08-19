package com.wipro.userms.dto;

import com.wipro.userms.entity.User;

public class UserNotificationDTO {
    private User user;
    private String action; // Created, Updated, Deleted

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
