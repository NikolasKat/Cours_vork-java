package University;

public class Group {
    public int idGroup;
    public Student[] arrayOfStudent;

    Group(int idGroup) {
        this.idGroup = idGroup;
        this.arrayOfStudent = new Student[0];
    }

    Group(int idGroup, int countOfStudents) {
        this.idGroup = idGroup;
        this.arrayOfStudent = new Student[countOfStudents];
    }

    Group(Student[] arrayOfStudent) {
        this.arrayOfStudent = arrayOfStudent;
        this.idGroup = 0;
    }

    public int getIdGroup() {
        return this.idGroup;
    }

    public void setName(int idGroup) {
        this.idGroup = idGroup;
    }

    public int getCountOfStudent() {
        return this.arrayOfStudent.length;
    }

    public Student getLink(int id) {
        Student stud = null;
        for (int i = 0; i <= arrayOfStudent.length; i++) {
            if (arrayOfStudent[i].id == id) {
                stud = arrayOfStudent[i];
            }
        }

        return stud;
    }


    public Student[] deleteStud(int id) {
        Student[] arr_new = new Student[arrayOfStudent.length-1];

        for (int i = 0, k = 0; i <= arrayOfStudent.length; i++) {
            if (arrayOfStudent[i].id != id) {
                arr_new[k]= arrayOfStudent[i];
                k++;
            }
        }
        return arr_new;
    }

    public Student[] addStud(Student studu) {
        Student[] newArray = new Student[arrayOfStudent.length + 1];

        for (int i = 0; i <= newArray.length; i++) {
            if (i == newArray.length) {
                newArray[i] = studu;
            }
            newArray[i] = arrayOfStudent[i];
        }
        return newArray;
    }

    public Student[] getArrayOfStudents() {
        return this.arrayOfStudent;
    }

    public Student[] getSortedArrayOfStudent() {
        Student[] newArray = new Student[arrayOfStudent.length];

        Student[] sortedPeople = new Student[arrayOfStudent.length];
        System.arraycopy(arrayOfStudent, 0, sortedPeople, 0, arrayOfStudent.length);
        return sortedPeople;
    }

    public static void main(String[] args) {

    }
}
