import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Currently this is the superClass for Course. We want it to represent anything which behaves like course, in the
 * sense that it has mutually exclusive alternatives. We  try and generate timetables using the different alternatives.
 */
public abstract class UnknownP implements  Iterable<ArrayList<Event>> {
    private ArrayList<ArrayList<Event>> listOfOptions = new ArrayList<>();
    public String name;
    public abstract boolean equals(Object obj);
    public void add(ArrayList<Event> Section) {
        listOfOptions.add(Section);
    }
    public String getName() {
        return this.name;
    }
    public Iterator iterator() {
        return new SectionIterator();
    }
    public class SectionIterator implements Iterator {
        int cuurentSection = 0;
        @Override
        public boolean hasNext(){
            return cuurentSection + 1 < listOfOptions.size();
        }
        @Override
        public List<Event> next() {
//            TODO implement DEEPclone
            return listOfOptions.get(cuurentSection++);
        }
    }
}
