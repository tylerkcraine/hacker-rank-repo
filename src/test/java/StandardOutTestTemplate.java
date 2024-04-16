import org.junit.After;
import org.junit.Before;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class StandardOutTestTemplate {
    protected final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    protected final PrintStream outBak = System.out;

    @Before
    public void setup() {
        System.setOut(new PrintStream(outputStream));
    }

    @After
    public void restore() {
        System.setOut(outBak);
    }
}
