package com.testshopp.beau.service.goods;

import org.springframework.stereotype.Service;

@Service
public class TestService {

    public void test(String value) {
        System.err.print(value);
    }
}