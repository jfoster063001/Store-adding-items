
public class ItemToPurchase {
		
	   private String itemName;
	   private int itemPrice;
	   private int itemQuantity;
	      
	   //Default Constructor
	   public ItemToPurchase(){ 
	    itemName = "none";
	    itemPrice = 0;
	    itemQuantity = 0;
	   }
	    
	   //public member methods (mutators & accessors)
	   public void setName(String name) {
			itemName = name;
			
		}
		public void setPrice(int price) {
			itemPrice = price;
			
		}
		public void setQuantity(int ammount) {
			itemQuantity = ammount;
			
		}
	   public String getName() {
			return itemName;
			
		}
		public int getPrice() {
			return itemPrice;
			
		}
		public int getQuantity() {
			return itemQuantity;
			
		}
	   
	   //print item to purchase
	   
	   public void printItemPurchase() {
	      System.out.println(itemQuantity + " " + itemName + " $" + itemPrice +  
	                         " = $" + (itemPrice * itemQuantity));
	   }
	}




