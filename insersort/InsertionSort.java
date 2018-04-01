public class InsertionSort{
	public int [] insertsort(int [] array){
		if(array.length==0){
			return array;
		}
		int current;
		for(int i=0;i<array.length-1;i++){
			current=array[i+1];
			int perIndex=i;
			while(perIndex>=0&&array[perIndex]>current){
				array[perIndex+1]=array[perIndex];
				perIndex--;
			}
			array[perIndex+1]=current;
		}
		return array;
	}
	public static void main(String [] args){
		int[]a={9,8,7,6,5,4,3,2,1,0,22};
		int[]b=new InsertionSort().insertsort(a);
		for(int i=0;i<a.length;i++){
			System.out.print(b[i]+" ");
		}
		
	}
}
