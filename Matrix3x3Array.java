
import java.util.Scanner;

public class Matrix3x3Array{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

int N = sc.nextInt();
int arr [ ] [ ] = new int [3] [3];

for(int i=0; i<N; i++){
arr[i] = new int[N];
}
for(int i=0; i<N; i++){
for(int j=0; j<N; j++){
int element = sc.nextInt();
arr[i][j] = element;
}
}
displayAllElements(arr);
sc.close();
}

}
