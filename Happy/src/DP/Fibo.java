package DP;

public class Fibo {
	
	public int arr[];
	public int num;
	
	Fibo(int num){
		arr= new int[num+1];
		this.num =  num;
		for(int i = 0;i<arr.length;i++)
			arr[i] = 0;
	}
	
	int fibonacci(int num) {
		if(arr[num] == 0) {
			if(num == 1 || num == 2)
			{
				arr[num] = num;
			}
		
			else {
				arr[num] = fibonacci(num-1)+fibonacci(num-2);
			}
		}
		return arr[num];
	}
public static void main(String args[]){
	
	Fibo f = new Fibo(10);
	System.out.println(f.fibonacci(5));
}
}
