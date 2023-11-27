public class Main1 {
    public static void main(String[] args) {
        Parent p = new Child();
        System.out.println(((Child) p).ch);
        System.out.println(p.pa);
        System.out.println(((Child) p).pa);

        p.method();
        new Child().method();
    }
}
