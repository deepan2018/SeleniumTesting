
public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0th row
		String[][] a = new String[3][4];
		a[0][0] = "selenium";
		a[0][1] = "jmeter";
		a[0][2] = "iot";
		a[0][3] = "appium";

		//1st row
		a[1][0] = "selenium";
		a[1][1] = "jmeter";
		a[1][2] = "iot";
		a[1][3] = "appium";
		
	//2ndrow
		a[2][0] = "selenium";
		a[2][1] = "jmeter";
		a[2][2] = "iot";
		a[2][3] = "appium";

		System.out.println(a.length);
		System.out.println(a[0].length);
				
				for(int i=0;i<a.length;i++)
				{
					for(int j=0;j<a.length;j++)
					{
				//System.out.println(a[i][j]);
						System.out.print(a[i][j]+"----");
						
					} System.out.println();
					
				}
				
				
				
		}

}