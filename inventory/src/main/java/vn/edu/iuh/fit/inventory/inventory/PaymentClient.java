package vn.edu.iuh.fit.inventory.inventory;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "payment-service")
public interface PaymentClient {
    @GetMapping("/payment/status")
    String getPaymentStatus();
}