package entities;

public class Product {

	
	private String name;
	private Double price;
	
	public Product() {
	}
	
	public Product(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	//aceita referência para metodo statico
	public static boolean staticProductPredicate(Product p) { 
		return p.getPrice()>=100.0;
	}

	//aceita referência para metodo não statico
	public boolean nonStaticProductPredicate() { //trabalha com o proprio objeto, não precisa declara o Objeto como argumento 
			return price>=100.0;
		}
	
	
	public static void staticConsumerPriceUpdate(Product p){
		p.setPrice(p.getPrice()*1.1);
	}
	public void nonStaticConsumerPriceUpdate(){
		this.price = (this.price * 1.1);
	}
	
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	
	
	
}
