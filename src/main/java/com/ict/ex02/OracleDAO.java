package com.ict.ex02;

public class OracleDAO implements DAO {
	
	public OracleDAO() {
		System.out.println("OracleDAO 생성자");
	}
	
	@Override
	public void prn() {
		System.out.println("Oracle prn() 메서드 실행");
	}

}
