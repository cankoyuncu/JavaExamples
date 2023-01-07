public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1023,"Asus Laptop","Rog Strix Gaming Laptop",2000,10,"Black");

        Product product2 = new Product(){

        };

        product2.setId(1023);
        product2.setName("HP Laptop");
        product2.setDescription("Rog Strix Gaming Laptop");
        product2.setPrice(20000);
        product2.setStockAmount(10);
        product2.setColour("Black");

        ProductManager productManager1 = new ProductManager();
        productManager1.Add(product1);
        System.out.println("1.Product code: " + product1.getCode());
        System.out.println("2.Product code: " + product2.getCode());

        System.out.println(product1);

    }
}