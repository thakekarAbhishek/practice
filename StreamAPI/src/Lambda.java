import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Lambda {
    public static void main(String[] args) {



        //implementing interfaces without creating implementation class
        // only for functional interfaces (one abstract method only)
        Inter i = new Inter() {
            @Override
            public void sayHi(int a) {
                System.out.println("using anonymous class : " + a);
            }
        };
        i.sayHi(7);

        Inter lambda = (a) -> System.out.println("using lambda : " + a);
        lambda.sayHi(9);
    }
}
