import java.util.Scanner;

class SumOfFloat{


    public static void main(String []args){
Scanner s = new Scanner(System.in);


System.out.println("enter 1st  float value");
float  float1 =  s.nextFloat();

System.out.println("enter  2nd float value");
float  float2 =  s.nextFloat();

System.out.println("enter  3rd float value");
float  float3 =  s.nextFloat();

float sum = float1+float2+float3;
System.out.println("sum of float values="+sum);

    }
}