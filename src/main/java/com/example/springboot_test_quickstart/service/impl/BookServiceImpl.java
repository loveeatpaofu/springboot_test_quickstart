package com.example.springboot_test_quickstart.service.impl;

import com.example.springboot_test_quickstart.service.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Override
    public void save() {
        System.out.println("book service is running...");
    }
}
