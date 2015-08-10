import org.junit.*;
import static org.junit.Assert.*;
import java.io.Console;


public class SnoopDogTest {
@Test
public void snoopWords_returnUserInput_wordDoesntChage(){
    SnoopDog testSnoop = new SnoopDog();
    assertEquals("hello", testSnoop.snoopWords("hello"));
    }

@Test public void snoopWords_replaceSWithZ_wordChanges(){
    SnoopDog testSnoop = new SnoopDog();
    assertEquals("rozez", testSnoop.snoopWords("roses"));
    }

@Test public void snoopWords_doesNotReplaceFirstS_firstLetterSame(){
    SnoopDog testSnoop = new SnoopDog();
    assertEquals("sunzhine", testSnoop.snoopWords("sunshine"));
    }
}
