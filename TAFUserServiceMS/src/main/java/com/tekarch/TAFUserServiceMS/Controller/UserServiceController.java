package com.tekarch.TAFUserServiceMS.Controller;

import com.tekarch.TAFUserServiceMS.Model.User;
import com.tekarch.TAFUserServiceMS.Service.Interface.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserServiceController
{
    @Autowired
   private UserService userservice;

    @PostMapping("/register")
    public ResponseEntity<User>  registerUser(@RequestBody User user)
    {
        User registeredUser=userservice.registerUser(user);
        return ResponseEntity.ok(registeredUser);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<User> loginUser(@PathVariable("userid") Long userid)
    {
        User user=userservice.loginUser(userid);
        return ResponseEntity.ok(user);
    }

    @PutMapping("/userId")
    public ResponseEntity<Void> updateUser(@RequestBody User user , @PathVariable("userId") Long userId)
    {
             userservice.updateUser(userId,user);
             return ResponseEntity.noContent().build();
    }
}
