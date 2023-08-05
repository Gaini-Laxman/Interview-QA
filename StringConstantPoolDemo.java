public clsss StringConstantPoolDemo{
public static void main (String[] args) {
String s1 = "Hello";
String s2 = new String("Hello").intern();
String s3 = String.valueOf("Hello");

System.out.println(s1==s2); //output => true
Syste.out.println(str1 == s3); //output => true

}
}