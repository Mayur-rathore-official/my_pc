import java.util.Scanner;

class  OddEven{ 
public static void main(String []args){
Scanner sc =  new Scanner(System.in);
System.out.println("enter a no. :-");
int num = sc.nextInt();
if (num%2==1){
System.out.println("  no. is odd");
}
else if(num==0){
System.out.println("  no. is 0");    
}
else {
System.out.println("  no. is even");
}
}
}
