package test02;

public class EightQueen {
	public static final int COUNT = 6;
	public static int INDEX = 1;
	public static int[][] array = createCheers();
	
	public static void main(String[] args){
		eightQueen(0,0);
	}
	
	public static boolean eightQueen(int row,int column){
		if(row>=COUNT){
			System.out.println(INDEX +": ");
			toString(array);
			System.out.println();
			INDEX++;
			return false;
		}
		for(int i=0;i<COUNT;i++){
			if(limit(row,i)){
				array[row][i]=1;
				if(!eightQueen(row+1,0)){
					array[row][i]=0;
				}
				else{
					return true;
				}
			}
		}
		return false;
	}
	
	
	public static boolean limit(int row,int column){
		if(isRow(row,column)&&isLT(row,column)&&isLB(row,column)){
			return true;
		}
		else
			return false;
	}
	
	
	public static boolean isRow(int row,int column){
		for(int i=0;i<row;i++){
			if(array[i][column]==1){
				return false;
			}
		}
		return true;
		
	}
	
	public static boolean isLT(int row,int column){
		int i=row;
		int j=column;
		while(i>=0&&j>=0){
			if(array[i][j]==1){
				return false;
			}
			i--;
			j--;
		}
		return true;
	}
	
	public static boolean isLB(int row,int column){
		int i=row;
		int j=column;
		while(i>=0&&j<COUNT){
			if(array[i][j]==1){
				return false;
			}
			i--;
			j++;
		}
		return true;
	}
	
	public static int[][] createCheers(){
		int[][] array = new int[COUNT][COUNT];
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array[i].length;j++){
				array[i][j] = 0;
			}
		}
		return array;
	}
	
	public static void toString(int[][] array){
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array[i].length;j++){
				System.out.print(array[i][j]+"  ");
			}
			System.out.println();
		}
	}
}
