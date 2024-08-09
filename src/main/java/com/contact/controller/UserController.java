package com.contact.controller;

import com.contact.entity.User;
import com.contact.service.ContactService;
import com.contact.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
   @Autowired
   private UserService userService;
   @Autowired
   private ContactService contactService;

   @GetMapping("/{userId}")
   public User getUser(@PathVariable("userId") Long userId){
      User user = this.userService.getUser(userId);
      List contact = contactService.getContactsofUser(userId);
      user.setContacts(contact);
       return user;
   }

}
