public class Event {
    private int startTime;
    private int endTime;
    private String name;
    private int dayOfWeek;

    public Event(String name, int startTime, int endTime, int dayOfWeek) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.dayOfWeek = dayOfWeek;
        this.name = name;
    }
    public Event(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }
}
