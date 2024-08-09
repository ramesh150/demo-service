package com.contact.service;

import com.contact.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    // Sample data to return
    List<User> list = List.of(
      new User(1311L,"Ramesh", "2545856"),
      new User(1312L,"Suresh", "2545857"),
      new User(1313L,"Shalu", "29095857")
    );
    @Override
    public User getUser(Long id) {
        return this.list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
