import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

import a3.Commands.CapitalizeTextCommand;

public class CapitalizeTest {

    @Test
    public void testExecute_CapitalizesFirstLetter() {
        CapitalizeTextCommand command = new CapitalizeTextCommand();
        assertEquals("Hello", command.execute("hello"));
        assertEquals("Java code", command.execute("java code"));
    }

    @Test
    public void testExecute_EmptyString() {
        CapitalizeTextCommand command = new CapitalizeTextCommand();
        assertThrows(IllegalArgumentException.class, () -> command.execute(""));
    }


}
