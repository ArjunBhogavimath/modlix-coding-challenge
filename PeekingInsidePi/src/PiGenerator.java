import java.math.BigDecimal;
import java.math.RoundingMode;

public class PiGenerator {

    public static BigDecimal computePi(int digits){
        BigDecimal pi = new BigDecimal(0);
        BigDecimal one = new BigDecimal(1);
        BigDecimal sixteen = new BigDecimal(16);

        // Ensure higher precision than requested to avoid floating-point errors
        int precision = digits + 5;

        for (int k = 0; k < digits; k++) {
            BigDecimal term1 = one.divide(sixteen.pow(k), precision, RoundingMode.HALF_UP);
            BigDecimal term2 = new BigDecimal(4).divide(new BigDecimal(8 * k + 1), precision, RoundingMode.HALF_UP);
            BigDecimal term3 = new BigDecimal(2).divide(new BigDecimal(8 * k + 4), precision, RoundingMode.HALF_UP);
            BigDecimal term4 = new BigDecimal(1).divide(new BigDecimal(8 * k + 5), precision, RoundingMode.HALF_UP);
            BigDecimal term5 = new BigDecimal(1).divide(new BigDecimal(8 * k + 6), precision, RoundingMode.HALF_UP);

            pi = pi.add(term1.multiply(term2.subtract(term3).subtract(term4).subtract(term5)));
        }

        // Round Pi to exact required digits
        return pi.setScale(digits, RoundingMode.HALF_UP);
    }
}
