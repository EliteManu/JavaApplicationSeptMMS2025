import java.util.Scanner;

public class EvenNumbers{
	public static void main(String[] args){
		int[] numbers ={7, 8, 4, 3, 2, 9, 0, 1, 6, 8};
		int[] temp = new int[numbers.length];
		int count = 0;
		
		for(int num : numbers){
				if(num % 2 ==0){
					temp[count] = num;
					count++;
				}
			}
			
			int[] evens = new int [count];
			for(int i = 0; i < count; i++){
				evens[i] = temp[i];
			}
			
			for(int e : evens){
				System.out.print(e + " ");
			}
		}
	}
