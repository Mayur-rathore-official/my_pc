 import java.util.Scanner;

class GreaterThan{


    public static void main(String []args){
Scanner s = new Scanner(System.in);


System.out.println("enter 1st  float value");
float  f1 =  s.nextFloat();

System.out.println("enter  2nd float value");
float  f2 =  s.nextFloat();

System.out.println("enter  3rd float value");
float  f3 =  s.nextFloat();
if((f1>f2)&&(f1>f3)) {
     System.out.println("1rd no. is greater then both"+f1);
}
else if((f2>f1)&&(f2>f3)){
    System.out.println("2nd is greater than both"+f2);
}
else{
    System.out.println("3rd is greater than both"+f3);
}
  
 }
}
