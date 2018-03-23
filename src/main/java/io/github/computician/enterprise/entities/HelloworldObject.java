package io.github.computician.enterprise.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HelloworldObject {

    @JsonProperty("message")
    private String message;

    public HelloworldObject(String message) {
        this.message = message;
    }
}