/**
ѡ������

*/
class SelectionSort{
	public static int [] selectionsort(int [] array){
		if(array.length==0)
			return array;
		for(int i=0;i<array.length;i++){
			int minIndex=i;//��С���Ǹ�������i��
			for(int j=i;j<array.length;j++){
				if(array[j]<array[minIndex]){
					minIndex=j;
				}
				//����һ�ֱȽϺ����С�ķ����źõĺ��档
				
			}
			int temp=array[minIndex]; 
			array[minIndex]=array[i];
			array[i]=temp;
		}
		return array;
	}
}
//������
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