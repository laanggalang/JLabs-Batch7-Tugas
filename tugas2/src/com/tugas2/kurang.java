package com.tugas2;

public class kurang extends angkaParent {
	float c=a-b;
	public float getc() {
		return c;	
		}
	
	public void printHasilKurang() {
		if (c<=0) {
			System.out.println("Error karena hasil pengurangan dibawah angka 0 atau minus");
		}
		else {
			System.out.println("Hasil pengurangan " + a + " - " + b + " = " + c);
		}
	}
}
