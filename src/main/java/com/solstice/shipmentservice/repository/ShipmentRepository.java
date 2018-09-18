package com.solstice.shipmentservice.repository;

import com.solstice.shipmentservice.domain.Shipment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipmentRepository extends CrudRepository<Shipment, Long> {

    Iterable<Shipment> findAllByAccountIdOrderByDeliveryDate(long id);

}
