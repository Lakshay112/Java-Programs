package task;

public class Factorial  {
		public int fact(int a){
			int fact=1;
			
			if(a==0|a==1 ){
			return 1;
		}else {
			
			for(int i=1;i<=a;i++){
				fact=fact*i;
			}
		}
		return fact;
			
		}
		}


