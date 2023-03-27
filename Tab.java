package week1;

public class Tab {
public int tabprice( int price) { 
	return price;
}
public String tabBrand(String Brand) {
	return Brand;
}
	public static void main(String[] args) {
	
Tab price=new Tab();
 
 System.out.println("Tab price is:" + price.tabprice(12000));
 System.out.println("Tab brand is:" +  price.tabBrand("Apple"));
	}

}
