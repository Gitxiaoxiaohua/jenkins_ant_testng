package com.test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

//import org.junit.Test;
//
public class test {
//	public static void main(String[] args){
//		System.out.println("Test���Բ���Ant");
//	}
	@Test
	public void test1(){
		System.out.println("���ǵ�1�����ԣ�");
		Reporter.log("���ǵ�1�����ԣ�");
	}
	@Test
	public void test2(){
		System.out.println("���ǵ�2�����ԣ�");
		Reporter.log("���ǵ�2�����ԣ�");
	}
	@Test
	public void test3(){
		System.out.println("���ǵ�3�����ԣ�");
		Reporter.log("���ǵ�3�����ԣ�");
	}
	@Test
	public void test4(){
		System.out.println("���ǵ�4�����ԣ�");
		Reporter.log("���ǵ�4�����ԣ�");
		Assert.fail();
	}
}
