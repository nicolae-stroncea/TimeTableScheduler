import java.sql.Time;
import java.util.List;

/*
Generates all possible TimeTables
 */
public class TimeTablesGenerator {
    private List<UnknownP> buildingBlocks;
    public TimeTablesGenerator(List<UnknownP> buildingBlocks){
        this.buildingBlocks = buildingBlocks;
    }
    public List<TimeTable> createTimeTables(){
        for(UnknownP block: buildingBlocks){

        }
        return null;
    }

    public List<UnknownP> getBuildingBlocks() {
        return buildingBlocks;
    }

    public void setBuildingBlocks(List<UnknownP> buildingBlocks) {
        this.buildingBlocks = buildingBlocks;
    }
}
