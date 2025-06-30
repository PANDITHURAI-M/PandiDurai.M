package problem1;

public class Calculator {

	double a , b;
	String operation;
	
	public Calculator(double a , double b , String operation) {
		// TODO Auto-generated constructor stub
		this.a=a;
		this.b=b;
		this.operation=operation.toLowerCase();
	}
	 public void calculate() {
		 double result;
		
				
				switch (operation) {
				case "add":{
					result= addition(a, b);
					System.out.println("Result : "+result);
					break;
				}
				case "subtract":{
					 result= subtraction(a, b);
					 System.out.println("Result : "+result);
					 break;
				}
				case "multiply":{
					 result= multiplication(a, b);
					 System.out.println("Result : "+result);
					 break;
				}
				case "divide":{
					if(b==0) {
						System.out.println("Error : Division by zero ");
					}else {
					 result= division(a, b);
					 System.out.println("Result : "+result);
					 break;
					}
				}

				default:
					System.out.println("Invalid Operation . Use add , subrtact , multiply , division");
					
					
				}
			
	 }
	 
	    public static double addition(double a , double b) {
			return a+b;
		}
		
		public static double subtraction(double a , double b) {
			return a-b;
		}
		public static double division(double a , double b) {
			
			return a/b;
		}
		public static double multiplication(double a , double b) {
			return a*b;
		}
}
