/**
*�����е��ظ�����
*@author yangfei
*
*
*	
*/
public class DuplicateClass{
	static int duplicate;
	public boolean Duplication(int[]array,int length){
		if(array==null||length<=0){
            System.out.println("���鲻��Ϊ��....");
			return false;
		}
		for(int i=0;i<length;++i){
			if(array[i]<0||array[i]>length-1){
				System.out.println("��������ֲ��ڷ�Χ��....");
				return false;
				
			}
		}
		for(int i=0;i<length;++i){
			while(array[i]!=i){
				if(array[i]==array[array[i]]){
					duplicate=array[i];
					return true;
				}
				int temp;
				temp=array[i];
				array[i]=array[temp];
				array[temp]=temp;
			}
		}
		return false;
	}
	public static void main(String [] args){
		int [] array={1,500,6,8,9,8,9,5,3,1};
		int length=array.length;
		boolean bool;
		bool=new DuplicateClass().Duplication(array,length);
		System.out.print(bool+"    "+DuplicateClass.duplicate);
	}
}