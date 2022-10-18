package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1, "Laptop", "Monster Laptop", 8500, 7, "siyah");
		// product.setName("Laptop");
		// product.setId(7);
		// product.setDescription("Monster Laptop");
		// product.setPrice(8500);
		// product.setStockAmount(7);
		// product.getId();

		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getName());
	}

}
