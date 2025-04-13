package vn.edu.iuh.fit.inventory.inventory;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inventory")
public class InventoryController {
    @Autowired
    private PaymentClient paymentClient;

    @CircuitBreaker(name = "paymentService", fallbackMethod = "paymentFallback")
    @GetMapping("/check")
    public String checkInventory() {
        return "Inventory OK - " + paymentClient.getPaymentStatus();
    }

    public String paymentFallback(Exception e) {
        return "Payment Service is unavailable!";
    }
}