package Test1;

public class Testclass  {
	
	
	public void ms() {
		
	int i=1;
	
		for(i=0;i<=100;i++) {
			
			if (i == 20) {
				
				System.out.println("This is MS");
				
			}
			
					
			System.out.println("I value is"+ i);
			
		}		
		
	}
	
	public void whileloop() {
		
		int i=1;
		while(i<100) {
			i++;
			System.out.println("I value is"+ i);
			
			
		}
		
	}
	
	
	public void Factriol() {
		
		int i,fact = 1;
		int number = 5;
		for(i=1;i<=number;i++) {
			
			fact=fact*i;
			
			
		}
		
		System.out.println("Factrioal value "+number+"is: "+fact);
		
	}
	
	public void Factriol(int number) {
		int i,fact = 1;
		for(i=1;i<=number;i++) {
			
			fact=fact*i;
			System.out.println("Factrioal value "+number+"is: "+fact);
			
		}
	
	}
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Testclass tc = new Testclass();
		tc.ms();
		tc.whileloop();
		tc.Factriol();
		tc.Factriol(6);
	
	}

}
