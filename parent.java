package methodoverride;
class parent1
{
void test()
{
System.out.println("I am parentclass");
}
}
class child extends parent1
{
void test()
{
System.out.println("I am childclass");
}
}
class parent
{
public static void main(String [] args)
{
parent1 p1=new child();
p1.test();
parent1 s1=new parent1();
s1.test();
child c1=new child();
c1.test();
}
}

			
			
