package com.wipro.notifyms.dto;

import com.wipro.notifyms.entity.User;

public class UserNotificationDTO {
    private User user;
    private String action;

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public String getAction() { return action; }
    public void setAction(String action) { this.action = action; }
}
