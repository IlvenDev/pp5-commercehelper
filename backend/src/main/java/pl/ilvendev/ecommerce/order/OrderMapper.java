package pl.ilvendev.ecommerce.order;

public class OrderMapper {
    public static OrderDTO mapToDTO(Order order) {
        return new OrderDTO(
                order.getOrderNumber(),
                order.getProductName(),
                order.getQuantity(),
                order.getOrderDate(),
                order.getCustomerId(),
                order.getDiscountAmount(),
                order.getTotalAmount()
        );
    }

    public static Order mapToOrder(OrderDTO orderDTO) {
        return new Order(
                orderDTO.getOrderNumber(),
                orderDTO.getProductName(),
                orderDTO.getQuantity(),
                orderDTO.getOrderDate(),
                orderDTO.getCustomerId(),
                orderDTO.getDiscountAmount(),
                orderDTO.getTotalAmount()
        );
    }
}
