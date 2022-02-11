package model.entities;

public class Invoice {
	
	private double basicPayment;
	private double tax;
	
	private Invoice invoice;
	
	public Invoice() {
	}

	public Invoice(double basicPayment, double tax, Invoice invoice) {
		this.basicPayment = basicPayment;
		this.tax = tax;
		this.invoice = invoice;
	}

	public double getBasicPayment() {
		return basicPayment;
	}

	public void setBasicPayment(double basicPayment) {
		this.basicPayment = basicPayment;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
}
