package University;

public class Student {
    public String name;
    public String surname;
    public int yearOfBirth;
    public int id;

    Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.id = 000000;
    }

    Student(String name, String surname, int id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        if (String.valueOf(id).length() == 6) {
            this.id = id;
        } else {
            this.id = 000000;
            System.out.println("Error! Must be 6 symbols");
        }
    }

    public int getYear() {
        return this.yearOfBirth;
    }

    public void setName(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }



    public static void main(String[] args) {


    }
}
