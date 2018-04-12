package testimine.pillart.ee;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PillartFailTest {
    
     @Test
     public void FailTest(){
        open("http://www.pillart.ee/");
        $("#a_SysTopMenuTPL").click();
     }
}


