public class Main {

    public static void main(String[] args) {
        SalesManager stats = new SalesManager(new int[]{10, 20, 15, -10, 5});
        System.out.println("Максимальная продажа: " + stats.max());
        System.out.println("Минимальная продажа: " + stats.min());
        System.out.println("Среднее: " + stats.average());
    }
}