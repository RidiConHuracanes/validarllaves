import org.junit.Test;
import static org.junit.Assert.*;

public class ValidSequenceTest {

    @Test
    public void testIsSequenceValid() {
        String sequence1 = "{{{}}}"; // Secuencia correcta
        String sequence2 = "{}{}{{}}"; // Secuencia correcta
        String sequence3 = "{}{}{{}"; // Secuencia incorrecta

        assertTrue(ValidSequence.isSequenceValid(sequence1));
        assertTrue(ValidSequence.isSequenceValid(sequence2));
        assertFalse(ValidSequence.isSequenceValid(sequence3));
    }
}
