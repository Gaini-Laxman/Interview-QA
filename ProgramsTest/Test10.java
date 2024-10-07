
public class Test10{
public static void main(String[] args){
int a = 5, b = 10;

a = a+b;
b =a-b;
a =a-b;
System.out.println("a:"+a+",b:	"+b);

int x =5, y=10, z=15;
int temp =z;

x=y;
y=temp;
temp=x;
System.out.println("x:"+x+",y:"+y+",z:"+z);




}
}