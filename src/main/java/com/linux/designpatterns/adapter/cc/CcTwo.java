package com.linux.designpatterns.adapter.cc;

/**
 * 
 * New Interface that is similar but not exactly same as existing.
 * 
 * @author Guruprasad Kulkarni <guru@linux.com>
 *
 */
public interface CcTwo {
	public String getCustCardNo();
	public String getCardOwnerName();
	public String getCardExpMonthDate();
	public Integer getCVVNo();
	public Double getTotalAmount();
	public void setCustCardNo(String custCardNo);
	public void setCardOwnerName(String cardOwnerName);
	public void setCardExpMonthDate(String cardExpMonthDate);
	public void setCVVNo(Integer cVVNo);
	public void setTotalAmount(Double totalAmount);
}
