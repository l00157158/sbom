package com.pipeline.prj;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class App {

    @GetMapping("/hello")
    public String sayHello() {
         // Get the current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        // date-time formatter to format the timestamp
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // Format the timestamp as a string
        String timestamp = currentDateTime.format(formatter);
        
        String message = "Hello, World!! My Name is Jimmy; This is a Pipeline demo Ver 0.3 ";
        String messageWithTimestamp = message + "Timestamp: " + timestamp;
        
        return messageWithTimestamp;
    }
}
