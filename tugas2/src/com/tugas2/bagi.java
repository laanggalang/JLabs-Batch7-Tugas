package com.tugas2;

public class bagi extends angkaParent {
	float c=a/b;
	public float getc() {
		return c;	
		}
	
	public void printHasilBagi() {
		System.out.println("Hasil pembagian " + a + " / " + b + " = " + c);
	}
}
