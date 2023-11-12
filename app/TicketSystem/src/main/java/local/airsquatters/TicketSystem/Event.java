package local.airsquatters.TicketSystem;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

@Document(collection = "events")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Event {

    public enum EventType {
        SPORTS, PLAY, CONCERT;
    }
    
    private EventType eventType;
    private Date date;
    private String location;
    private List<Seat> seats;



}
