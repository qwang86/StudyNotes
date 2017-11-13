public class Common{
	
	private String instanceVar  ;
	private final static String CONSTANT = "class Common" ;
	private static  String classVar = "classvar"

	public static void main(String[] args) {
		//java注解
		String name = "张三" ;
		int age = 18 ;
		System.out.println( "姓名： " + name );
		System.out.println("年龄：" + age) ;
		int localvar ;
		System.out.println("类变量 ");
	}
	
}