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
	
	//aceita refer?ncia para metodo statico
	public static boolean staticProductPredicate(Product p) { 
		return p.getPrice()>=100.0;
	}
	//aceita refer?ncia para metodo n?o statico
	public boolean nonStaticProductPredicate() { //trabalha com o proprio objeto, n?o precisa declara o Objeto como argumento 
			return price>=100.0;
		}
	
//Consumer Methods	
	public static void staticConsumerPriceUpdate(Product p){
		p.setPrice(p.getPrice()*1.1);
	}
	public void nonStaticConsumerPriceUpdate(){
		this.price = (this.price * 1.1);
	}

//Function Methods
	public static String staticFunctionUpperCase(Product p){ //RETORNA STRING
		return p.getName().toUpperCase();
	}
	public String nonStaticFunctionUpperCase(){
		return name.toUpperCase();
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	
	
	
}
