import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

import a3.Commands.ReplaceTextCommand;

public class ReplaceTest {

    @Test
    public void testExecute_Replace() {
        ReplaceTextCommand command = new ReplaceTextCommand("Hello", "Hi");
        assertEquals("Hi", command.execute("Hello"));
        assertEquals("Java code", command.execute("Java code"));
    }

    @Test
    public void testExecute_EmptyString() {
        ReplaceTextCommand command = new ReplaceTextCommand("Hello", "Hi");
        assertThrows(IllegalArgumentException.class, () -> command.execute(""));
    }


}