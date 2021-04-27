package com.currency.conversion.prody.feign;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.currency.conversion.prody.model.CurrencyConversionBean;

@RestController
public class ConversionController {
	
	@Autowired
	CurrencyExchangeProxi currencyExchangeProxi;
	
	@GetMapping("currency/conversion/proxy/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean conversion(@PathVariable String from,@PathVariable String to,@PathVariable BigDecimal quantity) {
		CurrencyConversionBean conversion = currencyExchangeProxi.findByFromAndTo(from, to);
		return new CurrencyConversionBean(conversion.getId(), from, to, conversion.getConversionRate(),quantity,quantity.multiply(conversion.getConversionRate()));
		
	}		

}
