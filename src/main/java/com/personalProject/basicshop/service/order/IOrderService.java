package com.personalProject.basicshop.service.order;

import com.personalProject.basicshop.dto.OrderDto;
import com.personalProject.basicshop.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);
    List<OrderDto> getUserOrders(Long userId);
}
