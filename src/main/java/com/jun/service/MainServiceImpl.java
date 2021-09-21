package com.jun.service;

import org.springframework.stereotype.Service;

@Service
public class MainServiceImpl implements MainService{
    @Override
    public String GetString() {
        return "AAAA";
    }
}
