import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {

        //optional is not serializable
        String s = "Abhishek";
        Optional<String> a = Optional.ofNullable(s);
        System.out.println(a.get());
        a.ifPresent(System.out::println);
        System.out.println(a.isPresent());
        System.out.println(a.orElse("not present"));
        System.out.println(Optional.empty().orElse("not present"));
        System.out.println(Optional.ofNullable(null).orElse("not present"));
    }
}
