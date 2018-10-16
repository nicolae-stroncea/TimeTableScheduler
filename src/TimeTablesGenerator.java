import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

/*
Generates all possible TimeTables
 */
public class TimeTablesGenerator {
    private List<UnknownP> buildingBlocks;
    private List<TimeTable> timeTables;
    public TimeTablesGenerator(List<UnknownP> buildingBlocks){
        this.buildingBlocks = buildingBlocks;
    }

    /**
     * Create all possible TimeTable Combinations.
     */
    public void createTimeTables(){
        createHelper(0, new ArrayList<Event>());
    }

    /**
     *
     * @param index within buildingBlocks which shows at which UnkownP we are currently at.
     * @param items is a List of ALL Events from the previous UnknownP s in this combination.
     */
    private void createHelper(int index, List<Event> items){
        // If we're at the last buildingBlock in the list
        if (index == buildingBlocks.size() - 1) {
            for(ArrayList<Event> e :buildingBlocks.get(index)){
                List<Event> allEvents = new ArrayList<Event>();
                allEvents.addAll(items);
                allEvents.addAll(e);
                TimeTable t = new Week();
                t.add(allEvents);
                timeTables.add(t);

            }
        }
        else{
            for(ArrayList<Event> e :buildingBlocks.get(index)){
                List<Event> allEvents = new ArrayList<>();
                allEvents.addAll(items);
                allEvents.addAll(e);
                createHelper(index+1, allEvents);
            }

        }
    }

    public List<UnknownP> getBuildingBlocks() {
        return buildingBlocks;
    }

    public void setBuildingBlocks(List<UnknownP> buildingBlocks) {
        this.buildingBlocks = buildingBlocks;
    }
}
