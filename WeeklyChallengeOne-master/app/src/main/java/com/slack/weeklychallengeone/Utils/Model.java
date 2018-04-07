package com.slack.weeklychallengeone.Utils;

public class Model {
    private String name,desc;

    public Model(String name,String desc) {
        this.name = name; this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
