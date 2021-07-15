package demo;

import org.testng.annotations.Test;

public class TestNGRetryAnalyzerDemo {

	@Test(retryAnalyzer = demo.RetryAnalyzer.class)
	public void test1() {
		System.out.println("I am inside test 1");
	}

	@Test(retryAnalyzer = demo.RetryAnalyzer.class)
	public void test2() {
		System.out.println("I am inside test 2");
		
	}
	@Test(retryAnalyzer = demo.RetryAnalyzer.class)
	public void test3() {
		System.out.println("I am inside test 3");
		int i = 1/0;
	}
}
