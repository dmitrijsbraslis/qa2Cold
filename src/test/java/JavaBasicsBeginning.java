import org.junit.jupiter.api.Test;

public class JavaBasicsBeginning {
    private String text = "Sum is: ";

    @Test
    public void sumTwoDigits() {
        Integer a = 45;
        Integer b = 90;

        double d = 1.50;
        double e = 99.30;

        double f = d + e;

        Integer c = sumAndPrint(a, b);

        System.out.println(text + "for int: " + c);
        System.out.println(text + "for double: " + f);
    }

    private Integer sumAndPrint(Integer a, Integer b) {
        Integer c = a + b;
        System.out.println(text + "for int: " + c);
        return c;
    }
}
