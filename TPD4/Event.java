import java.util.Date;
/**
 * Date is a class that contains the framework for an Event object. The event object contains information about
 * the type of event, location, and the date of the event. Event uses java.util.Date to provide the
 * information for the event's date.
 *
 * @author Anthony Ruvo
 * @version 1.0 24 September 2023
 * <p></p>
 *
 **/
public class Event implements Comparable <Event> {
    private String eventType;
    private Date date;
    private String location;

    public String getEventType() {
        return this.eventType;
    }

    public Date getDate() {
        return this.date;
    }

    //TODO
    @Override
    public int compareTo(Event o) {
        return 0;
    }
}
