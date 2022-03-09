package com.tugas1;

import java.util.TreeMap;
import java.util.TreeSet;

public class tugas1 {
	public static void main(String[] arg) {
		
		System.out.println("-----INI ADALAH CONTOH ARRAY TREESET-----");
		
		TreeSet<Integer> rollNumber = new TreeSet();
		rollNumber.add(17);
		rollNumber.add(13);
		rollNumber.add(28);
		rollNumber.add(16);
		rollNumber.add(45);
		rollNumber.add(53);
		rollNumber.add(29);
		
		for (Integer item : rollNumber) {
			System.out.println(item);
		}
		
		
		System.out.println("-----INI ADALAH CONTOH ARRAY TREEMAP-----");
		
		TreeMap<Integer, String> umurPegawai = new TreeMap();
		umurPegawai.put(25, "izam");
		umurPegawai.put(23, "reza");
		umurPegawai.put(26, "agung");
		umurPegawai.put(28, "hasan");
		umurPegawai.put(21, "ike");
		umurPegawai.put(30, "restu");
		umurPegawai.put(35, "afif");
		umurPegawai.put(24, "galang");
		
		for (Integer key : umurPegawai.keySet()) {
			System.out.println("Pegawai atas nama " + umurPegawai.get(key) + " sudah berusia " + key);
		}
	}
}
