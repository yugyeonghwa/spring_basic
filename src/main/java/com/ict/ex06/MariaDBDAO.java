package com.ict.ex06;

import org.springframework.stereotype.Component;

@Component
public class MariaDBDAO implements DAO {
	
	public MariaDBDAO() {
		System.out.println("MariaDBDAO 생성자");
	}

	@Override
	public void prn() {
		System.out.println("MariaDBDAO prn()");
	}

}
