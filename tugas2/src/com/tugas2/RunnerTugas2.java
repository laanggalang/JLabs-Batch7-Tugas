package com.tugas2;

public class RunnerTugas2 extends angkaParent{
	public static void main(String []args) {
		System.out.println("Berikut adalah hasil operasi Bilangan " + a + " dan " + b);
		
		tambah hasiltbh = new tambah();
		hasiltbh.printHasilTambah();
		
		kurang hasilkrg = new kurang();
		hasilkrg.printHasilKurang();
		
		kali hasilkl = new kali();
		hasilkl.printHasilKali();
		
		bagi hasilbg = new bagi();
		hasilbg.printHasilBagi();
	}
}
