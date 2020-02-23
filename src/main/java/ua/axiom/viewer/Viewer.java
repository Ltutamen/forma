package ua.axiom.viewer;

import java.util.ResourceBundle;

public class Viewer {
    private ResourceBundle resources;

    public Viewer(ResourceBundle resources) {
        this.resources = resources;
    }

    public void output(String msg) {
        System.out.println(msg);
    }

    public void exceptionOutput(Exception e) {
        output(e.getLocalizedMessage());
    }

    public String getRegexHintMsg(String expectedRegex, String msgBase) {
        StringBuffer buffer = new StringBuffer();
        buffer.append(msgBase);
        buffer.append(", expected regex: ");
        buffer.append(expectedRegex);
        return buffer.toString();
    }
}
