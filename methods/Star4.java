class Star4{
	public static void main(String [] args){
		star1();
		System.out.println();
		star2();		
		
	}
	public static void star1(){
		int star=0;
		for(int i=1;i<=5;i++){
			star++;
			for(int j=1;j<=star;j++){
				System.out.print('*');
			}
			System.out.println();
		}
		
	}
	public static void star2(){
		int star=6;
		for(int i=1;i<=5;i++){
			star--;
			for(int j=1;j<=star;j++){
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
