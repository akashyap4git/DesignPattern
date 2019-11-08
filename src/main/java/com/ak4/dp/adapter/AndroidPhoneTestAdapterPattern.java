package com.ak4.dp.adapter;

public class AndroidPhoneTestAdapterPattern {
	
	public static void main(String[] args) {
		AndroidCharger androidCharger = new ChargerAdapter(new IPhoneChargerImpl());
		androidCharger.chargingRequest();
	}
}
