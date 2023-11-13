package local.airsquatters.TicketSystem;

import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
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
        SPORTS, 
        PLAY, 
        CONCERT
    }

    @Id
    private ObjectId eventId;
    private EventType eventType;
    private String eventName;
    private Date date;
    private String location;
    private LinkedList<Seat> seats;

    public void setSeat(Seat seat){
        seats.add(seat);
    }

    public LinkedList<Seat> getSeats() {
        return seats;
    }

    public Seat getSeats(int i) {
        return seats.get(i);
    }

}
