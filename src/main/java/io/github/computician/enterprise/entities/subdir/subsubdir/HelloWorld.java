package io.github.computician.enterprise.entities.subdir.subsubdir;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HelloWorld {

    @JsonProperty("message")
    private String message;

    public HelloWorld(String message) {
        this.message = message;
    }

}