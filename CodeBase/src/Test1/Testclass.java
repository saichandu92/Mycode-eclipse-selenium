package Test1;

import java.util.Scanner;

import org.testng.annotations.*;


public class Testclass  {
	
@Test(priority=0)
	public void ms() {
		
	int i=1;
	
		for(i=0;i<=100;i++) {
				
			if (i == 20) {
				
				System.out.println("This is MS");
				
			}
			
					
			System.out.println("I value is"+ i);
			
		}		
		
	}

 @BeforeClass
	public void whileloop() {
		
		int i=1;
		while(i<100) {
			i++;
			System.out.println("I value is"+ i);
			
			
		}
		
	}
	 
	@BeforeMethod
	public void Factriol() {
		
		int i,fact = 1;
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		for(i=1;i<=number;i++) {
			
			fact=fact*i;
			
			
		}
		
		System.out.println("Factrioal value "+number+"is: "+fact);
	}

@Parameters({"Count"})
@Test(priority=1)
	public void Factriol(@Optional("5") int Count) {
		int i,fact = 1;
		for(i=1;i<=Count;i++) {			
			fact=fact*i;
			System.out.println("Factrioal value "+Count+"is: "+fact);
			
		}
		
	}

	
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		Testclass tc = new Testclass();
//		tc.ms();
//		tc.whileloop();
//		tc.Factriol();
//		tc.Factriol(6);
//	
//	}

}
