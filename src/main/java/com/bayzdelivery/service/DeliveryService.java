package com.bayzdelivery.service;

import com.bayzdelivery.model.Delivery;
import com.bayzdelivery.model.DeliveryPerson;
import java.util.List;

public interface DeliveryService {

  Delivery save(Delivery delivery);

  Delivery findById(Long deliveryId);

  Boolean isAgentAlreadyDelivering(final Delivery delivery);

  List<Long> getDelayedDelivery(final Integer duration);

  List<DeliveryPerson> findTopKAgentsWithHighestCommission(final Integer limit,
                                                           final String startTime,
                                                           final String endTime);
}
