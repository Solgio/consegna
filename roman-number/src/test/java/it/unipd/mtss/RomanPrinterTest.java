package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class RomanPrinterTest {
    
    @Test
    public void shouldPrintI_WhenInputIs1() {
        //ARRANGE
        String expected = "  ___ \n" +
                         " |_ _|\n" +
                         "  | | \n" +
                         "  | | \n" +
                         " |___|\n";
        //ACT
        String result = RomanPrinter.print(1);
        //ASSERT
        assertEquals(expected, result);
    }

    @Test
    public void shouldPrintII_WhenInputIs2() {
        //ARRANGE
        String expected = "  ___   ___ \n" +
                         " |_ _| |_ _|\n" +
                         "  | |   | | \n" +
                         "  | |   | | \n" +
                         " |___| |___|\n";
        //ACT
        String result = RomanPrinter.print(2);
        //ASSERT
        assertEquals(expected, result);
    }

    @Test
    public void shouldPrintIII_WhenInputIs3() {
        //ARRANGE
        String expected = "  ___   ___   ___ \n" +
                         " |_ _| |_ _| |_ _|\n" +
                         "  | |   | |   | | \n" +
                         "  | |   | |   | | \n" +
                         " |___| |___| |___|\n";
        //ACT
        String result = RomanPrinter.print(3);
        //ASSERT
        assertEquals(expected, result);
    }

    @Test
    public void shouldPrintIV_WhenInputIs4() {
        //ARRANGE
        String expected = "  ___  __     __\n" +
                         " |_ _| \\ \\   / /\n" +
                         "  | |   \\ \\ / / \n" +
                         "  | |    \\ V /  \n" +
                         " |___|    \\_/   \n";
        //ACT
        String result = RomanPrinter.print(4);
        //ASSERT
        assertEquals(expected, result);
    }

    @Test
    public void shouldPrintV_WhenInputIs5() {
        //ARRANGE
        String expected = " __     __\n" +
                         " \\ \\   / /\n" +
                         "  \\ \\ / / \n" +
                         "   \\ V /  \n" +
                         "    \\_/   \n";
        //ACT
        String result = RomanPrinter.print(5);
        //ASSERT
        assertEquals(expected, result);
    }

    @Test
    public void shouldPrintVI_WhenInputIs6() {
        //ARRANGE
        String expected = " __     __  ___ \n" +
                         " \\ \\   / / |_ _|\n" +
                         "  \\ \\ / /   | | \n" +
                         "   \\ V /    | | \n" +
                         "    \\_/    |___|\n";
        //ACT
        String result = RomanPrinter.print(6);
        //ASSERT
        assertEquals(expected, result);
    }

    
    @Test
    public void shouldPrintVII_WhenInputIs7() {
        //ARRANGE
        String expected = " __     __  ___   ___ \n" +
                         " \\ \\   / / |_ _| |_ _|\n" +
                         "  \\ \\ / /   | |   | | \n" +
                         "   \\ V /    | |   | | \n" +
                         "    \\_/    |___| |___|\n";
        //ACT
        String result = RomanPrinter.print(7);
        //ASSERT
        assertEquals(expected, result);
    }

    @Test
    public void shouldPrintVIII_WhenInputIs8() {
        //ARRANGE
        String expected = " __     __  ___   ___   ___ \n" +
                         " \\ \\   / / |_ _| |_ _| |_ _|\n" +
                         "  \\ \\ / /   | |   | |   | | \n" +
                         "   \\ V /    | |   | |   | | \n" +
                         "    \\_/    |___| |___| |___|\n";
        //ACT
        String result = RomanPrinter.print(8);
        //ASSERT
        assertEquals(expected, result);
    }

    @Test
    public void shouldPrintIX_WhenInputIs9() {
        //ARRANGE
        String expected = "  ___  __    __\n" +
                         " |_ _| \\ \\  / /\n" +
                         "  | |   \\ \\/ / \n" +
                         "  | |   / /\\ \\ \n" +
                         " |___| /_/  \\_\\\n";
        //ACT
        String result = RomanPrinter.print(9);
        //ASSERT
        assertEquals(expected, result);
    }

    @Test
    public void shouldPrintX_WhenInputIs10() {
        //ARRANGE
        String expected = " __    __\n" +
                        " \\ \\  / /\n" +
                        "  \\ \\/ / \n" +
                        "  / /\\ \\ \n" +
                        " /_/  \\_\\\n";
        //ACT
        String result = RomanPrinter.print(10);
        //ASSERT
        assertEquals(expected, result);
    }


    @Test
    public void shouldPrintXV_WhenInputIs15() {
        //ARRANGE
        String expected = " __    __ __     __\n" +
                          " \\ \\  / / \\ \\   / /\n" +
                          "  \\ \\/ /   \\ \\ / / \n" +
                          "  / /\\ \\    \\ V /  \n" +
                          " /_/  \\_\\    \\_/   \n";
        //ACT
        String result = RomanPrinter.print(15);
        //ASSERT
        assertEquals(expected, result);
    }

    @Test
    public void shouldPrintIXX_WhenInputIs19() {
        //ARRANGE
       String expected = " __    __  ___  __    __\n" +
        " \\ \\  / / |_ _| \\ \\  / /\n" +
        "  \\ \\/ /   | |   \\ \\/ / \n" +
        "  / /\\ \\   | |   / /\\ \\ \n" +
        " /_/  \\_\\ |___| /_/  \\_\\\n";
        //ACT
        String result = RomanPrinter.print(19);
        //ASSERT
        assertEquals(expected, result);
    }

    @Test
    public void shouldPrintXX_WhenInputIs20() {
        //ARRANGE
        String expected = " __    __ __    __\n" +
        " \\ \\  / / \\ \\  / /\n" +
        "  \\ \\/ /   \\ \\/ / \n" +
        "  / /\\ \\   / /\\ \\ \n" +
        " /_/  \\_\\ /_/  \\_\\\n";
        //ACT
        String result=RomanPrinter.print(20);
        //ASSERT
        assertEquals(expected, result);
    }

    @Test
    public void shouldPrintL_WhenInputIs50() {
        //ARRANGE
        String expected = "  _     \n" +
                         " | |    \n" +
                         " | |    \n" +
                         " | |___ \n" +
                         " |_____|\n";
        //ACT
        String result = RomanPrinter.print(50);
        //ASSERT
        assertEquals(expected, result);
    }

    @Test
    public void shouldPrintXCIX_WhenInputIs99(){
        //ARRANGE
        String expected = " __    __   ____   ___  __    __\n" +
                        " \\ \\  / /  / ___| |_ _| \\ \\  / /\n" +
                        "  \\ \\/ /  | |      | |   \\ \\/ / \n" +
                        "  / /\\ \\  | |___   | |   / /\\ \\ \n" +
                        " /_/  \\_\\  \\____| |___| /_/  \\_\\\n";
        //ACT
        String result = RomanPrinter.print(99);
        //ASSERT
        assertEquals(expected, result);
    }

    @Test
    public void shouldPrintC_WhenInputIs100(){
        //ARRANGE
        String expected= "   ____ \n"+
                         "  / ___|\n"+
                         " | |    \n"+
                         " | |___ \n"+
                         "  \\____|\n";
        //ACT
        String result = RomanPrinter.print(100);
        //ASSERT
        assertEquals(expected, result);
    }

    @Test
    public void shouldPrintD_WhenInputIs500(){
        //ARRANGE
        String expected= 
                        "  ____  \n"+
                         " |  _ \\ \n"+
                         " | | | |\n"+
                         " | |_| |\n"+
                         " |____/ \n";
        //ACT
        String result = RomanPrinter.print(500);
        //ASSERT
        assertEquals(expected, result);
    }

    @Test
    public void shouldPrintCMXCIX_WhenInputIs999(){
        String expected= 
                        "   ____   __  __  __    __   ____   ___  __    __\n"+
                         "  / ___| |  \\/  | \\ \\  / /  / ___| |_ _| \\ \\  / /\n"+
                         " | |     | |\\/| |  \\ \\/ /  | |      | |   \\ \\/ / \n"+
                         " | |___  | |  | |  / /\\ \\  | |___   | |   / /\\ \\ \n"+
                         "  \\____| |_|  |_| /_/  \\_\\  \\____| |___| /_/  \\_\\\n";
        String result = RomanPrinter.print(999);
        assertEquals(expected, result);
    }

    @Test
    public void shouldPrintM_WhenInputIs1000(){
        String expected= 
                        "  __  __ \n"+
                         " |  \\/  |\n"+
                         " | |\\/| |\n"+
                         " | |  | |\n"+
                         " |_|  |_|\n";
        String result = RomanPrinter.print(1000);
        assertEquals(expected, result);
    }


    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowException_WhenInputIsZero() {
        RomanPrinter.print(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowException_WhenInputIsGreaterThan1000() {
        RomanPrinter.print(1001);
    }

     @Test
    public void testConstructor() {
        RomanPrinter printer = new RomanPrinter();
        assertNotNull(printer);
    }
}
