package Test1;

public class Test2 {
	
public void Strats() {
		
		for (int i = 0; i<5 ; i++) { 
			
			if(i==1){
					continue;
							}
			
			if(i==3) {
											
				continue;
			}
		if(i==5){
			
			
		}
		for (int j = 0; j < 5 - i; j++) 
		{
			
		System.out.print(" "); 
		} 
		if(i > 10) {
			
			
		}
		for (int k = 0; k <= i; k++) 
		{ 
			System.out.print("* "); 
		} 
		
		System.out.println(); 
		} 
		
		
}

		
	public static void main(String[] args) {
		Test2 t2 = new Test2();
		t2.Strats();

	}

}
