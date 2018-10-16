import java.awt.*;
import java.awt.Event;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a block of events.
 */

public interface TimeTable extends EventContainer, Comparable<Event>, Scorable {
    /*
    Generates a timetable if possible. If not, returns null.
     */
    TimeTable build();

}
