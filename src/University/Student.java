package University;

import java.util.Date;
import java.util.ArrayList;

public class Student implements Activist{
    private String name;
    private String surname;
    private int yearOfBirth;
    private ArrayList<Event> listOfEvents;
    int id;

    // новое
    public boolean activistStatus;
    public String studStatus;
    // новое

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

    public void setYear(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    // новое

    public String getStudStatus() {
        return this.studStatus;
    }
    public void setStudStatus(String studStatus) {
        this.studStatus = studStatus;
    }
    public boolean getActivistStatus() {
        return this.activistStatus;
    }
    public void setActivistStatus(boolean activistStatus) {
        this.activistStatus = activistStatus;
    }

    public void addEventInList(Event event) {
        listOfEvents.add(event);
    }

    public void removeEventInList(Date date) {
        for (int i = 0; i < listOfEvents.size(); i++) {
            if (((Event) this.listOfEvents).getDateOfEvent() == date) {
                this.listOfEvents.remove(((Event) this.listOfEvents));
            }
        }
    }
    public Event showEventInList(Date date) {
        Event result = null;

        for (int i = 0; i < listOfEvents.size(); i++) {
            if (((Event) this.listOfEvents).getDateOfEvent() == date) {
                result = ((Event) this.listOfEvents);
            }
        }

        return result;
    }

    @Override
    public int countOfEvents() {
        return this.listOfEvents.size();
    }

    @Override
    public int countOfPrizePlace() {
        return this.listOfEvents.size();
    }

    @Override
    public int countOfReports() {
        return this.listOfEvents.size();
    }

    @Override
    public void countOfReportsName() {
        for (int i = 0; i <= this.listOfEvents.size(); i++) {
            System.out.println(this.listOfEvents.get(i));
        }
    }
}
