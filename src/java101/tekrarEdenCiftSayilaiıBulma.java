package java1011;

import java.util.Arrays;

public class tekrarEdenCiftSayilaiıBulma {

	public static void main(String[] args) {
		int max=0;
		int[] numbers= {2,2,3,5,6,98,8,8,9,16,18,30,30,40,98};
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]>max) {
				max=numbers[i];
			}
		}
		long[] newArray=new long[max];
		Arrays.fill(newArray,0);
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]%2==0) {
				if(newArray[numbers[i]-1]==0) {
					newArray[numbers[i]-1]++;
				}else {
					System.out.println(numbers[i]+" tekrar eden bir cift sayidir.");
				}
			}
		}
	}

}
