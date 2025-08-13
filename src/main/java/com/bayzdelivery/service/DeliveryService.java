package com.bayzdelivery.service;

import com.bayzdelivery.model.Delivery;
import java.util.List;

public interface DeliveryService {

  public Delivery save(Delivery delivery);

  public Delivery findById(Long deliveryId);

  Boolean isAgentAlreadyDelivering(final Delivery delivery);

  List<Long> getDelayedDelivery(final Integer duration);
}
