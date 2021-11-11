package com.reddy.device.sock;

import com.reddy.device.sock.material.MaterialType;
import com.reddy.device.sock.material.type.SockType;

public class Sock {

	private char size;
	private int pirce;
	private MaterialType mtype;
	private SockType stype;
	
	
	@Override
	public String toString() {
		
		return super.toString();
	}
	@Override
	public int hashCode() {
		
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {

		if (obj == null) {
			System.out.println("invoked equal method is not equal to null");
			return false;

		}
		if (obj instanceof Sock) {
			Sock casted = (Sock) obj;
		 Character char1 = casted.getSize();

			System.out.println(" Icecream FlavourType name :".concat(String.valueOf(char1)));

			if (this.size==char1) {
				System.out.println(" Sock size's are same");

				return true;
			} else {
				System.out.println("Sock size's are not same");
				return false;
			}

		}
		return false;
	}
	public char getSize() {
		return size;
	}
	public void setSize(char size) {
		this.size = size;
	}
	public int getPirce() {
		return pirce;
	}
	public void setPirce(int pirce) {
		this.pirce = pirce;
	}
	public MaterialType getMtype() {
		return mtype;
	}
	public void setMtype(MaterialType mtype) {
		this.mtype = mtype;
	}
	public SockType getStype() {
		return stype;
	}
	public void setStype(SockType stype) {
		this.stype = stype;
	}

	
}
