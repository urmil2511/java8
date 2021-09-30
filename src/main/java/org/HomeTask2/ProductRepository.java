package org.HomeTask2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ProductRepository {

    public static List<Product> filterProduct(List<Product> products, Predicate<Product> predicate)
    {
        List<Product> result=new ArrayList<>();
        for(Product p:products)
        {
            if(predicate.test(p))
            {
                result.add(p);
            }
        }
        return result;
    }
    public static List<Response> filterResponse(List<Response> responses, Predicate<Response> predicate)
    {
        List<Response> result=new ArrayList<>();
        for(Response r:responses)
        {
            if(predicate.test(r))
            {
                result.add(r);
            }
        }
        return result;
    }
}
