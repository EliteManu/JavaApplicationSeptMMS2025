import.java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in)
		
		int num, sum = 0, product = 1, count = 0;
		System.out.println("Enter 3 numbers:");

		while(count <3){
			num = scanner.nextInt();
			sum = sum + num;
			product = product * num;
			count++;
		}
		System.out.println("%nsum = " + sum);
		System.out.println("product = " + product);

		if(sum % 2 ==0 && (sum %10 ==0 || sum %3 ==)){
			if (product > 200){
				System.out.println("hungry!!");
			}else {
				System.out.println("false");
		}
	}
else{ 
System.out.println("I must solve this program on my own !!");
}
	Scanner.close();
	{
		
	}