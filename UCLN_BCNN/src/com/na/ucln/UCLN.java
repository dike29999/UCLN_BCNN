package com.na.ucln;

public class UCLN {
	private int a,b,ucMax;
	public void insertAB(int ax, int bx) {
		a=ax;
		b=bx;
	}
	public int ucln() {
		int leftA=a;
		int leftB=b;
		if(a>=2&&b>=2) {
			while(leftA!=leftB) {
				if(leftA>leftB) {
					leftA=leftA-leftB;
				}else {
					if(leftA<leftB) {
						leftB=leftB-leftA;
					}
				}
			}
			if(leftA==leftB) {
				ucMax=leftA;
			}
			System.out.println("UCLN la "+ucMax);
		}
		else {
			System.out.println("FALSE");
			return 0;
		}
		return ucMax;
	}
}
