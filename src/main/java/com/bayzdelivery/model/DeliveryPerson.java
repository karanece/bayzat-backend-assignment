package com.bayzdelivery.model;

import java.math.BigDecimal;
import java.time.Instant;
import org.springframework.beans.factory.annotation.Value;

public interface DeliveryPerson {
    Long getId();

    String getName();

    @Value("#{target.commission}")
    BigDecimal getCommission();

    @Value("#{target.avg_commission}")
    BigDecimal getAvgCommission();

    @Value("#{target.start_time}")
    Instant getStartTime();

    @Value("#{target.end_time}")
    Instant getEndTime();
}
