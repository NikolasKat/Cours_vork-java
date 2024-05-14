package University;

import java.util.Date;

public class Olympiad implements Event{
    private Date dateOfOlympiad;
    private String cityName;
    private int victoryPlace;

    @Override
    public Date getDateOfEvent() {
        return this.dateOfOlympiad;
    }

    @Override
    public void setDateOfEvent(Date dateOfEvent) {
        this.dateOfOlympiad = dateOfEvent;
    }

    @Override
    public String getCityName() {
        return this.cityName;
    }

    @Override
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
