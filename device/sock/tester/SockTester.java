package com.reddy.device.sock.tester;

import com.reddy.device.sock.Sock;
import com.reddy.device.sock.material.MaterialType;
import com.reddy.device.sock.material.type.SockType;

public class SockTester {

	public static void main(String[] args) {

		Sock sock1 = new Sock();
		System.out.println(sock1.toString());
		System.out.println(sock1.hashCode());

		sock1.setSize('S');
		sock1.setMtype(MaterialType.NYLON);
		sock1.setStype(SockType.ANKLE);
		sock1.getSize();
		sock1.getMtype();
		sock1.getStype();

		System.out.println("......................................");

		Sock s = new Sock();
		s.setSize('S');
		s.setMtype(MaterialType.COTTON);
		s.setStype(SockType.ZARA);

		s.getSize();
		s.getMtype();
		s.getStype();

		boolean char1 = sock1 == s;
		System.out.println(char1);

	}

}
