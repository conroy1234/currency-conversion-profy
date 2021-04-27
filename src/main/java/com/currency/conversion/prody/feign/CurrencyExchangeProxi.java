package com.currency.conversion.prody.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.currency.conversion.prody.model.CurrencyConversionBean;

@FeignClient(name="persistent-service")
public interface CurrencyExchangeProxi {
	
	@GetMapping("/customer-service/id/{id}")
	public CurrencyConversionBean findByFromAndTo(@PathVariable String from, @PathVariable String to) ;

}
