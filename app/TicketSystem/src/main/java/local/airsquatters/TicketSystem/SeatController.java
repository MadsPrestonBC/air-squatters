package local.airsquatters.TicketSystem;


import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(value = "/api/v1/events/{eventName}/seats", method = RequestMethod.GET)
public class SeatController {
    @Autowired
    private SeatService seatService;

    @PostMapping
    public ResponseEntity<Seat> createSeat(@RequestBody Map<int, char, Double> payload) {
        return new ResponseEntity<Seat>(seatService.createSeat(payload.get("seatNumber"), payload.get("section"), payload.get("price")), HttpStatus.CREATED);
    }
    
}
