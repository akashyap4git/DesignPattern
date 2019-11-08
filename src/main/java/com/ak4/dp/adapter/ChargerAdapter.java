package com.ak4.dp.adapter;

public class ChargerAdapter implements AndroidCharger {
	
	private IPhoneCharger iphoneCharger;
	
	public ChargerAdapter(IPhoneCharger iphoneCharger) {
		this.iphoneCharger = iphoneCharger;
	}

	@Override
	public void chargingRequest() {
		iphoneCharger.charging();
	}
}
