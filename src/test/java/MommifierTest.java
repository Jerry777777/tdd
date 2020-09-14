import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test
    void should_throw_exception_when_given_string_is_null() {
        //Given
        String stringOfNull = null;
        //When
        Mommifier mommifier = new Mommifier();
        //Then
        assertThrows(RuntimeException.class, () -> {
            mommifier.convertString(stringOfNull);
        });
    }

    @Test
    void should_return_itself_when_given_strings_with_no_repeat_vowels() {
        //Given
        String stringOfNoRepeat = "abcde";
        //When
        Mommifier mommifier=new Mommifier();
        String result = mommifier.convertString(stringOfNoRepeat);
        //Then
        assertEquals(result, "abcde");
    }
}
