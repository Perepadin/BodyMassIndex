public class BmiService {
    public int calculateBmi(int weight, double height) {
        double Bmi = weight / (height * height);
        return (int) Bmi;
    }
}
