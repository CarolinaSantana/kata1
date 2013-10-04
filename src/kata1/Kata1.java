package kata1;
import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Student student = new Student ("Lara", new Date (93,4,10));
        System.out.println (student.getAge()); 
    }
}
