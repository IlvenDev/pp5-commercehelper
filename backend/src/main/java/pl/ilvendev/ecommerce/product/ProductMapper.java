package pl.ilvendev.ecommerce.product;

public class ProductMapper {
    public static ProductDTO mapToDto(Product product) {
        return new ProductDTO(
            product.getProductId(),
            product.getProductName(),
            product.getDescription(),
            product.getPrice(),
            product.getManufacturer(),
            product.getSupply(),
            product.getIsFeatured()
        );
    }

    public static Product mapToProduct(ProductDTO productDTO) {
        return new Product(
                productDTO.getId(),
                productDTO.getProductName(),
                productDTO.getDescription(),
                productDTO.getPrice(),
                productDTO.getManufacturer(),
                productDTO.getSupply(),
                productDTO.getIsFeatured()
        );
    }
}
