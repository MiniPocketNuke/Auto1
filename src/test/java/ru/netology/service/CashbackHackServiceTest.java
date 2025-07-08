package ru.netology.service;

import org.testng.annotations.Test;
import org.testng.Assert;
public class CashbackHackServiceTest {


    @Test
    void CashbackTest(){
    CashbackHackService service = new CashbackHackService();
    int amount = 900;
    int expected = 100;
    int actual = service.remain(amount);
    Assert.assertEquals(actual, expected);}

    @Test
    void CashbackTest2(){
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);}
    @Test
    void CashbackTest3(){
        CashbackHackService service = new CashbackHackService();
        int amount = 1;
        int expected = 999;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);


}}
