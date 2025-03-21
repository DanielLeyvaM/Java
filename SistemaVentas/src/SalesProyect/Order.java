package SalesProyect;

public class Order {
    //Attributes
    private final int idOrder;
    private static int counterOrder;        //Counter for idOrder

    private Product[] products;             //Array of products

    private int counter=0;                  //Counter of products in array
    private static final int MAX_VALUE= 5;


    // Methods
    public Order(){
        this.idOrder=++counterOrder;
        this.products= new Product[MAX_VALUE];      //Array is created in constructor
    }

    public void addProduct(Product p1){
        if(counter >= MAX_VALUE){
            System.out.println("Limit of products reached (" +MAX_VALUE+ ")");
        }
        else {
            this.products[counter] = p1;
            counter++;
        }
    }

    public double total(){
        double total=0;
        for(int i=0; i<counter; i++){
            Product p1= this.products[i];       //Object of products[i] is assigned to var p1
            total= total+ p1.getCost();
        }
        return total;
    }

    public void printOrder(){
        System.out.println("Id order: "+this.idOrder);
        System.out.println("Cost: "+this.total());
        System.out.println("Products: ");
        for(int i=0; i<counter; i++){
            //System.out.println(this.products[i].toString());       //Prints array of products
            System.out.println(this.products[i]);
        }
    }

}
