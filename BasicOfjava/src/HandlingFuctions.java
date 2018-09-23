
public class HandlingFuctions {

	public static void main(String[] args) {
		// 1.MainFunction or predefines function or default function
		// 2.i wont change
		// 3.its a standard
 //main function should be static it wont change
		// TODO Auto-generated method stub
		System.out.println("its is a mainfunction");
		
	int u=	dologin(30,10, "deepan");
	System.out.println(u);
	
		dologin(100,300,"ramu");
		
		getdata();
		// in main function we call any userdefined funtion
		//N number of times we can call functions
	}

	//public static void dologin(int x, int y,String str) 
	public static int dologin(int x, int y,String str) 
	//aruguments passed in main fucntion
	{
		// userdefind function
		String str1=str;
		//int x=30;
		//int y=10;
		int z=x+y;
		System.out.println(str1);
		
		System.out.println(z);
		//we can call any function inside the userdefined function
        //here function declration 
		//paramters or arguements are same words
		//System.out.println("its login");
		return z;
	}

	public static void doLogout() 
	{
		//function name should start lowercase and connecting word is upperCase
		//function name should unique
		// userdefined function
		//same function name with different parameters like int a string  b
		
		

		System.out.println("dologout");
	}
	
	public static void getdata() {
		//userdefind function
		//static function associt with static function
		//there is no static function is called non static function
		
		System.out.println("getdata");
	}
	
}
