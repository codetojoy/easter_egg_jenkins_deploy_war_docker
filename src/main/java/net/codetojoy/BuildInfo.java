
package net.codetojoy;

import java.util.*;

public class BuildInfo {
    private final static String BUILD_BUNDLE = "build";
    private final static String BUILD_NUMBER = "build.number";
    private final static String BUILD_TIMESTAMP = "build.timestamp";
    private final static String VERSION = "version";

    private final ResourceBundle buildInfo;

    public BuildInfo() {
        buildInfo = ResourceBundle.getBundle(BUILD_BUNDLE);
    }

    public String getBuildNumber() {
        return buildInfo.getString(BUILD_NUMBER);
    }

    public String getBuildTimestamp() {
        return buildInfo.getString(BUILD_TIMESTAMP);
    }

    public String getVersion() {
        return buildInfo.getString(VERSION);
    }
}
