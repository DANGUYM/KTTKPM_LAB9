package vn.edu.iuh.fit.paymentcontroller.payment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    @GetMapping("/status")
    public String getPaymentStatus() {
        return "Payment Processed Successfully!";
    }
}