package com.linux.designpatterns.adapter.cc;

import java.math.BigDecimal;

/**
 * Existing Credit card interface.
 * 
 * @author Guruprasad Kulkarni <guru@linux.com>
 *
 */
public interface CcOne {

	public String getCreditCardNo();
	public String getCustomerName();
	public String getCardExpMonth();
	public String getCardExpYear();
	public Short getCardCVVNo();
	public BigDecimal getAmount();
	public void setCreditCardNo(String creditCardNo);
	public void setCustomerName(String customerName);
	public void setCardExpMonth(String cardExpMonth);
	public void setCardExpYear(String cardExpYear);
	public void setCardCVVNo(Short cardCVVNo);
	public void setAmount(BigDecimal amount);
}
