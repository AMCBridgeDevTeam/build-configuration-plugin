package com.amcbridge.jenkins.plugins.xstreamelements;

public class Platform {
    private String platformName;

    public Platform(String platformName) {
        this.platformName = platformName;
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    @Override
    public String toString() {
        return platformName;
    }
}
