package com.na.bcnn;
import com.na.ucln.*;
public class BCNN {
	private UCLN check = new UCLN();
	private int a,b,bcMin;

	public void insertAB(int ax, int bx) {
		a=ax;
		b=bx;
	}
	public void bcNN() {
		check.insertAB(a,b);
		bcMin = (a*b)/check.ucln();
		System.out.println("BCNN la "+bcMin);
	}
}
