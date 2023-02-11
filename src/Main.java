public class Main {
    public static void main(String[] args) {
        BMIService service = new BMIService();
        double heightM = 1.87;
        int weightKg = 98;

        int index = service.calculate(heightM, weightKg);
        System.out.println(index);
    }
}