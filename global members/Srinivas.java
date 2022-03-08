class Srinivas{
	static String loc="Hyderabad";
	static {
		System.out.println(loc);
		Srinivas.loc="warangal";
		System.out.println("Srinivas actual location is: "+ Srinivas.loc);
	}
	public static void main(String [] args){
		System.out.println("Hello India");
		System.out.println(loc);
	}
}