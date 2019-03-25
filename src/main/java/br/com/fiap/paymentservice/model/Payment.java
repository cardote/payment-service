package br.com.fiap.paymentservice.model;

import lombok.*;
import org.springframework.format.annotation.NumberFormat;
import java.math.BigDecimal;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Payment {

    private int id;
    private String cardNumber;
    private String expiringDate;
    private BigDecimal purchaseValue;
    private String cardFlag;
}
