public class Main {
    public static void main(String[] args) {

        SalesManager manager1 = new SalesManager("Иван Иванов", new int[]{10, 40, 60, 1, 4, 49});

        System.out.println(manager1.cutAverage());
    }
}
