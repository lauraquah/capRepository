public class Prime{
	
	public static void main(String args[]){
		int b = 10;
		displaySeries(b);
	}


	public static boolean isPrime(int a){
		 if (a%2==0) return false;
		    for(int i=3;i*i<=a;i+=2) {
		        if(a%i==0)
		            return false;
		    }
		    return true;
	}
	
	public static void displaySeries(int b){
		int no=2;
		for(int i=0; i<b;){
			if(isPrime(no)){
				System.out.println(no);
				no++;
				i++;
			}
			else{
				no++;
			}
		}
	}
}


