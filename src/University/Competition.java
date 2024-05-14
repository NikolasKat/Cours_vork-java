package University;

import java.util.Date;

public class Competition implements Event{
    private Date dateOfCompetition;
    private String cityName;
    private String nameOfProject;
    private int moneyWon;

    @Override
    public Date getDateOfEvent() {
        return this.dateOfCompetition;
    }

    @Override
    public void setDateOfEvent(Date dateOfEvent) {
        this.dateOfCompetition = dateOfEvent;
    }

    @Override
    public String getCityName() {
        return this.cityName;
    }

    @Override
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getNameOfProject() {
        return nameOfProject;
    }

    public void setNameOfProject(String nameOfProject) {
        this.nameOfProject = nameOfProject;
    }

    public int getMoneyWon() {
        return moneyWon;
    }

    public void setMoneyWon(int moneyWon) {
        this.moneyWon = moneyWon;
    }
}
