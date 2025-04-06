// Event class with basic functionality
@Entity
public interface Event {
    String eventType;
    String source;
    String timestamp;
    
    @Column(default = "datetime")
    DateTime datetime;
}

// Fact class for event mapping
@Factoids(indices = "event_id", primaryId = true)
class EventFactoid extends Fact<Event> {}

