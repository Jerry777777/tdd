import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MommifierTest {
    @Test
    void should_return_none_if_string_is_none() {
        String stringOfNone = "";
        Mommifier mommifier = new Mommifier();
        String result = mommifier.convertString(stringOfNone);
        assertEquals(result, "");
    }

    @Test
    void should_throw_exception_when_given_string_is_null() {
        String stringOfNull = null;
        Mommifier mommifier = new Mommifier();
        assertThrows(RuntimeException.class, () -> {
            mommifier.convertString(stringOfNull);
        });
    }

    @Test
    void should_return_itself_when_given_strings_with_no_repeat_vowels() {
        String stringOfNoRepeat = "abcde";
        Mommifier mommifier = new Mommifier();
        String result = mommifier.convertString(stringOfNoRepeat);
        assertEquals(result, "abcde");
    }

    @Test
    void should_insert_mommy_when_string_have_repeat_vowels_more_than_30_percent() {
        String stringRepeatLess = "aabceed";
        Mommifier mommifier = new Mommifier();
        String result = mommifier.convertString(stringRepeatLess);
        assertEquals(result, "amommyabcemommyed");
    }
}
