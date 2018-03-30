/**
选择排序。

*/
class SelectionSort{
	public static int [] selectionsort(int [] array){
		if(array.length==0)
			return array;
		for(int i=0;i<array.length;i++){
			int minIndex=i;//最小的那个数等于i。
			for(int j=i;j<array.length;j++){
				if(array[j]<array[minIndex]){
					minIndex=j;
				}
				//经过一轮比较厚把最小的放在排好的后面。
				
			}
			int temp=array[minIndex]; 
			array[minIndex]=array[i];
			array[i]=temp;
		}
		return array;
	}
}
//测试类
public class selectionsorttest{
	public static void main(String [] args){
		int []a={9,80,6,22,5,99,3,2,1};
		int []b;
		b=SelectionSort.selectionsort(a);
		for(int i=0;i<9;i++){
		System.out.print( b[i]+" ");
		}
	}
}