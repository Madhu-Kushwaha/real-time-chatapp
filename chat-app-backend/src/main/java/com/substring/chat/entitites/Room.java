package com.substring.chat.entitites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;
@Document(collection = "rooms")
public class Room {
    public Room() {
    }

    public Room(String id, String roomId, List<Message> messages) {
        this.id = id;
        this.roomId = roomId;
        this.messages = messages;
    }

    @Id
    private String id; //mongodb : unique idenitier
    private String roomId;//user will specify

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private List<Message> messages = new ArrayList<Message>();
}
