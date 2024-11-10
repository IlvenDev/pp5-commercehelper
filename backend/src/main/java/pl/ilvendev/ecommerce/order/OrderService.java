package pl.ilvendev.ecommerce.order;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class OrderService {
    private OrderRepository orderRepository;

    public OrderDTO createOrder(OrderDTO orderDTO) {
        Order order = OrderMapper.mapToOrder(orderDTO);
        Order createdOrder = orderRepository.save(order);
        return OrderMapper.mapToDTO(createdOrder);
    }

    public OrderDTO findOrderById(Long orderId) {
        Order fetchedOrder = orderRepository.findById(orderId)
                .orElseThrow(() -> new OrderNotFoundException("An order with ID " + orderId + " was not found."));
        return OrderMapper.mapToDTO(fetchedOrder);
    }

    public List<OrderDTO> getAllOrders() {
        List<Order> orders = orderRepository.findAll();
        return orders.stream()
                .map((order -> OrderMapper.mapToDTO(order)))
                .collect(Collectors.toList());
    }

    public OrderDTO updateOrder(Long orderId, OrderDTO orderDTO) {
        Order fetchedOrder = orderRepository.findById(orderId)
                .orElseThrow(() -> new OrderNotFoundException("An order with ID " + orderId + " was not found."));

        fetchedOrder.setOrderNumber(orderDTO.getOrderNumber());
        fetchedOrder.setProductName(orderDTO.getProductName());
        fetchedOrder.setQuantity(orderDTO.getQuantity());
        fetchedOrder.setOrderDate(orderDTO.getOrderDate());
        fetchedOrder.setCustomerId(orderDTO.getCustomerId());
        fetchedOrder.setDiscountAmount(orderDTO.getDiscountAmount());
        fetchedOrder.setTotalAmount(orderDTO.getTotalAmount());
        Order updatedOrder = orderRepository.save(fetchedOrder);

        return OrderMapper.mapToDTO(updatedOrder);
    }

    public void deleteOrder(Long orderId) {
        if(!orderRepository.existsById(orderId)) {
            throw new OrderNotFoundException("An order with ID " + orderId + " was not found.");
        }
        orderRepository.deleteById(orderId);
    }
}
