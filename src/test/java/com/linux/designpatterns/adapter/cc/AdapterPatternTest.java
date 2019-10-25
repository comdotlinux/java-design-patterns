package com.linux.designpatterns.adapter.cc;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

public class AdapterPatternTest {

	private static final String CARD_EXPIRY_MONTH = "12";

	private static final String CARD_EXPIRY_YEAR = "2020";

	private static final String CC_NUMBER = "1234 5678 9101 1213 1415";

	private static final String CC_OWNER_NAME = "John Doe";

	private static final Short CVV = 123;

	private static final BigDecimal PAYMENT_AMOUNT = BigDecimal.TEN;
	
	private CcOne ccOne;
	
	private CcOneToCcTwoAdapter underTest;
	
	@Before
	public void setUp(){
		ccOne = new BasicCcOne();
		ccOne.setCustomerName(CC_OWNER_NAME);
		ccOne.setCreditCardNo(CC_NUMBER);
		ccOne.setCardCVVNo(CVV);
		ccOne.setCardExpYear(CARD_EXPIRY_YEAR);
		ccOne.setCardExpMonth(CARD_EXPIRY_MONTH);
		ccOne.setAmount(PAYMENT_AMOUNT);
		underTest = null; // reset underTest
	}
	
	
	@Test
	public void adapterPatternTest() {
		//Arrange -- already done in @Before

		//Act
		underTest = new CcOneToCcTwoAdapter(ccOne);
		 
		//Assert
		 assertThat(underTest.getCardOwnerName(), is(equalTo(CC_OWNER_NAME)));
		 assertThat(underTest.getTotalAmount(),is(equalTo(PAYMENT_AMOUNT.doubleValue())));
		 assertThat(underTest.getCardExpMonthDate(), containsString(CARD_EXPIRY_MONTH));
		 assertThat(underTest.getCardExpMonthDate(), containsString(CARD_EXPIRY_YEAR));
		 assertThat(underTest.getCardExpMonthDate(), containsString("/"));
		 assertThat(underTest.getCustCardNo(), is(equalTo(CC_NUMBER)));
		 assertThat(underTest.getCVVNo(), is(equalTo(CVV.intValue())));
		
	}

}
