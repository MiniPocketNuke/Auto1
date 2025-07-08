package ru.netology.service;

import org.junit.Test;
import org.junit.Assert;
public class CashbackHackServiceTest {


    @Test
    public void CashbackTest(){
    CashbackHackService service = new CashbackHackService();
    int amount = 900;
    int expected = 100;
    int actual = service.remain(amount);
    Assert.assertEquals(expected, actual);}

    @Test
    public void CashbackTest2(){
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        Assert.assertEquals(expected, actual);}
    @Test
    public void CashbackTest3(){
        CashbackHackService service = new CashbackHackService();
        int amount = 1;
        int expected = 999;
        int actual = service.remain(amount);
        Assert.assertEquals(expected, actual);


}
}
