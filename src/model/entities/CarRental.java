package model.entities;

import java.util.Date;

public class CarRental {
	
	private Date start;
	private Date finish;
	
	private Veihcle veihcle;
	private Invoice invoice;
	
	public CarRental() {	
	}
	
	public CarRental(Date start, Date finish, Veihcle veihcle) {
		this.start = start;
		this.finish = finish;
		this.veihcle = veihcle;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getFinish() {
		return finish;
	}

	public void setFinish(Date finish) {
		this.finish = finish;
	}

	public Veihcle getVeihcle() {
		return veihcle;
	}

	public void setVeihcle(Veihcle veihcle) {
		this.veihcle = veihcle;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
}
