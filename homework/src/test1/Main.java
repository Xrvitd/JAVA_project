package test1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n,sum=0;
		n=in.nextInt();
		n=n/10;
		sum=n;
		sum+=(n/5)*2;
		sum+=n%5/3;
		System.out.println(sum);
	}
}
