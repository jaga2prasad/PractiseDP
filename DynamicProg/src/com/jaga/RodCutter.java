package com.jaga;

public class RodCutter {
	private static int compute(int[] price,int n) {
		int[] output = new int[n+1];
		output[0] = 0;
		int maxValue = -1;
		String op="";
		for(int i=1;i<=n;i++) {
			//String op = "";
			for(int j=1;j<=i;j++) {
				int temp = price[j-1]+output[i-j];
				if(temp>maxValue) {
					maxValue = temp;
					op = i+" "+j;
				}
			}
			output[i] = maxValue;
		}
		System.out.println(op);
		return output[n];
	}
	public static void main(String[] args) {
		int[] n = {1,5,8,9,10};
		System.out.println(compute(n,5));
	}
}
