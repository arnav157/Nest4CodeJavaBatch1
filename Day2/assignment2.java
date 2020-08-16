
public class assignment2 {

	 public static void main(String []args) {
		double  a = heightConvertor(5,11);
		double b = weightConvertor(60);
		System.out.println("Height in cm"+a);
		System.out.println("Weight in pound"+b);
	 }
	 static double heightConvertor(int heightFeetPart, int heightInchPart) {
		 float con= heightFeetPart* 12;
		 double e= con*2.54;
		 double t=heightInchPart*2.54;
		 double as =e+t;
		 return as;
		 
		 
		 
	 }
	 static double weightConvertor(int weight) {
		 double d= weight*2.2;
		 return d;
	 }
}
