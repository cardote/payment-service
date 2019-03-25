package br.com.fiap.paymentservice.dao;

import br.com.fiap.paymentservice.model.Payment;

import java.math.BigDecimal;

public class PaymentDao {

    private Payment[] payments = new Payment[200];

    public PaymentDao(){

        Payment payment = new Payment();

        payment.setId(1);
        payment.setCardNumber("1234 5432 2345 6567");
        payment.setExpiringDate("22/1993");
        payment.setCardFlag("Visa");
        payment.setPurchaseValue(new BigDecimal(123.43));

        payments[payment.getId()] = payment;
    }

    public Payment findById(int id) {
        return payments[id];
    }

    public Payment save(Payment payment) {
        if(payments[payment.getId()] == null){
            payments[payment.getId()] = payment;
            return payment;
        } else {
            return null;
        }

    }

    public Payment update(Payment payment) {
        int id = payment.getId();
        if(payments[id] != null){

            payments[id].setCardNumber(payment.getCardNumber());
            payments[id].setExpiringDate(payment.getExpiringDate());
            payments[id].setCardFlag(payment.getCardFlag());
            payments[id].setPurchaseValue(payment.getPurchaseValue());

            return payments[id];
        }
        return null;
    }

    public boolean delete(int id){
        if(payments[id] != null){
            payments[id] = null;
            return true;
        }
        return false;
    }

    public Payment[] getPayments(){
        return this.payments;
    }
}
