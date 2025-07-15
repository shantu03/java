interface I{
	void fun();
	static void fun2(){
	System.out.println("this is static initial  fun2");
				}
		}
interface Bb
{
void fun3();
}


class A implements I{
	A(){
	System.out.println("this is constructor");
	}
	public void fun(){
	System.out.println("overridden dunction");
	}
		
 static void fun2()
	{
	System.out.println("over ridden static function ");
		}
}

public class extend_with_implement extends A implements Bb{
	public void fun3(){
	System.out.println("this is fun");
				}

	public static void main(String sdf[]){
	new A().fun();
	new extend_with_implement().fun3();
	new A.fun2();

			}
}