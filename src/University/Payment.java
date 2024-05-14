package University;

import java.util.Date;

public class Payment {
    private Date date;
    private double money;

//constructors
    Payment() {
        this.date = null;
        this.money = 0;
    }

    Payment(Date date, double money) {
        this.date = date;
        this.money = money;
    }

//    get/set methods
    public Date getNDate() {
        return this.date;
    }

    public void setName(Date date) {
        this.date = date;
    }

    public double getMoney() {
        return  this.money;
    }

    public  void setMoney(double money) {
        this.money = money;
    }
}
