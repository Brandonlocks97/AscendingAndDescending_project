
public class AscendingAndDescending{
	
	public static void main(String[] args){
		
		int num1 = 5;
		int	num2 = 1;
		int num3 = 10;
		
		if(num1 > num2 && num1 > num3){
				
			if(num2 > num3){
				System.out.print(num1 + " " + num2 + " " + num3);
			}
			else if(num2 < num3){
				System.out.print(num1 + " " + num3 + " " + num2);
			}
		}
		
		else if(num2 > num1 && num2 > num3){
			
				if(num1 > num3){
					System.out.print(num2 + " " + num1 + " " + num3);
				}
				else if(num1 < num3){
					System.out.print(num2 + " " + num3 + " " + num1);
				}
			
			
		}
		else if(num3 > num1 && num3 > num2){
				
				if(num1 > num2){
					System.out.print(num3 + " " + num1 + " " + num2);
				}
				
				else if(num2 > num1){
					System.out.print(num3 + " " + num2 + " " + num1);
				}
			
		}
		
		
		
		
	}
	
}