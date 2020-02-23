package ua.axiom.viewer;

import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

public class LocalisedMessageContainer {
    public enum Message {LOGIN_ERROR_MSG}
    private final Map<String, String> localizedMessagesMap = new HashMap<String, String>();

    public LocalisedMessageContainer(ResourceBundle resources) {
        try {
            for (Message message : Message.values()) {
                localizedMessagesMap.put(message.toString(), resources.getString(message.toString()));
            }


        } catch (NullPointerException npe) {
            System.err.println("No localisation data for entry");
            throw npe;
        }
    }

    public String getLocalisedMessage(String descriptor) {
        return localizedMessagesMap.get(descriptor);
    }
}
