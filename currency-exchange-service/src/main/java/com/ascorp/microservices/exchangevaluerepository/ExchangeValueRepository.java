package com.ascorp.microservices.exchangevaluerepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ascorp.microservices.currencyexchangeservice.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {

	ExchangeValue findByFromAndTo(String from, String to);
}
