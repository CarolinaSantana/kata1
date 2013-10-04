package kata1;

import java.util.Date;

public class Student {

    private String name;
    private Date birdate;
    private static final long Miliseconds = (1000 * 60);
    private static final long MilisecondsPerHours = (Miliseconds * 60);
    private static final long MilisecondsPerDay = (MilisecondsPerHours * 24);
    private static final long MilisecondsPerYear = (long) (MilisecondsPerDay * 365.25);

    public Student(String name, Date birdate) {
        this.name = name;
        this.birdate = birdate;
    }

    public String getName() {
        return name;
    }

    public Date getBirdate() {
        return birdate;
    }

    public int getAge() {
        Date today = new Date();
        long age = today.getTime() - birdate.getTime();
        return (int) (age / MilisecondsPerYear);
    }
}
