package com.solstice.shipmentservice.controller;

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

import static org.junit.Assert.*;

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
    public void getAllShipments() {
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