public class ShellSort{
	public int [] shellsort(int[] array){
		int len=array.length;
		int temp,gap=len/2;
		while(gap>0){
			for(int i=gap;i<len;i++){
				temp=array[i];
				int perIndex=i-gap;
				while(perIndex>=0&&array[perIndex]>temp){
					array[perIndex+gap]=array[perIndex];
					perIndex-=gap;
				}
				array[perIndex+gap]=temp;
			}
			gap/=2;
		}
		return array;
	}
	public static void main(String[] args){
		int []a={10,8,7,6,5,4,3,2,1,0};
		int []b=new ShellSort().shellsort(a);
		for(int i=0;i<a.length;i++){
			System.out.print(b[i]+" ");
		}
	}
}