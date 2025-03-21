package SalesProyect;

public class Product {
    //------------- Attributes --------------
    private final int idProduct;        //Only read
    private static int counter;         //Counter for idProduct

    private String name;
    private double cost;


    //-------------- Constructor ---------------
    public Product(String name, double cost){
        this.idProduct = ++counter;     //Initial id= 1
        this.name=name;
        this.cost=cost;
    }

    //--------------- Methods -----------------
    public int getIdProduct() {
        return idProduct;
    }
    public String getName(){
        return name;
    }
    public double getCost() {
        return cost;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setCost(double cost){
        this.cost=cost;
    }

    @Override
    public String toString(){
        return "Product: { "+idProduct+ ", name: "+name+ ", cost: "+cost+" }";
    }
}
