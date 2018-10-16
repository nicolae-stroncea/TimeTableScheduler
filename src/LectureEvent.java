public class LectureEvent extends Event {
    private String location;
    private String lectureSection;


    public LectureEvent(String name, int startTime, int endTime, int dayOfWeek) {
        super(name, startTime, endTime, dayOfWeek);
    }


    public LectureEvent(int startTime) {
        super(startTime, startTime +1);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLectureSection() {
        return lectureSection;
    }

    public void setLectureSection(String lectureSection) {
        this.lectureSection = lectureSection;
    }
}
