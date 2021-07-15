package demo;

import org.testng.annotations.Test;

@Test(groups= {"AllClassTest"})
public class TestNGGroupDemo {
	
	@Test(groups= {"sanity"})
	public void test1() {
		System.out.println("I am inside test 1");
	}

	@Test(groups= {"sanity","smoke"})
	public void test2() {
		System.out.println("I am inside test 2");
		
	}
	@Test(groups= {"smoke","regression"})
	public void test3() {
		System.out.println("I am inside test 3");
	}

}
