package HomeTask4;

import java.util.List;
import java.util.function.Consumer;

public class Print {

    public static void printConsumer(List<Product> products, Consumer<Product> consumer)
    {
        for (Product p:products)
        {
            consumer.accept(p);
        }
    }
}
