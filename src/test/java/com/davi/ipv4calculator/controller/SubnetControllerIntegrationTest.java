package com.davi.ipv4calculator.controller;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@SpringBootTest
@AutoConfigureMockMvc
public class SubnetControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void deveRetornarStatus200QuandoIpForValido() throws Exception {
        mockMvc.perform(get("/api/subnet")
                .param("ip", "192.168.1.50/26"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.rede", is("192.168.1.0")))
                .andExpect(jsonPath("$.broadcast", is("192.168.1.63")))
                .andExpect(jsonPath("$.quantidadeHost", is(62)));
    }

    @Test
    void deveRetornarStatus400QuandoIpForInvalido() throws Exception {
        mockMvc.perform(get("/api/subnet")
                .param("ip", "300.168.1.50/26"))
                .andExpect(status().isBadRequest());
    }

    @Test
    void deveRetornarStatus400QuandoCidrForInvalido() throws Exception {
        mockMvc.perform(get("/api/subnet")
                .param("ip", "192.168.1.50/50"))
                .andExpect(status().isBadRequest());
    }
}
