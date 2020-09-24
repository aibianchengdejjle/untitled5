package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	    /*student []a=new student[3];
	    int i;
        Scanner sc=new Scanner(System.in);
	    for(i=0;i<3;i++)
        {
            a[i]=new student(sc.next(),sc.next(),sc.next(),sc.next());
        }
        BufferedWriter bw=new BufferedWriter(new FileWriter("a.txt"));
	    for(i=0;i<3;i++)
        {
            bw.write(a[i].getId()+"   "+a[i].getName()+"  "+a[i].getAge()+"  "+a[i].getAddress());
            bw.newLine();
        }
	    bw.close();

	     */
        BufferedReader br=new BufferedReader(new FileReader("a.txt"));
        String line;
        while((line=br.readLine())!=null)
        {
            System.out.print(line);
        }
        br.close();
    }
}
