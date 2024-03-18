package com.ict.ex03;

public class TestMain_nonDI {
	public static void main(String[] args) {
		MyProcess process = new MyProcess();
		process.prn();
		
		System.out.println("===============");
		
		// 클래스의 상태값 변경
		MyProcess process2 = new MyProcess("둘리", 17);
		process2.prn();

		System.out.println("===============");

		MyProcess process3 = new MyProcess();
		process3.setName("희동이");
		process3.setAge(3);
		process3.prn();
	}
}
