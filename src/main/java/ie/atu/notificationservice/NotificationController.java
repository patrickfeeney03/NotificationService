package ie.atu.notificationservice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class NotificationController {
    @PostMapping("/notify")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Map<String, String> handleNotificationRequest(@RequestBody UserDetails userDetails) {
        Map<String, String> notificationMessage = new HashMap<>();
        notificationMessage.put("message", "User " + userDetails.getName() + " (" + userDetails.getEmail() +
                ") has been successfully registered.");
        return notificationMessage;
    }
}
