public class ShavedIceStand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// instantialize scanner object
        Scanner scanner = new Scanner(System.in);

        // ask user for input of name
        System.out.print("Enter the name of the Shaved Ice Stand: ");
        String name = scanner.nextLine();
        //ask user for input of location
        System.out.print("Enter the zip code: ");
        String zipCode = scanner.next();

        // instantialize new object of IceStand class with name and zip code as parameters
        IceStand iceStand = new IceStand(name, zipCode);

        // instantialize new objects for small, medium, large sizes of the Snowball class
        Snowball smallSnowball = new Snowball();
        Snowball mediumSnowball = new Snowball();
        Snowball largeSnowball = new Snowball();
        
        // print out price for each size
        System.out.println(" ");
        System.out.println("Prices for each size:");
        System.out.println("Small\t$1.99");
        System.out.println("Medium\t$2.55");
        System.out.println("Large\t$3.99");

        
        // ask user for input of size small quantity
        System.out.print("\nEnter number of small (-1 to exit): ");
        int smallQty = scanner.nextInt();
        // create while loop with sentinel value -1 for small size
        while (smallQty != -1) {
        	// validate input of small is not a negative number using while loop
        	while (smallQty < 0) { // if input is negative (unless -1) then ask for input again
        		System.out.print("Please enter valid quantity: ");
        		smallQty = scanner.nextInt();
        	}
        	// input for medium size
            System.out.print("Medium:\t\t");
            int mediumQty = scanner.nextInt();
            // validate that medium input is not negative value
            while (mediumQty < 0) {
            	System.out.print("Please enter valid quantity: ");
        		mediumQty = scanner.nextInt();
            }
            // input for large size
            System.out.print("Large:\t\t");
            int largeQty = scanner.nextInt();
            // validate that large input is not negative value
            while (largeQty < 0) {
            	System.out.print("Please enter valid quantity: ");
        		largeQty = scanner.nextInt();
            }
            
            // call calculatePrice method from Snowball class for each object to calculate price of each
            // size using the three parameters 
            double smallTotal = smallSnowball.calculatePrice("Small", smallQty, 1.99);
            double mediumTotal = mediumSnowball.calculatePrice("Medium", mediumQty, 2.55);
            double largeTotal = largeSnowball.calculatePrice("Large", largeQty, 3.99);

            // add size totals to get the subtotal
            double subtotal = smallTotal + mediumTotal + largeTotal;
            // calculate the tax of sale by calling calculateTax method from Snowball class
            double tax = Snowball.calculateTax(subtotal);
            // calculate bill total by adding subtotal and tax
            double total = subtotal + tax;

            // output
            System.out.println(" ");
            // call toString from IceStand class to print title
            System.out.println(iceStand);
            System.out.println("=====================================");
            System.out.println(" ");
            System.out.println("\t\t   Qty\tPrice\tTotal");
            // call toString from Snowball class to print each size's quantity, unit price, and total
            System.out.println(smallSnowball);
            System.out.println(mediumSnowball);
            System.out.println(largeSnowball);
            System.out.println("-------------------------------------");
            // print subtotal, tax, and total with currency format
            System.out.println("Subtotal\t\t\t" + NumberFormat.getCurrencyInstance().format(subtotal));
            System.out.println("Tax (6%)\t\t\t" + NumberFormat.getCurrencyInstance().format(tax));
            System.out.println("\t\t\tTotal\t" + NumberFormat.getCurrencyInstance().format(total));
            System.out.println("=====================================");
            System.out.println(" ");
            // ask user to input another set of quantities or -1 to exit program
            System.out.println("\nEnter number of small (-1 to exit):\t");
            smallQty = scanner.nextInt();
            while (smallQty < -1) {
        		System.out.print("Please enter valid quantity: ");
        		smallQty = scanner.nextInt();
        	}
            
            
        }
        
        // sentinel value -1 entered, exit program and say farewell to user
        System.out.println(" ");
        System.out.println("Thank you for your business!");

        scanner.close();

	}

}
