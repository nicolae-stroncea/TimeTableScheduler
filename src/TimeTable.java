import java.awt.*;
import java.awt.Event;
import java.util.ArrayList;
import java.util.List;

public abstract class TimeTable implements Comparable<Event>, Scorable{
    // Consider making it an array.
    private List eventList = new ArrayList<EventContainer>();

    @Override
    public int compareTo(Event o) {
        return 0;
    }

    @Override
    public double score() {
        return 0;
    }

}
