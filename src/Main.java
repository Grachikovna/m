public class Main {
    public static void changePerson(Person person) {
        // person = new Person(" Ilya", "Lagutenko");
        person.setName("Ilya");
        person.setSurname("Lagutenko");

    }
    public static void main(String[] args) {
        Person person = new Person("Lyapis", "Trubetskoy");
        changePerson(person);
        System.out.println(person);

    }

}




