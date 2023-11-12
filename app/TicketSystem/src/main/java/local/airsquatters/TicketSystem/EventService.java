package local.airsquatters.TicketSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EventService {
    @Autowired
    private EventRepository eventRepository;

    public List<Event> allEvents() {
        return eventRepository.findAll();
    }

    public Event singleEvent(String eventName) {
        return eventRepository.findEventByEventEventName(eventName);
    }
    
}
