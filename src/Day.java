import java.util.ArrayList;
import java.util.List;

public class Day implements EventContainer{
    private int dayOfWeek;
    private List eventContainer = new ArrayList();

    @Override
    public boolean hasConflict() {
        return false;
    }
}

