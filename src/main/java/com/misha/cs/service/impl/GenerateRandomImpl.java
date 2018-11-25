package com.misha.cs.service.impl;

import org.springframework.stereotype.Service;
import com.misha.cs.service.GenerateRandom;

@Service
public class GenerateRandomImpl implements GenerateRandom {

    private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    @Override
    public String generateRandomString(int count) {

        StringBuilder builder = new StringBuilder();

        while (count-- != 0) {
            int character = (int) (Math.random() * ALPHA_NUMERIC_STRING.length());
            builder.append(ALPHA_NUMERIC_STRING.charAt(character));
        }
        return builder.toString();
    }

    @Override
    public boolean generateRandomBoolean() {
        return Math.random() < 0.5;
    }

    @Override
    public long generateRandomLong() {
        return (long)(Math.random() * 500000000 + 1);
    }
}
