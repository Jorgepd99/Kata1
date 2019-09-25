package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Person per = new Person("Pedro", new Date (97, 5, 17));
        System.out.println(per.getName());
        System.out.println(per.getAge());
    }
    
}
