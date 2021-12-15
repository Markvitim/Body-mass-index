public class Main {
    public static void main(String[] args) {
        BMIService service = new BMIService();
        float result = service.calculate(64f, 1.64f);
        System.out.println("Индекс массы тела " + result);

    }
}
