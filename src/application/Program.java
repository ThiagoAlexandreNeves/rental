package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Veihcle;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class Program {

	public static void main(String[] args) throws ParseException {
	
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
		
		System.out.println("Enter rental data");
		System.out.print("Car model: ");
		String modelo = s.nextLine();
		System.out.print("Pickup (dd/MM/yyyy HH:ss): ");
		Date start = sdf.parse(s.nextLine());
		System.out.print("Return (dd/MM/yyyy HH:ss): ");
		Date finish = sdf.parse(s.nextLine());
		
		CarRental cr = new CarRental(start, finish, new Veihcle(modelo));
		
		System.out.print("Enter price per hour: ");
		double hora = s.nextDouble();
		System.out.print("Enter price per day: ");		
		double dia = s.nextDouble();
		
		RentalService rentalService = new RentalService(dia, hora, new BrazilTaxService());
		
		rentalService.processInvoice(cr);
		
		System.out.println("INVOICE: ");
		System.out.print("Basic payment: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
		System.out.print("Tax: " + String.format("%.2f", cr.getInvoice().getTax()));
		System.out.print("Total payment: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));
		
		
		s.close();
	}
}
