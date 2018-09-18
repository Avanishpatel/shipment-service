package com.solstice.shipmentservice.controller;

import com.solstice.shipmentservice.domain.Shipment;
import com.solstice.shipmentservice.service.ShipmentService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(ShipmentController.class)
public class ShipmentControllerUnitTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ShipmentService shipmentService;


    @InjectMocks
    private ShipmentController shipmentController;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getAllShipments() throws Exception {

        List<Shipment> shipments = Arrays.asList(
                new Shipment(1,1,1, LocalDate.of(2018,6,22),LocalDate.of(2018,6,24)),
                new Shipment(2,2,2, LocalDate.of(2018,6,26),LocalDate.of(2018,6,28))

        );

        when(shipmentService.getAllShipments()).thenReturn(shipments);

        mockMvc.perform(get("/shipments"))
                .andExpect(jsonPath("$.length()").value(2))
                .andExpect(jsonPath("$[0].orderLineId", is(1)))
                .andExpect(jsonPath("$[1].shippingDate", is(LocalDate.of(2018,6,26))))
                .andExpect(content().contentType("application/json;charset=UTF-8"))
                .andExpect(status().isOk())
                .andReturn();
    }

    @Test
    public void getShipment() {
    }

    @Test
    public void addShipment() {
    }

    @Test
    public void updateShipment() {
    }

    @Test
    public void deleteShipment() {
    }

    @Test
    public void getShipmentsByAccount() {
    }
}