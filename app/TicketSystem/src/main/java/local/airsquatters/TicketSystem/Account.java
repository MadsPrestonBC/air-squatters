package local.airsquatters.TicketSystem;

import java.util.LinkedList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "accounts")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    @Id
    private Integer cofcId;
    private String password;
    private String email;
    private LinkedList<Ticket> tickets;

    public Account(Integer cofcId, String password, String email) {
        this.cofcId = cofcId;
        this.password = password;
        this.email = email;
        this.tickets = new LinkedList<Ticket>();
    }

}
