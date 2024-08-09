package com.contact.service;


import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{

    List<Contact> list = List.of(
            new Contact(1L, "ramesh@gmail.com","Ramesh",1311L),
            new Contact(2L, "suresh@gmail.com","Sures",1312L),
            new Contact(3L, "shalini@gmail.com","Shalini",1313L),
            new Contact(4L, "Kush@gmail.com","Kush",1313L)
    );
    @Override
    public List<Contact> getContactsofUser(Long userId) {
        return list.stream().filter(contact-> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
