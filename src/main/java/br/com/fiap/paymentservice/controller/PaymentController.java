package br.com.fiap.paymentservice.controller;

import br.com.fiap.paymentservice.dao.PaymentDao;
import br.com.fiap.paymentservice.model.Payment;
import io.swagger.annotations.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@Api(value = "Payment", description = "a list of payments")
public class PaymentController {

    private Payment[] payments;
    private PaymentDao daoPayment;

    public PaymentController(){
        daoPayment = new PaymentDao();
        payments = daoPayment.getPayments();
    }

    @GetMapping("/payments/{id}")
    public ResponseEntity<Payment> findById(@PathVariable("id") int id){
        return(ResponseEntity.ok(daoPayment.findById(id)));
    }

    @PostMapping("/payments")
    public ResponseEntity<Object> save(@RequestBody() Payment payment){
        try {
            URI location = ServletUriComponentsBuilder
                    .fromCurrentRequest()
                    .path("/{id}")
                    .buildAndExpand(daoPayment.save(payment).getId()).toUri();
            return ResponseEntity.ok(location);
        } catch (Exception e) {
            return ResponseEntity.ok("Payment already registered");
        }
    }

    @PutMapping("/payments")
    public ResponseEntity<Payment> update(@RequestBody() Payment payment){
        return ResponseEntity.ok(daoPayment.update(payment));
    }
    @DeleteMapping("/payments/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable("id") int id){
        return ResponseEntity.ok(daoPayment.delete(id));
    }

}
