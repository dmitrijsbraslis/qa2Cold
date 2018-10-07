import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JavaBasic {
    private String text;

    @Test
    public void ourFirstTest() {
        Integer a = 15;
        Integer b = 99;

        Integer c = 95;
        Integer d = 150;

        text = "The sum is: ";

        sumAndPrint(a, b);

        sumAndPrint(c, d);

        Assertions.assertEquals(246, c + d, "Wrong sum!");
    }

    private void sumAndPrint(Integer a, Integer b) {
        Integer sum = a + b;
        System.out.println(text + sum);
    }
}
