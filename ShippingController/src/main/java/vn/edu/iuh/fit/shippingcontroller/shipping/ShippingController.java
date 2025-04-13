package vn.edu.iuh.fit.shippingcontroller.shipping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shipping")
public class ShippingController {
    @GetMapping("/track")
    public String trackOrder() {
        return "Order is being shipped!";
    }
}
