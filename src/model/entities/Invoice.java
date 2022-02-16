package model.entities;

public class Invoice {
	
	private Double basicPayment;
	private Double tax;
	
	private Invoice invoice;
	
	public Invoice() {
	}

	public Invoice(Double basicPayment, Double tax, Invoice invoice) {
		this.basicPayment = basicPayment;
		this.tax = tax;
		this.invoice = invoice;
	}

	public Double getBasicPayment() {
		return basicPayment;
	}

	public void setBasicPayment(Double basicPayment) {
		this.basicPayment = basicPayment;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	
	public Double getTotalPayment() {
		return getBasicPayment() + getTax();
	}
}
