class Method2{
	public static void main(String [] args){
		int c=add(10,15);
		System.out.println("Sum of two numbers is:" +c);
		int s=add('a','A','a');
		System.out.println("Sum of three characteres is:" +s);
		double f=add(10,15.42,16.52);
		System.out.println("Sum of three combo is: " +f);
		double r=add(1.1,1.2,1.3);
		System.out.println("Sum of three doubles is: " +r);
	}
	public static int add(int a, int b){
		int d;
		d=a+b;
		return d;
		
	}
	public static int add(char ch, char s, char r){
		int b;
		b=(ch+s+r);
		return b;
	}
	public static double add(int a, double b, double c){
		double d;
		d=a+b+c;
		return d;
	}
	public static double add(double a, double b, double c){
		double d;
		d=a+b+c;
		return d;
	}
	
}
		