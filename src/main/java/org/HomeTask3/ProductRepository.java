package org.HomeTask3;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ProductRepository {

    public static List<org.HomeTask3.Product> filterProduct(List<org.HomeTask3.Product> products, Predicate<org.HomeTask3.Product> predicate)
    {
        List<org.HomeTask3.Product> result=new ArrayList<>();
        for(Product p:products)
        {
            if(predicate.test(p))
            {
                result.add(p);
            }
        }
        return result;
    }

}
