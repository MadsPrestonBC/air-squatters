package local.airsquatters.TicketSystem;

import java.util.LinkedList;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "accounts")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private int cofcID;
    private String password;
    private String email;
    private LinkedList<Ticket> tickets;

}
