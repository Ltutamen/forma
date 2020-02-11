package ua.axiom;

import java.util.ResourceBundle;

public class Viewer {
    private ResourceBundle resources;

    public Viewer(ResourceBundle resources) {
        this.resources = resources;
    }

    public void output(String msg) {
        System.out.println(msg);
    }

    public String getRegexHintMsg(String expectedRegex, String msgBase) {
        StringBuffer buffer = new StringBuffer();
        buffer.append(msgBase);
        buffer.append(", expected regex: ");
        buffer.append(expectedRegex);
        return buffer.toString();
    }
}
