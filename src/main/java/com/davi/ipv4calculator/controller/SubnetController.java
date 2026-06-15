package com.davi.ipv4calculator.controller;

import com.davi.ipv4calculator.model.SubnetInfo;
import com.davi.ipv4calculator.service.SubnetCalculator;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/subnet")
@CrossOrigin(origins = "*")
public class SubnetController {

    private final SubnetCalculator calculator;

    public SubnetController(SubnetCalculator calculator) {
        this.calculator = calculator;
    }

    @GetMapping
    public SubnetInfo calcular(@RequestParam String ip) {
        return calculator.calcular(ip);
    }
}
