package local.airsquatters.TicketSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class SeatService {
    @Autowired
    private SeatRepository seatRepository;

    @Autowired
    private MongoTemplate mongoTemplate;
    public Seat createSeat(int seatNumber, char section, Double price, boolean handicapAccessible, String eventName) {
        Seat seat = new Seat(seatNumber, section, price, handicapAccessible);
        seatRepository.insert(seat);

        mongoTemplate.update(Event.class)
            .matching(Criteria.where("eventName").is(eventName))
            .apply(new Update().push("seatIds").value(seat))
            .first();

            return seat;
    }
}
