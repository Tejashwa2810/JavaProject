import package1.Client;
import package1.Doctors;
import package1.Person;
import package1.student;

public class Main {
    public static void main(String[] args){
        Client obj = new student();
        //obj.doSomething();
        obj.yourName();

        Person p = new Person();
        p.getPersonName("Parul");

        Doctors d = new Doctors();
        d.getDoctors();
    }
}