package backup;

	import java.text.NumberFormat;

	public class Snowball {
	    private String size;
	    private int quantity;
	    private double unitPrice;
	    private double totalPrice;

	    public static final double TAX_RATE = 0.06;

	    public Snowball() {
	        size = null;
	        quantity = 0;
	        unitPrice = 0.0;
	        totalPrice = 0.0;
	    }

	    public double calculatePrice(String size, int quantity, double unitPrice) {
	        this.size = size;
	        this.quantity = quantity;
	        this.unitPrice = unitPrice;
	        totalPrice = quantity * unitPrice;
	        return totalPrice;
	    }

	    public String toString() {
	        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
	        return "Size: " + size + "\nQuantity: " + quantity + "\nUnit Price: " + currencyFormatter.format(unitPrice)
	                + "\nTotal Price: " + currencyFormatter.format(totalPrice);
	    }

	    public static double calculateTax(double total) {
	        return total * TAX_RATE;
	    }
	}


