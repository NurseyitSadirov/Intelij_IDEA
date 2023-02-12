import person.Builder;
import person.Driver;
import person.Person;
import person.Programmer;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.working();
        Person.setAge(16);
        System.out.println(Person.getAge());
        System.out.println("~~~~~~~~~~~~~");
        Programmer programmer = new Programmer();
        programmer.working();
        Programmer.setAge(17);
        System.out.println(Programmer.getAge());
        System.out.println("~~~~~~~~~~~~~");
        Driver driver = new Driver();
        driver.working();
        Driver.setAge(18);
        System.out.println(Driver.getAge());
        System.out.println("~~~~~~~~~~~~~");
        Builder builder = new Builder();
        builder.working();
        Builder.setAge(19);
        System.out.println(Builder.getAge());
        System.out.println("~~~~~~~~~~~~~");

    }
}