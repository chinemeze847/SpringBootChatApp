package edu.udacity.java.nano.chat;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * WebSocket message model
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {
    // TODO: add message model.
    @JSONField(name = "username")
    private String username;

    @JSONField(name = "msg")
    private String message;

    @JSONField(name = "onlineCount")
    private int onlineCount = 0;

    @JSONField(name = "type")
    private String type = "SPEAK";
}
