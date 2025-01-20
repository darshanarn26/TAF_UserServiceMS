package com.tekarch.TAFUserServiceMS.Service.Interface;

import com.tekarch.TAFUserServiceMS.Model.User;

public interface UserService
{
    User registerUser(User user);
    User loginUser(Long userId);
    void updateUser(Long userId,User user);
}
