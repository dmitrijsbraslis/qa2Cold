import org.junit.jupiter.api.Test;

public class JavaBasics {
    private String text = "Sum is: ";

    @Test
    public void sumTwoDigits() {
        sumAndPrint(45, 90);
        sumAndPrint(1, 3);
        sumAndPrint(405, 900);
    }

    private void sumAndPrint(Integer a, Integer b) {
        Integer c = a + b + b;
        System.out.println(text + "for int: " + c);
    }
}
