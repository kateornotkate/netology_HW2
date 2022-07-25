public class Main {

    public static void main(String[] args) {
        SalesManager stats = new SalesManager(new int[]{5, -10, 15, -2, 3});
        System.out.println("Максимальная продажа: " + stats.max());
    }
}