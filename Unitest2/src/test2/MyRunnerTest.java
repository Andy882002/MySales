package test2;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


import static org.junit.Assert.*;

import org.junit.Test;

public class MyRunnerTest {

	public static void main(String[] args) {
	      Result result = JUnitCore.runClasses(TestUnite.class);
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
	      System.out.println(result.wasSuccessful());
	      System.out.println("Hello My first change");
	   }
	

}
