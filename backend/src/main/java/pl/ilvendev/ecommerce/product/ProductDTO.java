package pl.ilvendev.ecommerce.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
    private Long id;
    private String productName;
    private String description;
    private BigDecimal price;
    private String manufacturer;
    private Long supply;
    private Boolean isFeatured;
}
