import SalesProyect.Order;
import SalesProyect.Product;

public class Main {
    public static void main(String[] args) {

        System.out.println("----------- TEST MAIN ------------");
        Product p1=new Product("Camisa1",100.2);
        Product p2=new Product("Camisa2",200.2);
        Product p3=new Product("Camisa3",300.2);
        Product p4=new Product("Camisa4",400.2);
        Product p5=new Product("Camisa5",500.2);
        Product p6=new Product("Camisa6",600.2);

        //System.out.println(p1.toString());
        //System.out.println(p1);                 //Override toString

        Order o1=new Order();
        System.out.println("Total: " +o1.total());

        o1.addProduct(p1);
        o1.addProduct(p2);
        o1.addProduct(p3);
        o1.addProduct(p4);
        o1.addProduct(p5);
        o1.addProduct(p6);

        o1.printOrder();

        //--------- New order -----------
        System.out.println();
        Order o2=new Order();

        o2.addProduct(p1);
        o2.addProduct(p2);
        o2.addProduct(p3);

        o2.printOrder();
    }
}