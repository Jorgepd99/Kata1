package kata1;

import java.util.Date;

public class Person {
    
    private final String name; 
    private final Date birthday;
    private final long MS_PER_SECOND = 100;
    private final long SECONDS_PER_MINUTE = 60;
    private final long MINUTES_PER_HOUR = 60;
    private final long HOURS_PER_DAYS = 24;
    private final double DAYS_PER_YEAR = 365.25;
    private final double MS_PER_YEAR = MS_PER_SECOND * SECONDS_PER_MINUTE * MINUTES_PER_HOUR * HOURS_PER_DAYS * DAYS_PER_YEAR; 
    
    public Person(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }
    
    public int getAge(){
        long ms = new Date().getTime() - birthday.getTime();
        return toYears(ms);
    }

    private int toYears(long ms) {
        return (int) (ms / MS_PER_YEAR);
    }    
}
