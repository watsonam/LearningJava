//ADDS TWO BINARY NUMBERS OF EQUAL LENGTHS.

public class BinaryAdder {

	static String Adder(String arg1, String arg2, String arg3) {
			String value;
			int solver = Integer.valueOf(arg1) + Integer.valueOf(arg2) + Integer.valueOf(arg3);
			if(arg1.equals("0") && arg2.equals("0") && arg3.equals("0")) {
				return value = "0";
			} else if (solver%2 == 1) {
				return value = "1";
			} else {
				return value = "0";
			}
		}
	
	static String Carry(String arg1, String arg2, String arg3) {
			String value;
			int solver = Integer.valueOf(arg1) + Integer.valueOf(arg2) + Integer.valueOf(arg3);
			if(arg1.equals("0") && arg2.equals("0") && arg3.equals("0")) {
				return value = "0";
			} else if (solver%2 == 0) {
				return value = "1";
			} else {
				return value = "0";
			}
		}
	//code for main routine
	public static void main(String args[]) {
		//CHANGE addElements AS INPUTS TO THE ADDER.
		String addElement1 = "111";
		String addElement2 = "110";
		String initialCarry =  "0";
		String adderOutput;
		String sCarry;
		int length = addElement1.length() - 1;
				
		String a = Character.toString(addElement1.charAt(length));
		String b = Character.toString(addElement2.charAt(length));
		adderOutput = Adder(a,b,initialCarry);
		sCarry = Carry(a,b,initialCarry);
		
		//Take rightmost element, use adder, use carry, loop to next left elements and repeat.
		length--;
		for(int i = length;i>-1;i--) {
			a = Character.toString(addElement1.charAt(length));
			b = Character.toString(addElement2.charAt(length));
			adderOutput = Adder(a,b,sCarry) + adderOutput;
			sCarry = Carry(a,b,sCarry);
		}
		
		System.out.println(sCarry + adderOutput);
	}
	
	}
	
