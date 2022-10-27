import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();

        double bmi = service.calculate(44, 1.60);

        System.out.printf("%.1f", bmi);
    }
}
