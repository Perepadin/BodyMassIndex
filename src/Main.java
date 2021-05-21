public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int Bmi = service.calculateBmi( 70, 1.65);
        System.out.println("Индекса массы тела (ИМТ):");
        System.out.println(Bmi);
    }
}