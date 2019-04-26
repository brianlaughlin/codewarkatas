package kata.kyu7.printerrors;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    @Test
    public void testPrinterErrorTotalNumberOfChar(){
        Assert.assertEquals("0/3", Printer.printerError("aaa"));
    }

    @Test
    public void testPrintErrorBadChar(){
        String badCharacters = "xxxx";
        Assert.assertEquals("4/4", Printer.printerError(badCharacters));
    }

    @Test
    public void test() {
        System.out.println("printerError Fixed Tests");
        String s = "aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz";
        assertEquals("3/56", Printer.printerError(s));
    }
}