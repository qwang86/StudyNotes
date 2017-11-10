class Person{
	private String age ;
}

public class DataType{
	//类变量使用static修饰
	static byte ba ;
	static short sa ;
	static int ia ;
	static long la ;
	static float fa ;
	static double da ;
	static char ca ;
	static boolean boa ;
	static Person p ;

	public static void main(String[] args) {
		//@基本类型
		//byte >>> Byte
		byte byteMinVaule = Byte.MIN_VALUE ;
		byte byteMaxVaule = Byte.MAX_VALUE ;
		System.out.println("基本类型：byte默认值：" + ba) ;	
		System.out.println("byte二进制长度" + Byte.SIZE) ;
		System.out.println("最小值：Byte.MIN_VALUE = " + byteMinVaule) ;
		System.out.println("最大值：Byte.MAX_VALUE = " + byteMaxVaule) ;
		//short >>> Short
		short shortMinValue = Short.MIN_VALUE ;
		short shortMaxValue = Short.MAX_VALUE ;
		System.out.println("基本类型：short默认值：" + sa) ;
		System.out.println("short二进制长度：" + Short.SIZE) ;
		System.out.println("最小值：" + shortMinValue) ;
		System.out.println("最大值：" + shortMaxValue) ;
		//int >>> Integer
		int intMinValue = Integer.MIN_VALUE ;
		int intMaxValue = Integer.MAX_VALUE ;
		System.out.println("基本类型：int默认值：" + ia) ;
		System.out.println("int二进制长度：" + Integer.SIZE) ;
		System.out.println("最小值：" + intMinValue) ;
		System.out.println("最大值：" + intMaxValue) ;
		//long >>> Long 
		///long i = 10L ; long型整数后加L/l
		long longMinValue = Long.MIN_VALUE ;
		long longMaxValue = Long.MAX_VALUE ;
		System.out.println("基本类型：long默认值：" + la) ;
		System.out.println("long二进制长度：" + Long.SIZE) ;
		System.out.println("最小值：" + longMinValue) ;
		System.out.println("最大值：" + longMaxValue) ;
		//float >>> Float
		///float i = 10f ; long型整数后加L/l
		float floatMinValue = Float.MIN_VALUE ;
		float floatMaxValue = Float.MAX_VALUE ;
		System.out.println("基本类型：float默认值：" + la) ;
		System.out.println("float二进制长度：" + Float.SIZE) ;
		System.out.println("最小值：" + floatMinValue) ;
		System.out.println("最大值：" + floatMaxValue) ;
		//dobule >>> Double 
		double doubleMinValue = Double.MIN_VALUE ;
		double doubleMaxValue = Double.MAX_VALUE ;
		System.out.println("基本类型：double默认值：" + la) ;
		System.out.println("double二进制长度：" + Double.SIZE) ;
		System.out.println("最小值：" + doubleMinValue) ;
		System.out.println("最大值：" + doubleMaxValue) ;
		//char >>> Character 
		int charMinValue = Character.MIN_VALUE ;
		int charMaxValue = Character.MAX_VALUE ;
		System.out.println("基本类型：char默认值：" + ca) ;
		System.out.println("char二进制长度：" + Character.SIZE) ;
		System.out.println("最小值：" + charMinValue) ;
		System.out.println("最大值：" + charMaxValue) ;
		//boolean >>> Boolean 
		System.out.println("基本类型：boolean默认值：" + boa) ;
		///数据溢出指的是在数据上下标极限值上做的数据运算导致数据超过类型范围的现象
		System.out.println("*************数据溢出现象***************");
		System.out.println("数据溢出Byte.MIN_VALUE - 1 = " + (byte)(byteMinVaule - 1)) ;
		System.out.println("数据移除Byte.byteMaxVaule + 1 = " + (byte)(byteMaxVaule + 1)) ;
		//@引用类型		
		System.out.println("引用类型的默认值为：" + p ) ;
		//@运算符
		int a = 10 ;
		int b = 10 ;
		//a++ 先运算，后自增
 		System.out.println("2*a++   = " +  (2+a++) );
 		System.out.println(a);
 		//++b 先自增，再运算
    	System.out.println("2*++b   = " +  (2+(++b)) );
    	System.out.println(b);
    	//短路与的问题
    	System.out.println("使用短路与&&，(1 > 2) && (10/0 == 0)" + ((1 > 2)&&(10/0 == 0)));
		//以下代码出错
		//System.out.println("使用短路与&，(1 > 2) & (10/0 == 0)" + ((1 > 2)&(10/0 == 0)));
    	//赋值运算符
    	int m = 10 ;
    	int n = 15 ;
    	int j = 20 ;
    	System.out.println();

	}
}