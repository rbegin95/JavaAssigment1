public class Invoice {
    // Instance variables
    private String partNum;
    private String partDesc;
    private int qty;
    private double priceOfItem;

    //Constructor
    public Invoice(String partNum, String partDesc, int qty, double priceOfItem){
        this.partNum = partNum;
        this.partDesc = partDesc;
        setQuantity(qty);
        setPriceOfItem(priceOfItem);

    }

    public void setPartNum(String partNum){
        this.partNum = partNum;
    }

    public void setPartDesc(String partDesc){
        this.partDesc = partDesc;
    }

    public void setQuantity(int qty){
        this.qty = (qty > 0) ? qty : 0;
    }

    public void setPriceOfItem(double priceOfItem){
        this.priceOfItem = (priceOfItem > 0.0) ? priceOfItem : 0.0;
    }

    // Getters
    public String getPartNum(){
        return partNum;
    }

    public String getPartDesc(){
        return partDesc;
    }

    public int getqty(){
        return qty;
    }

    public double getPriceOfItem(){
        return priceOfItem;
    }

    // Calculate total invoice
    public double getInvoiceAmount(){
        return qty * priceOfItem;
    }
}
