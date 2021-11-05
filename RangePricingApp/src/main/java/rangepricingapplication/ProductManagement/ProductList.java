package rangepricingapplication.ProductManagement;

import java.util.ArrayList;

public class ProductList {
    ArrayList<Product> productList;

    //generate 30 products
    public ProductList(int n) {
        int floorPrice;
        floorPrice= (int) Math.random()*(60-1)+1;
        int ceilingPrice;
        ceilingPrice= (int) Math.random()*(1000-200)+200;
        int targetPrice;
        targetPrice = (int) Math.random()*(61-199)+199;
        //this.productList = new Product();
    }
}
