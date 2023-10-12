import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();

        ArrayList<String> canTeach = new ArrayList<>();
        canTeach.add("Math");
        canTeach.add("Java 1.0");

        persons.add(new Teacher("Rasmus", new ArrayList<>()));
        persons.add(new Teacher("Adam", canTeach));

        ArrayList<String> passedCourses = new ArrayList<>();
        passedCourses.add("Programming");
        passedCourses.add("Java 1.0");

        persons.add(new Student("Allan", passedCourses));
        persons.add(new Student("Marcus", passedCourses));
        persons.add(new Student("Jørgen", new ArrayList<>()));

        for (Person p : persons) {
            if (!p.addCourse("Java 1.0")) {
                if (p instanceof Student) {
                    System.out.println(p.getName() + " har allerede bestået dette kursus.");
                } else  {
                    System.out.println(p.getName() + " kan ikke undervise i dette fag");
                }
            }
        }
    }
}