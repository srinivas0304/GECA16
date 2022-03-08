class Star5{
	public static void main(String [] args) {
		Star1();
		
	}
	public static void Star1(){
		int space=3,star=1;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=space;j++){
				if(i==1&&j==1){
					System.out.print("*");
				}
					else if(i==2&&j==2){
						System.out.print("*");
					}
					else if(i==3&&j==3){
						System.out.print("*");
					}
					else if(i==4&&j==1){
						System.out.print("*");
					}
					
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
						