/**
Ã°ÅİÅÅĞòËã·¨JAVAÊµÏÖ¡£


*/
public class	BubbleClass {
	public int[] bubble(int []array){
		if(array.length==0){
			return array;
		}
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array.length-1-i;j++){
				if(array[j+1]<array[j]){
					int temp=array[j+1];
					array[j+1]=array[j];
					array[j]=temp;
				}
			}
		}
		return array;
	}
	public static void main(String[] args) 
	{	int [] a={9,8,7,6,5,4,3,2,1};
		int []b=new BubbleClass().bubble(a);
		for(int i=0;i<9;i++){
		System.out.print(b[i]);
		}
	}
}
