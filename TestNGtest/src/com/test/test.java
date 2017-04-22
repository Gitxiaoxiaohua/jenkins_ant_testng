package com.test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

//import org.junit.Test;
//
public class test {
//	public static void main(String[] args){
//		System.out.println("Test测试测试Ant");
//	}
	@Test
	public void test1(){
		System.out.println("这是第1个测试！");
		Reporter.log("这是第1个测试！");
	}
	@Test
	public void test2(){
		System.out.println("这是第2个测试！");
		Reporter.log("这是第2个测试！");
	}
	@Test
	public void test3(){
		System.out.println("这是第3个测试！");
		Reporter.log("这是第3个测试！");
	}
	@Test
	public void test4(){
		System.out.println("这是第4个测试！");
		Reporter.log("这是第4个测试！");
		Assert.fail();
	}
}
