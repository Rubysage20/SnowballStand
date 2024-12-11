import java.text.NumberFormat;
	import java.util.Scanner;

	public class ShavedIceStandDemo {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the name of the Shaved Ice Stand: ");
	        String name = scanner.nextLine();
	        System.out.print("Enter the zip code: ");
	        String zipCode = scanner.nextLine();

	        IceStand iceStand = new IceStand(name, zipCode);

	        Snowball smallSnowball = new Snowball();
	        Snowball mediumSnowball = new Snowball();
	        Snowball largeSnowball = new Snowball();

	        System.out.println("Prices for each size:");
	        System.out.println("Small $1.99");
	        System.out.println("Medium $2.55");
	        System.out.println("Large $3.99");

	        int totalQuantity = 0;
	        double totalSales = 0.0;

	        System.out.println("\nEnter the number of snowballs sold for each size (-1 to exit):");
	        while (true) {
	            System.out.print("Small: ");
	            int smallQty = scanner.nextInt();
	            if (smallQty == -1) {
	                break;
	            }
	            System.out.print("Medium: ");
	            int mediumQty = scanner.nextInt();
	            System.out.print("Large: ");
	            int largeQty = scanner.nextInt();

	            double smallTotal = smallSnowball.calculatePrice("Small", smallQty, 1.99);
	            double mediumTotal = mediumSnowball.calculatePrice("Medium", mediumQty, 2.55);
	            double largeTotal = largeSnowball.calculatePrice("Large", largeQty, 3.99);

	            double subtotal = smallTotal + mediumTotal + largeTotal;
	            double tax = Snowball.calculateTax(subtotal);
	            double total = subtotal + tax;

	            totalQuantity += smallQty + mediumQty + largeQty;
	            totalSales += total;

	            System.out.println("\nBill for " + iceStand.getName());
	            System.out.println("===============================");
	            System.out.println(smallSnowball);
	            System.out.println(mediumSnowball);
	            System.out.println(largeSnowball);
	            System.out.println("-----------------------");
	            System.out.println("Subtotal: " + NumberFormat.getCurrencyInstance().format(subtotal));
	            System.out.println("Tax (6%): " + NumberFormat.getCurrencyInstance().format(tax));
	            System.out.println("Total: " + NumberFormat.getCurrencyInstance().format(total));
	            System.out.println("===============================");
	        }

	        System.out.println("Total snowballs sold: " + totalQuantity);
	        System.out.println("Total sales: " + NumberFormat.getCurrencyInstance().format(totalSales));

	        scanner.close();
	    }
	}

}
