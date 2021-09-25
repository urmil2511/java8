package HomeTask6;

import java.util.Random;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;

public class HomeTaskSix {
    public static void main(String[] args) {
        IntPredicate number=n->{
            return IntStream.range(2,n/2).noneMatch(i->n%i==0);
        };
        Boolean flag=number.test(7);
        if(flag)
        {
            System.out.println("Prime Number");
        }
        else
        {
            System.out.println("Number is not prime number");
        }

        UnaryOperator<Integer> square= num->num*num;
        System.out.println(square.apply(5));

        IntSupplier random=()->new Random().nextInt(5000);
        System.out.println(random.getAsInt());

    }
}
