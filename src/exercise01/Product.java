	package exercise01;

public class Product {
	public String name;
    public double price;
    public int quantity;

    public double totalValueInStock() {
        return price * quantity;
    }

    public void AddProducts(int quantity) {
        this.quantity += quantity;
    }
    
    public void RemoveProducts(int quantity) {
        this.quantity -= quantity;
    }
    
    public String toString() {
    	return name 
    		   + ", $ "
    		   + String.format("%.2f", price)
    		   + ", "
    		   + quantity
    		   + ", unitis, Total $"
    		   + String.format("%.2f", totalValueInStock());
    }
}
