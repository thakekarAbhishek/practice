import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> l = List.of(1,2,3,4,5,10,7,9,8,20);
        Stream<Integer> s = l.stream();
//        List<Integer> l1 = s.filter(p->p%2==0).collect(Collectors.toList());
//        System.out.println(l1);

        Predicate<Integer> predicate = p -> p%2==0 ;
        List<Integer> l2 = s.filter(predicate).collect(Collectors.toList());
        System.out.println("predicate : "+ l2);

        Consumer<Integer> consumer = c -> System.out.println("consumer" + c);
        l.stream().forEach(consumer);

        System.out.println(l.stream().map(p->p*2).collect(Collectors.toList()));
         List<Integer> q= l.stream().map(p->p*2).collect(Collectors.toList());


        l.stream().filter(p->p%2==0).map(p->{
            System.out.println("hi");
            return p*p;
        }).sorted().forEach(Main::abc);

        l.stream().filter(p->p%2==0).map(p->p*p).sorted().forEach(Main::abc);

        System.out.println(l.stream().min((x,y)->x.compareTo(y)).get());
        System.out.println(l.stream().min(Integer::compareTo).get());

        System.out.println(l.stream().max((x,y)->x.compareTo(y)).get());

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

    static void abc(Integer a){
        System.out.println(a*10);
    }
}