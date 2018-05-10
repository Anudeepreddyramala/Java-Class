package com.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class File_read_write {

	public void create(String a,int n) {

		File f = new File("C:\\Softwares\\Test1.txt");
		try (FileWriter fw = new FileWriter(f); 
				PrintWriter pw = new PrintWriter(fw)) {

			for (int i = 1; i <= n; i++) {
				pw.println(i + " -- " + a);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void copy(int n) {
		try (FileReader fr = new FileReader("C:\\Softwares\\Test1.txt");
				FileWriter fw = new FileWriter("C:\\Softwares\\Test2.txt"); 
				BufferedReader br = new BufferedReader(fr);
				PrintWriter pr=new PrintWriter(fw);) {
			int i=0;
			String line;
			while ((line = br.readLine()) != null && i<n/2) {
				pr.println(line);;
				i++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		System.out.println("Enter number of lines in the file ");
		int n=sc.nextInt();
		

		File_read_write frw = new File_read_write();
		frw.create(a,n);
		frw.copy(n);
		sc.close();
	}
}
