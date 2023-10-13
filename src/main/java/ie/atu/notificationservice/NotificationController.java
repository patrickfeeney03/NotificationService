package ie.atu.notificationservice;


import org.apache.catalina.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class NotificationController {
    @GetMapping("/notify")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Map<String, String> handleNotificationRequest(UserDetails userDetails) {
        System.out.println("NOTIFICATION CONTROLLER RAN.");
        Map<String, String> notificationMessage = new HashMap<>();
        notificationMessage.put("message", "User " + userDetails.getName() + " (" + userDetails.getEmail() +
                ") has been successfully registered.");
        return notificationMessage;
    }
}
