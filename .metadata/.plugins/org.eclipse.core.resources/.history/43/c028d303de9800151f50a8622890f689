package test02;

public class Quicksort_1 {
	
	public static void main(String[] args){
		int[] array = createArray(10);
		toString(array);
		quickSort(array,0,array.length-1);
		toString(array);
	}
	
	public static void quickSort(int[] n,int l,int r){
		if(isEmpty(n)){
			return;
		}
		if(l<r){
			int slice = sort(n,l,r);
			quickSort(n,l,slice-1);
			quickSort(n,slice+1,r);
		}
	}
	
	public static int sort(int[] n,int start,int end){
		int tmp = n[start];
		while(start<end){
			while(n[start]<tmp)
				start++;
			while(n[end]>tmp)
				end--;
			if(start<end){
				int change = n[start];
				n[start] = n[end];
				n[end] = change;
			}
		}
		n[end] = tmp;
		return end;
	}
	
	public static boolean isEmpty(int[] n){
		if(n == null || n.length == 0){
			return true;
		}
		else 
			return false;
	}
	
	public static int[] createArray(int num){
		int[] array = new int[num];
		for(int i=0;i<array.length;i++){
			array[i] = (int)(Math.random()*100);
		}
		return array;
	}
	
	public static void toString(int[] array){
		for(int i=0;i<array.length;i++){
			System.out.print(" "+array[i]);
		}
		System.out.println();
	}
}
