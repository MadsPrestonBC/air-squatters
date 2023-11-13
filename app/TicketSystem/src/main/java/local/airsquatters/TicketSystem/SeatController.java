package local.airsquatters.TicketSystem;


import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(value = "/api/v1/events/{eventName}/seats", method = RequestMethod.GET)
public class SeatController {
    @Autowired
    private SeatService seatService;

    @PostMapping
    public ResponseEntity<Seat> createSeat(@RequestBody Map<String, Object> payload) {
        return new ResponseEntity<Seat>(seatService.createSeat((int)payload.get("seatNumber"), (char)payload.get("section"), (Double)payload.get("price"), (boolean)payload.get("handicapAccessable"), (String)payload.get("eventName")), HttpStatus.CREATED);
    }
    
}
