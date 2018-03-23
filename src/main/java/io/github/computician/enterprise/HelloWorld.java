package io.github.computician.enterprise;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HelloWorld {

    @JsonProperty("message")
    private String message;

    public HelloWorld(String message) {
        this.message = message;
    }

}