package com.tencent.shadow.core.pluginmanager.installplugin;

public class PartInfo {

    public String filePath;

    public boolean isInterface;

    public PartInfo(String filePath, boolean isInterface) {
        this.filePath = filePath;
        this.isInterface = isInterface;
    }
}