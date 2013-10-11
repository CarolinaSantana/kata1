package kata1;

import java.util.Date;

public class Student {

    private String name;
    private Date birthdate;
    private static final long MILISECONDS = (1000 * 60);
    private static final long MILISECONDS_PER_HOUR = (MILISECONDS * 60);
    private static final long MILISECONDS_PER_DAY = (MILISECONDS_PER_HOUR * 24);
    private static final long MILISECONDS_PER_YEAR = (long) (MILISECONDS_PER_DAY * 365.25);

    public Student(String name, Date birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public Date getBirdate() {
        return birthdate;
    }

    public int getAge() {
        Date today = new Date();
        long age = today.getTime() - birthdate.getTime();
        return (int) (age / MILISECONDS_PER_YEAR);
    }
}
