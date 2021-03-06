package testimine.pillart.ee;
import org.junit.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class PillartTest {
    
     @Test
     public void UITest() {
        open("http://www.pillart.ee/");
        $("#a_SysTopMenuTPL_213").click();
        $("h1").shouldHave(text("Teenus"));       
        $("#a_SysTopMenuTPL_157").click();        
        $("#left-side").shouldHave(text("Hea külaline,"));
        $("#a_SysTopMenuTPL_").click();
        $(".haldus_txtlink").shouldHave(text("Kasutajanimi"));
     }

     @Test
     public void Login(){
        open("http://www.pillart.ee/");
        $("#a_SysTopMenuTPL_").click();
        $("#Kasutajanimi").setValue("deyocito@eth2btc.info");
        $("#Kasutajanimi").click();
        $("#Parool").setValue("asdasd");
        $("#Kasutajanimi").pressEnter();
        $("#Navigation").shouldHave(text("Lahku"));
        $(".last_topmenu").click();
     }

     @Test
     public void Shopping(){
         open("http://www.pillart.ee/");
         $("#a_SysTopMenuTPL_199").click();
         $("#stree_SysLeftMenuTPL8").click();
         $("#item_title").click();
         $("img[src='http://www.pillart.ee/templates/default/img/addcart.png']").click();
         $("html").pressEnter();
         $("#stree_SysLeftMenuTPL1").click();
         $("input[value='Eemalda']").click();
         $("#left-side").shouldHave(text("Ostukorv on tühi"));
     }
}
