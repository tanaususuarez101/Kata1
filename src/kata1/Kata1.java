package kata1;

import java.util.GregorianCalendar;
import java.util.Calendar;
/**
 *
 * @author Tana - HP
 */
public class Kata1 {

    public static void main(String[] args) {
        Calendar date = GregorianCalendar.getInstance();
        date.set(1949, 9 ,24);
        
        Person person = new Person ("Blas", date);
        System.out.println(person.getName() + " tiene " + person.getAge());
        
    }
    
}
