public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double bmi = service.calculate(1.75, 50);
        System.out.printf("Ваш индекс массы тела %.2f\n", bmi);

        double bmi2 = service.calculate(1.55, 35);
        System.out.printf("Ваш индекс массы тела %.2f\n", bmi2);

        double bmi3 = service.calculate(1.64, 86);
        System.out.printf("Ваш индекс массы тела %.2f\n", bmi3);
    }
}
