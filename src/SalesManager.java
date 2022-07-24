public class SalesManager {
    protected long[] sales;
    protected String managerName;

    public SalesManager(String managerName, long[] sales) {
        this.managerName = managerName;
        this.sales = sales;
    }

    public String getManagerName() {
        return managerName;
    }

    public String toString() {
        return "Максимальная продажа менеджера " + this.getManagerName() + " cоставляет " + this.max() + " единиц товара.";
    }


    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
}
