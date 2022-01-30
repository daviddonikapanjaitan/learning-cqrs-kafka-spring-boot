package com.techbank.account.query.infrastructure.consumers;

import com.techbank.account.common.events.AccountCloseEvent;
import com.techbank.account.common.events.AccountOpenedEvent;
import com.techbank.account.common.events.FundDepositedEvent;
import com.techbank.account.common.events.FundsWithdrawnEvent;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.messaging.handler.annotation.Payload;

public interface EventConsumer {
    void consume(@Payload AccountOpenedEvent event, Acknowledgment ack);
    void consume(@Payload FundDepositedEvent event, Acknowledgment ack);
    void consume(@Payload FundsWithdrawnEvent event, Acknowledgment ack);
    void consume(@Payload AccountCloseEvent event, Acknowledgment ack);
}
