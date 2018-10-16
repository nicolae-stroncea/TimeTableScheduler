import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Course extends UnknownP{
    public Course(String name) {
        this.name = name;
    }
    @Override
    public boolean equals(Object obj) {
        Course alma = (Course) obj;
        return this.getName().equals(alma.getName());
    }





}
