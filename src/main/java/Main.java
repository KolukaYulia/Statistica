public class Main {
    public static void main(String[] args) {
        StatisticsService service = new StatisticsService();
        long[] incomes = {4, 5, 1, 6, 4};
        int rezult = (int) service.findMax(incomes);
        System.out.print(rezult);
    }
    }


