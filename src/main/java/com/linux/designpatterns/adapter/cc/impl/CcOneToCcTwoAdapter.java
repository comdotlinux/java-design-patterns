package com.linux.designpatterns.adapter.cc.impl;

import com.linux.designpatterns.adapter.cc.CcOne;
import com.linux.designpatterns.adapter.cc.CcTwo;

/**
 * 
 * <strong>Adapter Design Pattern in action</strong>, 
 * existing code can be used to get an instance of {@link CcOne}
 * and this Adapter which implements {@link CcTwo} can use it to return 
 * values required by {@link CcTwo} 
 * 
 * @author guru
 *
 */
public class CcOneToCcTwoAdapter implements CcTwo {

	private final CcOne ccOne;
	private String custCardNo;
	private String cardOwnerName;
	private String cardExpMonthDate;
	private Integer cVVNo;
	private Double totalAmount;
	
	public CcOneToCcTwoAdapter(CcOne ccOne) {
		this.ccOne = ccOne;
		adaptProperties();
	}
	
	
	private void adaptProperties() {
		setCustCardNo(this.ccOne.getCreditCardNo());
		setCardOwnerName(this.ccOne.getCustomerName());
		setCardExpMonthDate(this.ccOne.getCardExpMonth() + "/" + this.ccOne.getCardExpYear());
		setCVVNo(Integer.valueOf(this.ccOne.getCardCVVNo()));
		setTotalAmount(this.ccOne.getAmount().doubleValue());
		
	}


	@Override
	public String getCustCardNo() {
		return custCardNo;
	}

	@Override
	public String getCardOwnerName() {
		return cardOwnerName;
	}

	@Override
	public String getCardExpMonthDate() {
		return cardExpMonthDate;
	}

	@Override
	public Integer getCVVNo() {
		return cVVNo;
	}

	@Override
	public Double getTotalAmount() {
		return totalAmount;
	}

	@Override
	public void setCustCardNo(String custCardNo) {
		this.custCardNo = custCardNo;

	}

	@Override
	public void setCardOwnerName(String cardOwnerName) {
		this.cardOwnerName = cardOwnerName;

	}

	@Override
	public void setCardExpMonthDate(String cardExpMonthDate) {
		this.cardExpMonthDate = cardExpMonthDate;

	}

	@Override
	public void setCVVNo(Integer cVVNo) {
		this.cVVNo = cVVNo;

	}

	@Override
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;

	}
	
	

}
