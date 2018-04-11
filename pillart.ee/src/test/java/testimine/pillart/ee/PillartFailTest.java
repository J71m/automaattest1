/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testimine.pillart.ee;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author j71m
 */
public class PillartFailTest {
     @Test
     public void FailTest(){
        open("http://www.pillart.ee/");
        $("#a_SysTopMenuTPL").click();
     }
}


