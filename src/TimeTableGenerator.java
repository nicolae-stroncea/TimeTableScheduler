import java.sql.Time;
import java.util.List;

/*
Generates all possible permutations of TimeTable
 */
interface TimeTableGenerator {
    /*
    Make sure not to add null to array
     */
    TimeTable createTimeTable();
}
