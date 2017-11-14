public class Common{

	String instanceVar  ;
	final static String CONSTANT = "class Common" ;
	static  String classVar ;

	public static void main(String[] args) {
		//java注解
		String name = "张三" ;
		int age = 18 ;
		System.out.println( "姓名： " + name );
		System.out.println("年龄：" + age) ;
		//@变量
		//常量
		System.out.println("常量CONSTANT：" + Common.CONSTANT );
		//类变量
		System.out.println("类变量classVar：" + Common.classVar);
		Common com = new Common() ;
		com.classVar = "classvar" ;
		Common.classVar = "changed classvar" ;
		Common com2 = new Common() ;
		System.out.println("类变量classVar：" + com2.classVar);
		//实体变量
		System.out.println("实体变量com.instanceVar： " + com.instanceVar);
		com.instanceVar  = "com.instanceVar";
		com2.instanceVar = "com2.instanceVar";
		System.out.println("实体变量com2.instanceVar： " + com2.instanceVar);
		System.out.println("实体变量com.instanceVar： " + com.instanceVar);
		//局部变量
		int localvar ;
		//System.out.println("局部变量未赋值 " + localvar);
		
	}
	
}