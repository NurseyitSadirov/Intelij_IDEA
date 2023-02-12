package person;

public class Person {
    private final String name = "Nurseyit";
    private static int age;

    public Person() {
    }


    public static void setAge(int age) {
        Person.age = age;
    }

    public static int getAge() {
        return age;
    }

    public void working(){
        System.out.println(name);

    }
}
