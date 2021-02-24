public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmi = service.calculate(1.75, 50);
        System.out.printf("Ваш индекс массы тела " + "%.2f", bmi, "");

    }
}
