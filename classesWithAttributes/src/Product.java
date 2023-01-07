public class Product{
    public Product(int id, String name, String description, double price, int stockAmount, String colour){
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockAmount = stockAmount;
        this.colour = colour;
    }
    public Product(){

    }
    //attribute || field
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String colour; //encapsul

    //getter
    public int getId(){
        return id;
    }
    //setter
    public void setId(int id){
        this.id=id; //burdaki this kullanımı bu class'dan bahsettigim anlamina gelmektedir.
        //burda this kullanmak yerine yukardaki tanımlamaların hepsinde _id, _name gibi isim verilebilir.
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getCode(){
        return this.name.substring(0,1) + id;
    }

    @Override
    public String toString() {
        return this.id + " : " + this.name + " : " + this.description ;
    }
}
