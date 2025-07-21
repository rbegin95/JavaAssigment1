public class CalculateInvoice {
    public static void main(String[] args) {
        // Create an Invoice object
        Invoice invoice = new Invoice("D2205-9445", "Rear Brakes for 2023 Kia Forte", 2, 60.00);

        // Display the values
        System.out.println("Part Number: " + invoice.getPartNum());
        System.out.println("Description: " + invoice.getPartDesc());
        System.out.println("Quantity: " + invoice.getqty());
        System.out.printf("Price per Item: $%.2f%n", invoice.getPriceOfItem());

        // Setting negative value
        invoice.setQuantity(-15);
        invoice.setPriceOfItem(-2.75);

        // Class prevents negative value 
        System.out.println("\nAfter Setting Negative Value Amount:");
        System.out.println("Quantity: " + invoice.getqty());
        System.out.printf("Price of Item: $%.2f%n", invoice.getPriceOfItem());
        System.out.printf("Total Invoice Amount: $%.2f%n", invoice.getInvoiceAmount());
    }
}
