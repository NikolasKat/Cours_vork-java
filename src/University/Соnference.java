package University;
import java.util.Date;

public class Соnference implements Event{
    private Date dateOfСоnference;
    private String cityName;
    private  String nameOfReport;

    @Override
    public Date getDateOfEvent() {
        return this.dateOfСоnference;
    }

    @Override
    public void setDateOfEvent(Date dateOfEvent) {
        this.dateOfСоnference = dateOfEvent;
    }

    @Override
    public String getCityName() {
        return this.cityName;
    }

    @Override
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getNameOfReport() {
        return nameOfReport;
    }

    public void setNameOfReport(String nameOfReport) {
        this.nameOfReport = nameOfReport;
    }
}
