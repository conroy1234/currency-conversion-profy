package com.currency.conversion.prody.model;

import java.math.BigDecimal;

public class CurrencyConversionBean {

	private int id;
	private String from;
	private String to;
	private BigDecimal conversionRate;
	private BigDecimal quantity;
	private BigDecimal calculatedValue;

	public CurrencyConversionBean() {

	}

	public CurrencyConversionBean(int id, String from, String to, BigDecimal conversionRate, BigDecimal quantity,
			BigDecimal calculatedValue) {
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionRate = conversionRate;
		this.quantity = quantity;
		this.calculatedValue = calculatedValue;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getConversionRate() {
		return conversionRate;
	}

	public void setConversionRate(BigDecimal conversionRate) {
		this.conversionRate = conversionRate;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getCalculatedValue() {
		return calculatedValue;
	}

	public void setCalculatedValue(BigDecimal calculatedValue) {
		this.calculatedValue = calculatedValue;
	}

	@Override
	public String toString() {
		return "CurrencyConversionBean [id=" + id + ", from=" + from + ", to=" + to + ", conversionRate="
				+ conversionRate + ", quantity=" + quantity + ", calculatedValue=" + calculatedValue + "]";
	}

}
