class C{
	static boolean b;
	static int i=10;
	static {
		System.out.println(b);
		boolean b=true;
		System.out.println(b);
	}
	public static void main(String [] args){
		System.out.println("From main[]");
		System.out.println(C.b);
		System.out.println(C.i);
	}
	public static void sleep(){
		System.out.println("From Sleep");
	}
	static {
		System.out.println(C.i);
		b=true;
		C.sleep();
	}
}