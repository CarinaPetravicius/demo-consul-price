package br.com.demo.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TaxController {

    @Value("${taxrate}")
    private Double taxRate;

    @Value("${fix.price}")
    private Double fixPrice;

    @Value("${fix.rate}")
    private Double fixRate;

    @RequestMapping("/tax/{price}")
    public Double calculateTax(@PathVariable(value = "price") Double price) {
        return price * taxRate;
    }

    @RequestMapping("/price")
    public Double calculateFixPrice() {
        return fixPrice * taxRate;
    }

    @RequestMapping("/taxrate")
    public Double calculateFixRate() {
        return fixRate;
    }

}