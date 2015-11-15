package Greedy;

public class VideoStreaming {
public static void main(String args[]) {
	int bits[] = {2000,6000,2000};
	int time[] = {1,2,1};
	int sum_bits = 0;
	int sum_times = 0;
	int r = 5000;
	
	for (int i=0;i<bits.length;i++) {
		sum_bits += bits[i];
		sum_times += time[i];
	}
	
	if (sum_bits < r * sum_times) 
		System.out.println("Schedule exists");
	else
		System.out.println("Nope");
}
}
