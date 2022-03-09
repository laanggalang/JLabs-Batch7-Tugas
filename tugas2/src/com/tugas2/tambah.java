package com.tugas2;

public class tambah extends angkaParent {
	float c=a+b;
	public float getc() {
		return c;	
		}
	
	public void printHasilTambah() {
		System.out.println("Hasil penjumlahan " + a + " + " + b + " = " + c);
	}
}
