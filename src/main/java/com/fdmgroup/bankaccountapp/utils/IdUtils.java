package com.fdmgroup.bankaccountapp.utils;

import java.util.UUID;

public class IdUtils {

    private String generateId() {

        String uuid = String.valueOf(UUID.randomUUID());
        String id = uuid.replaceAll("_","");
        return id;
    }

    public String getId() {

        return generateId();
    }
}
