import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RTWTestCaseTest {

     @Test
     public void should_new_a_rtw_test_case(){
         RTWTestCase rtwTestCase = new RTWTestCase();
         assertEquals(rtwTestCase.size(), 0);   
     }
}
