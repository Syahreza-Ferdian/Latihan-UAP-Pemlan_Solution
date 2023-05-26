public class Domba extends Hewan {
    private double woolInKgPerDay; // Berapa kilogram wool yang dihasilkan oleh satu domba
    private double woolPrice; // Harga satu kg wool

    public Domba(){

    }

    public Domba(int quantitiy, double expensePerDay, double woolInKgPerDay, double woolPrice, double pricePerUnit){
        super("Domba", quantitiy, expensePerDay, pricePerUnit);
        setWoolInKgPerDay(woolInKgPerDay);
        setWoolPrice(woolPrice);
    }

    public void setWoolInKgPerDay(double woolInKgPerDay){
        this.woolInKgPerDay = woolInKgPerDay;
    }

    public void setWoolPrice(double woolPrice){
        this.woolPrice = woolPrice;
    }

    public double getWoolInKgPerDay(){
        return woolInKgPerDay;    
    }

    public double getWoolPrice(){
        return woolPrice;
    }

    // Method to return total of daily sell
    // For "Domba" instance, it can be written as following:
    // the total of wool per day (of all sheeps) * wool price
    public double dailySell(){
        // Code here
        return this.getQuantity() * woolInKgPerDay * woolPrice;
    }

    // Method to return total of profit for "Domba" instance
    // It can be written as following:
    // the total of daily sell - the total of expense
    public double dailyProfit(){
        // Code here
        return dailySell() - this.getTotalExpense();
    }

    // To String return a formatted string of Domba consisted of
    // Its name, quantitiy, and expese per day (you can get this with "super")
    // Ex:
    //  Nama        : Domba
    //  Jumlah      : 100 ekor
    //  Pengeluaran : Rp. 1.000.000 (per hari)
    //  Wool/hari   : 2,5 kg (per ekor)
    //  Harga wool  : Rp. 10,000 (per kg)
    //  Penjualan   : Rp. 2,500,000 (per hari)
    //  Profit      : Rp. 1,500,000 (per hari)
    @Override public String toString(){
        // Code here
        return super.toString() + String.format("%-25s: %s kg (per ekor)\n%-25s: Rp. %,3.2f (per kg)\n%-25s: Rp. %,3.2f (per hari)\n%-25s: Rp. %,3.2f (per hari)", 
        "Wool/hari", Double.toString(woolInKgPerDay), "Harga Wool", woolPrice, "Penjualan", dailySell(), "Profit", dailyProfit());
    }
}

