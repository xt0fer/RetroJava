import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class TestFileCounting {
    public TestFileCounting() {
    }

    @Test
    public void TestScanString0() {

        String inputtext = "Hello\n";
        String expected = "\t1\t1\t6";

        FileCounting fc = new FileCounting();
        String actual = fc.ScanString(inputtext);
        System.out.println(actual);
        assertTrue(expected.equals(actual));
    }

    @Test
    public void TestScanString1() {

        String inputtext = "Hello World\n";
        String expected = "\t1\t2\t12";

        FileCounting fc = new FileCounting();
        String actual = fc.ScanString(inputtext);
        System.out.println(actual);
        assertTrue(expected.equals(actual));
    }

    @Test
    public void TestScanString2() {

        String inputtext = "Hello Cruel\nWorld.\n";
        String expected = "\t2\t3\t19";

        FileCounting fc = new FileCounting();
        String actual = fc.ScanString(inputtext);
        System.out.println(actual);
        assertTrue(expected.equals(actual));
    }

    @Test
    public void TestScanString3() {

        String inputtext = "Hello Cruel\nWorld.\n\nFoo bar baz\n";
        String expected = "\t4\t6\t32";

        FileCounting fc = new FileCounting();
        String actual = fc.ScanString(inputtext);
        System.out.println(actual);
        assertTrue(expected.equals(actual));
    }

    @Test
    public void TestScanString4() {

        String inputtext = "Friends, Romans, countrymen, lend me your ears;\nI come to bury Caesar, not to praise him.\n";
        String expected = "\t2\t16\t90";

        FileCounting fc = new FileCounting();
        String actual = fc.ScanString(inputtext);
        System.out.println(actual);
        assertTrue(expected.equals(actual));
    }

    @Test
    public void TestScanString5() {

        String inputtext = "Reduced to mere skeletons by one’s grief.\n哀毁骨立 (Aī huǐ gǔ lì)\n";
        String expected = "\t2\t12\t76";

        FileCounting fc = new FileCounting();
        String actual = fc.ScanString(inputtext);
        System.out.println(actual);
        assertTrue(expected.equals(actual));
    }

    @Test
    public void TestScanString6() {

        String inputtext = "Come I to speak in Caesar’s funeral.\n";
        String expected = "\t1\t7\t39";

        FileCounting fc = new FileCounting();
        String actual = fc.ScanString(inputtext);
        System.out.println(actual);
        assertTrue(expected.equals(actual));
    }
}