package E29PersonAndTheirsHeirs;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String args[]){

        System.out.println("29.1");
        Person pekka = new Person("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa");
        Person esko = new Person("Esko Ukkonen", "Mannerheimintie Street 15 00100 Helsinki");
        System.out.println(pekka);
        System.out.println(esko);

        System.out.println("\n\n29.2");
        Student olli = new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki");
        System.out.println(olli);
        System.out.println("credits " + olli.getCredits());
        olli.study();
        System.out.println("credits "+ olli.getCredits());

        System.out.println("\n\n29.3");
        Student ollii = new Student("Ollii", "Ida Albergintie Street 1 00400 Helsinki");
        System.out.println(ollii);
        ollii.study();
        System.out.println(ollii);


        System.out.println("\n\n29.4");
        Teacher pekkas = new Teacher("Pekkas Mikkola", "Korsontie Street 1 03100 Vantaa", 1200);
        Teacher eskos = new Teacher("Eskos Ukkonen", "Mannerheimintie 15 Street 00100 Helsinki", 5400);
        System.out.println(pekkas);
        System.out.println(eskos);


        Student ollix = new Student("Ollix", "Ida Albergintie 1 Street 00400 Helsinki");
        for (int i=0; i < 25; i++) {
            ollix.study();
        }
        System.out.println(ollix);

        System.out.println("\n\n29.5");
        List<Person> people = new ArrayList<Person>();
        people.add(new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200));
        people.add(new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki"));

        printDepartment(people);
    }

    public static void printDepartment(List<Person> people){
        for(Person person : people){
            System.out.println(person);
        }
    }
}
