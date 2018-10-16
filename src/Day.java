import java.util.ArrayList;
import java.util.List;

public abstract class Day implements TimeTable{
    private int dayOfWeek;
    private List eventContainer = new ArrayList();

    @Override
    public boolean hasConflict() {
        return false;
    }
}

