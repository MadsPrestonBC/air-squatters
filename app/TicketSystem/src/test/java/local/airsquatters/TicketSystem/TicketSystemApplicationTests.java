package local.airsquatters.TicketSystem;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Date;
import java.util.LinkedList;

import javax.swing.event.DocumentEvent.EventType;

import org.bson.types.ObjectId;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
class TicketSystemApplicationTests {

	// @Autowired
	// private MockMvc mockMvc;

	// @Autowired
	// private WebApplicationContext webApplicationContext;

	// @Autowired 
	// private ObjectMapper objectMapper;

	// @Autowired 
	// private EventRepository eventRepository;

	// @BeforeEach
	// public void setup() throws Exception {
    // 	this.mockMvc = MockMvcBuilders.webAppContextSetup(this.webApplicationContext).build();
	// }
	// @Test
	// void registrationWorksThroughAllLayers() throws Exception {

	// 	Account testAccount = new Account("123456", "password", "example@me.com");

	// 	mockMvc.perform

	// }

	// @Test
	// void eventCreationWorksThroughAllLayers() throws Exception {
	// 	Event event = new Event((new ObjectId()), Event.EventType.SPORTS, "Home Game 1", (new Date()), "TD Arena", new LinkedList<Seat>() );
		
	// 	mockMvc.perform(post("/forums/{forumId}/register", 42L)
    //         .contentType("application/json")
    //         .param("sendWelcomeMail", "true")
    //         .content(objectMapper.writeValueAsString(event)))
    //         .andExpect(status().isOk());

    // 	Event eventClone = eventRepository.findEventByEventEventName("Home Game 1");
    // 	assertEquals("Home Game 1", eventClone.getEventName());
	// }

}
