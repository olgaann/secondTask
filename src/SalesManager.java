public class SalesManager {
    protected int[] sales;
    protected String managerName;

    public SalesManager(String managerName, int[] sales) {
        this.managerName = managerName;
        this.sales = sales;
    }

    public String getManagerName() {
        return managerName;
    }

    public String toString() {
        return "Максимальная продажа менеджера " + this.getManagerName() + " cоставляет " + this.max() + " единиц товара.";
    }


    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int min(){
        int min = sales[0];
        for (int sale : sales) {
            if(sale < min) {
                min = sale;
            }
        }
        return min;
    }
    public int cutAverage() { //метод расчета среднего "округленного" в меньшую сторону
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        int cutAverage = (sum - this.max() - this.min()) / (sales.length - 2);
        return cutAverage;
    }
}
