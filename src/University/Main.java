package University;

public class Main {
    public static void main(String[] args) {
//        Create students and test their methods:)
        Student stud1 = new Student("Bob", "Uokich");
        Student stud2 = new Student("John", "Jhonson", 123456);
        System.out.println(stud1.getName() + " " + stud1.getSurname() + " " + stud1.getId());
        System.out.println(stud2.getName() + " " + stud2.getSurname() + " " + stud2.getId());

        stud1.setName("Alex");
        System.out.println(stud1.getName() + " " + stud1.getSurname() + " " + stud1.getId());

        stud2.setId(1);
        stud2.setId(123432);
        stud2.setYear(2005);
        stud2.getYear();
        System.out.println(stud2.getId()+ " " + stud2.getYear());
    }
}
