package arraysproject;

import java.util.Arrays;

public class Main1 {
	public static void main(String[] args) {
		
		//creating an array - initialized to default value
		int nums[] = new int[10];
		nums[1]=100;
		nums[2]=23;
		// in C/C++ we initialize array as --> int x[10];
		
		//arrays are created dynamically 
		for(int i=0;i<nums.length;i++){
			System.out.println(nums[i]);
		}
		
		//creating initialized array to non-default values
		int nums2[]= {1,2,3,4,5,6,7,8,9};
		//traversing an array
		for(int i=0;i<nums2.length;i=i+2){
			System.out.println(nums2[i]);
		}
		
		//creating an array of object type
		String[] s=new String[5];
		// since String is a class in Java, the s array elements will be of object type.
		s[0]="Delhi";
		s[4]="Noida";
		//traversing an array of object type
		for(String str : s){
			System.out.println(str);
		}
		
		String[] s1={"Gurgaon","Hyderabad"};
		//traversing an array - enhanced for loop
		for(String str : s1){
			System.out.println(str);
		}
		
		//ARRAY METHODS
		//1. SORTING
		Arrays.sort(nums);
		for(int i=0;i<nums.length;i++){
			System.out.println(nums[i]);
		}
		
		//2. binarySearch on a sorted array
		Arrays.binarySearch(nums,23);
		
		//3. copyOf
		int x[]= Arrays.copyOf(nums,9); //copied array nums till 9th element into array x.
		for(int i=0;i<x.length;i++){
			System.out.println(x[i]);
		}
		
		//3. toString - convert elements of array into string type
		System.out.println(Arrays.toString(nums));
	}

}
