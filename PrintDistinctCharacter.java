

class PrintDistinctCharacter{
public static void main(String [] args){

String s = "Laxman";
char [ ] arr =s.toCharArray();
for(int i=0; i<s.length(); i++){
boolean isDuplicate  = false;
for(int j =i+1; j<s.length(); j++){

if(arr[i] == arr[j]){
System.out.println(arr[i]);
isDuplicate  = true;
break;
}
}
if(!isDuplicate){
System.out.println(arr[i]);
}
}
}
}