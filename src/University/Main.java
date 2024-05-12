package University;

public class Main {
    public static void main(String[] args) {
//        Create students and test their methods:)
        Student stud1 = new Student("Bob", "Uokich");
        Student stud2 = new Student("John", "Jhonson", 123456);
        System.out.println(stud1.name + " " + stud1.surname + " " + stud1.id);
        System.out.println(stud2.name + " " + stud2.surname + " " + stud2.id);

        stud1.setName("Alex");
        System.out.println(stud1.name + " " + stud1.surname + " " + stud1.id);

        stud2.setId(1);
        stud2.setId(123432);
        stud2.setYear(2005);
        stud2.getYear();
        System.out.println(stud2.id+ " " + stud2.yearOfBirth);
    }
}
