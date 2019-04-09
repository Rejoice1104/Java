package Array_and_matrix;

import java.util.*;

public class Finding_missing_values {
	public static int find(ArrayList<Integer> list , int n) {
		
		int sum1 = (1+n)*n/2;
		int sum2=0;
		
		for(int i = 0; i < list.size(); i++) {
			sum2 = sum2 + list.get(i);
		}
		
		return sum1-sum2;	
	}
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int key;
		
		System.out.println("请输入缺失数组的长度");
		int n=scanner.nextInt();
		System.out.println("请输入缺失数组");
		for(int i = 0; i < n; i ++) {
			list.add(scanner.nextInt());
		}
		
		key = find(list, n);
		System.out.print("缺失的值：");
		System.out.println(key);
	}
}

