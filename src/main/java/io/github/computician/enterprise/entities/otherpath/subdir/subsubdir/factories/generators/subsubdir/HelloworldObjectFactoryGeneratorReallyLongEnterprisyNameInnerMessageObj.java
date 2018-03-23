package io.github.computician.enterprise.entities.otherpath.subdir.subsubdir.factories.generators.subsubdir;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HelloworldObjectFactoryGeneratorReallyLongEnterprisyNameInnerMessageObj {

    @JsonProperty("inner_message")
    private String innerMessage;

    public HelloworldObjectFactoryGeneratorReallyLongEnterprisyNameInnerMessageObj(String message) {
        this.innerMessage = "Inside Voice" + message;;
    }
}