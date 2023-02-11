public class BMIService {

    public int calculate(double heightM, int weightKg) {
        int index = (int) (weightKg / (heightM * heightM));

        return index;
    }
}
