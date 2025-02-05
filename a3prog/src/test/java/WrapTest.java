import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

import a3.Commands.WrapTextCommand;

public class WrapTest {

    @Test
    public void testExecute_Wrap() {
        WrapTextCommand command = new WrapTextCommand("Hello", "Hello");
        assertEquals("HellohelloHello", command.execute("hello"));
        assertEquals("Hellojava codeHello", command.execute("java code"));
    }

    @Test
    public void testExecute_EmptyString() {
        WrapTextCommand command = new WrapTextCommand("Hello", "Hello");
        assertThrows(IllegalArgumentException.class, () -> command.execute(""));
    }


}