class P2{
	boolean b;
	static int i=10;
	static {
		System.out.println("From SIB -1");
		System.out.println(i);
		P2 a=new P2();
		System.out.println(a);
		System.out.println(a.b);
	}
	public static void main(String [] args){
		System.out.println("From main[]");
		System.out.println(P2.i);
	}
	static {
		boolean b=true;
		System.out.println("From SIB -2");
		System.out.println(b);
		P2 a=new P2();
		System.out.println(a);
		System.out.println(new P2());
		System.out.println(a.i);
	}
}
	