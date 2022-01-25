package tests.day08;

import org.testng.annotations.Test;

public class C01_Priority {


    @Test (priority = 9)
    public void youtubeTesti(){
        System.out.println("youtube testi calisti");
    }

    @Test(priority = 8)
    public void amazonTesti(){
        System.out.println("amazon testi calisti");

    }
    @Test(priority = 5)
    public void bestbuyTesti(){
        System.out.println("bestbuy testi calisti");

    }
}
