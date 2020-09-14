import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MommifierTest {
    @Test
    void should_return_none_if_string_is_none() {
        //Given
        String stringOfNone = "";
        //When
        Mommifier mommifier = new Mommifier();
        String result = mommifier.convertString(stringOfNone);
        //Then
        assertEquals(result, "");
    }
}
