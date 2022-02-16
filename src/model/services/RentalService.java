package model.services;

import java.util.concurrent.TimeUnit;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {
	
	private double pricePerDay;
	private double pricePerHour;
	
	private BrazilTaxService taxService;

	public RentalService(double pricePerDay, double pricePerHour, BrazilTaxService texService) {
		this.pricePerDay = pricePerDay;
		this.pricePerHour = pricePerHour;
		this.taxService = texService;
	}
	
	public void processInvoice(CarRental carRental) {
		long t1 = carRental.getStart().getTime();
		long t2 = carRental.getFinish().getTime();
		double hours = (double) (t2 - t1) / 1000 / 60 / 60;
		
		double basicPayment;
		if(hours <= 12.0) {
			basicPayment = Math.ceil(hours) * pricePerHour;
		} else {
			basicPayment = Math.ceil(hours / 24) * pricePerDay;			
		}
		
		double tax = taxService.tax(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment, tax, null));
	}
}
