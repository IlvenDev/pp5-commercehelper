package pl.ilvendev.ecommerce.order;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {
    private Long orderNumber;
    private String productName;
    private Long quantity;
    private Date orderDate;
    private Long customerId;
    private Double discountAmount;
    private Double totalAmount;
}
