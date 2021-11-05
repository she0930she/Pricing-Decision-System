/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rangepricingapplication;

import com.github.javafaker.Faker;
import rangepricingapplication.CustomerManagement.CustomerProfile;
import rangepricingapplication.OrderManagement.Order;
import rangepricingapplication.OrderManagement.OrderItem;
import rangepricingapplication.Personnel.Person;
import rangepricingapplication.ProductManagement.Product;

//import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class RangePricingApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Task1-1  --Sales Volume
        // new product
        Faker faker = new Faker();
        Product p1 = new Product(10, 100, 50);
        OrderItem oi1= new OrderItem(p1, 10);    //links orderItem & product
        p1.addOrderItem(oi1);                       //links product a& orderItem
        Product p2 = new Product(20, 100, 80);
        Product p3 = new Product(30, 550, 50);
        Product p4 = new Product(10, 1000, 50);
        Product p5 = new Product(10, 100, 90);
        Product p6 = new Product(10, 2000, 50);
        Product p7 = new Product(5, 900, 50);
        Product p8 = new Product(40, 1000, 50);
        Product p9 = new Product(60, 100, 90);
        Product p10 = new Product(10, 600, 50);
        System.out.println((int) Math.random()*(60-1)+1);
//        System.out.println((int) Math.random()*(1000-200)+200);

        //new customer
        Person c1= new Person("0045123");
        CustomerProfile cp1 = new CustomerProfile(c1);  //put c1 in CP1
        Order order1 = new Order(cp1);
        order1.newOrderItem(p1,10);             //order1 contains p1 product and quantity 10

    }
    
}
