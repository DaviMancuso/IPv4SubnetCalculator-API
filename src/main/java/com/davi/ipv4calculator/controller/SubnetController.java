package com.davi.ipv4calculator.controller;

import com.davi.ipv4calculator.model.SubnetInfo;
import com.davi.ipv4calculator.service.SubnetCalculator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/subnet")
@CrossOrigin(origins = "*")
public class SubnetController {

    private static final Logger logger =
            LoggerFactory.getLogger(SubnetController.class);

    private final SubnetCalculator calculator;

    public SubnetController(SubnetCalculator calculator, SubnetCalculator subnetCalculator) {
        this.calculator = calculator;
    }

    @GetMapping
    public SubnetInfo calcular(@RequestParam String ip) {
        logger.info("Requisição recebida pelo cáculo de sub-rede: {}", ip);

        SubnetInfo resultado = calculator.calcular(ip);
        logger.info("Cálculo realizado com sucesso para {}", ip);

        return calculator.calcular(ip);
    }
}
