package io.github.computician.enterprise.entities.subdir.subsubdir;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.computician.enterprise.entities.otherpath.subdir.subsubdir.factories.generators.subsubdir.HelloworldObjectFactoryGeneratorReallyLongEnterprisyNameInnerMessageObj;

public class HelloworldObjectFactoryGeneratorReallyLongEnterprisyName {

    @JsonProperty("message")
    private String message;
    @JsonProperty("inner")
    private HelloworldObjectFactoryGeneratorReallyLongEnterprisyNameInnerMessageObj obj;

    public HelloworldObjectFactoryGeneratorReallyLongEnterprisyName(String message) {
        this.message = message;
        this.obj = new HelloworldObjectFactoryGeneratorReallyLongEnterprisyNameInnerMessageObj(message);
    }

}