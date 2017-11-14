#@@JDK1.8新特性
@
##接口增强
JDK1.8中允许给接口添加一个非抽象的方法实现（使用default和static关键字），例下：      
```
interface IMESS{
    public void print() ;
    public default void fun() {
        System.out.println("接口中实现的default方法");
    }
    public static void show() {
        System.out.println("接口中实现的static方法");
    }
} 
public class JDK18 implements  IMESS{
    @Override
    public void print() {
        // TODO Auto-generated method stub
        System.out.println("子类实现print方法");
    }    
    public static void main(String[] args) {
        IMESS dem = new JDK18() ;
        dem.print();
        dem.fun();
        IMESS.show();
    }
}
```
##lamda表达式
##函数式接口
@FunctionalInterface
##方法与构造函数引用