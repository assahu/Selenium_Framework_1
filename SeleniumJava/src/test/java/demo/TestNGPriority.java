package demo;



import org.testng.annotations.Test;

public class TestNGPriority {
	@Test(priority = 1)
	public void test1() {
		System.out.println("I am inside test 1");
	}

	@Test(priority = 1)
	public void test2() {
		System.out.println("I am inside test 2");
		
	}
	@Test(priority = 1)
	public void test3() {
		System.out.println("I am inside test 3");
	}
}