import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Course implements Iterable{

    private String name;
    private ArrayList<ArrayList<Event>> lstOfSections = new ArrayList<>();

    public Course(String name) {
        this.name = name;
    }
    public void add(ArrayList<Event> Section) {
        lstOfSections.add(Section);
    }
    public String getCoursename() {
        return this.name;
    }
    public Iterator iterator() {
        return new SectionIterator();
    }

    @Override
    public boolean equals(Object obj) {
        Course alma = (Course) obj;
        return this.getCoursename().equals(alma.getCoursename());
    }

    public class SectionIterator implements Iterator{
        int cuurentSection = 0;
        @Override
        public boolean hasNext(){
            return cuurentSection + 1 < lstOfSections.size();
        }
        @Override
        public List<Event> next() {
//            TODO implement DEEPclone
            return lstOfSections.get(cuurentSection++);
        }
    }



}
