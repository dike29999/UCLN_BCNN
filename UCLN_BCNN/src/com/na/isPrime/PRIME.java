package com.na.isPrime;

public class PRIME {
	public boolean isPrime (int n) {
		boolean result =true;
		int i=2;
		if(n<i) {
			result=false;
		}
		else {
			while(i<=n/2) {
				if(n%i==0) {
					result=false;
					break;
				}
				i++;
			}
		}
		return result;
	}
}
