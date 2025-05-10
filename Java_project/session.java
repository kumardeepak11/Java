import java.util.HashMap;
import java.util.Map;

public class session {
    private String sessionId;
    private Map<String, Object> attributes;

    // Constructor to initialize session with a unique ID
    public session(String sessionId) {
        this.sessionId = sessionId;
        this.attributes = new HashMap<>();
    }

    // Method to get the session ID
    public String getSessionId() {
        return sessionId;
    }

    // Method to set an attribute in the session
    public void setAttribute(String key, Object value) {
        attributes.put(key, value);
    }

    // Method to get an attribute from the session
    public Object getAttribute(String key) {
        return attributes.get(key);
    }

    // Method to remove an attribute from the session
    public void removeAttribute(String key) {
        attributes.remove(key);
    }

    // Method to clear all attributes in the session
    public void clearSession() {
        attributes.clear();
    }

    // Method to check if the session contains a specific attribute
    public boolean containsAttribute(String key) {
        return attributes.containsKey(key);
    }
}