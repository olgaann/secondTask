public class Main {
    public static void main(String[] args) {

        SalesManager manager1 = new SalesManager("Иван Иванов", new long[]{10, 40, 60});
        SalesManager manager2 = new SalesManager("Петр Петров", new long[]{30, 4, 1} );
        SalesManager manager3 = new SalesManager("Мария Сидорова", new long[]{10, 5, 10});


        System.out.println(manager2.toString());
    }
}
