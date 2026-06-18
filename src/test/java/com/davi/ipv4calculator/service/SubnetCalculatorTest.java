package com.davi.ipv4calculator.service;

import com.davi.ipv4calculator.model.SubnetInfo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SubnetCalculatorTest {

    private final SubnetCalculator calculator = new SubnetCalculator();

    @Test
    void deveCalcularSubRedeCidr() {
        SubnetInfo info = calculator.calcular("192.168.1.10/26");


        assertEquals("192.168.1.0", info.getRede());
        assertEquals("192.168.1.63", info.getBroadcast());
        assertEquals(62, info.getQuantidadeHost());
    }

    @Test
    void deveLancarExcecaoIp() {
        assertThrows(
                IllegalArgumentException.class,() ->
                        calculator.calcular("300.168.1.10/26")
        );
    }

    @Test
    void develancarExcecaoCidr() {

        assertThrows(
                IllegalArgumentException.class, () ->
                        calculator.calcular("192.168.1.10/51")
        );
    }

    @Test
    void deveLancarExcecao31() {
        SubnetInfo info = calculator.calcular("192.168.1.10/31");

        assertEquals("192.168.1.10", info.getRede());
        assertEquals("192.168.1.11", info.getBroadcast());
        assertEquals(2, info.getQuantidadeHost());
    }

    @Test
    void deveLancarExcecao32() {
        SubnetInfo info = calculator.calcular("192.168.1.10/32");

        assertEquals("192.168.1.10", info.getRede());
        assertEquals("192.168.1.10", info.getBroadcast());
        assertEquals(1, info.getQuantidadeHost());
    }

}
