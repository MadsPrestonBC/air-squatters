package local.airsquatters.TicketSystem;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.bson.types.ObjectId;

@Repository
public interface SeatRepository extends MongoRepository<Seat, ObjectId>{
    
}
