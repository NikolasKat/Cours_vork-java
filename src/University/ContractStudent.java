package University;

import java.util.Date;
import java.util.LinkedList;

public class ContractStudent extends Student{
    private double costOfStudy;
    private LinkedList<Payment> paymentList;

    ContractStudent(String name, String surname, int id) {
        super(name, surname, id);
        this.paymentList = new LinkedList<Payment>();
    }

    ContractStudent(String name, String surname) {
        super(name, surname);
        this.setId(0);
        this.paymentList = new LinkedList<Payment>();
    }

    ContractStudent(String name, String surname, int id, LinkedList<Payment> paymentList) {
        super(name, surname, id);
        this.paymentList = paymentList;
    }

    public LinkedList<Payment> getPaymentList() {
        return paymentList;
    }

    public void setPaymentList(LinkedList<Payment> paymentList) {
        this.paymentList = paymentList;
    }

    public double getCostOfStudy() {
        return costOfStudy;
    }

    public void setCostOfStudy(double costOfStudy) {
        this.costOfStudy = costOfStudy;
    }

    public void addPaymentInList(Payment payment) {
        this.paymentList.add(payment);
    }

    //новое
    public void removePaymentInList(double costOfStudy){
        for (int i = 0; i <= paymentList.size(); i++) {
            if (this.costOfStudy == costOfStudy) {
                this.paymentList.remove(costOfStudy);
            }
        }
    }
//
}
