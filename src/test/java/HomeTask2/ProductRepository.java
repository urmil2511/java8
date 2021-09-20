package HomeTask2;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ProductRepository {

    public static List<Product> filterProduct(List<Product> products, Predicate<Product> predicate)
    {
        return products.stream().filter(predicate::test).collect(Collectors.toList());
    }
    public static List<Response> filterResponse(List<Response> responses, Predicate<Response> predicate)
    {
        return responses.stream().filter(predicate::test).collect(Collectors.toList());
    }
}
