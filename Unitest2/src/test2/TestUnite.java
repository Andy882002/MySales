package test2;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestUnite {
     TestRunner ntest=new TestRunner();
	@Test
	public void test() {
		ntest.Mytesting();
	}
	
	@Test
	   public void testAdd() {
	      String str= "Junit is working fine";
	      assertEquals("Junit is working fine",str);
	   }

}
