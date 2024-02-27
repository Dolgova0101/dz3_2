public class BmiService {
    public double calculate(double height, double weight) {
        double bmi = Math.round(weight / Math.pow(height, 2));

        return bmi;
    }
}


