import java.util.Scanner;
class As3{
// 1)WAP to print a statement 1000 number of times.
Scanner sc = new Scanner(System.in);

void St_1000() {
int i =1;
while (i<1000){
    
System.out.println("Mayur");
i++;
}
}

// 2)WAP to print N natural number. 

void  N_num(){
System.out.println("enter a number");
int n = sc.nextInt();
int i=1;
while(i<=n){

System.out.println(i);

    i++;
}  
}



// 3)WAP to find out the sum of N natural number.

 void Sum_N(){
        int i=1;
        int Sum=0;
        System.out.print("ENter N Number = ");
        int n = sc.nextInt();
        while (i<=n){
            Sum=Sum+i;
            i++;
        }System.out.println("sum = "+Sum);
    }

// 4)WAP to print table of a number.

void table(){
System.out.println("Enter a Number");
int n =sc.nextInt();
int i= 1;
int tab;
while ( i<=10){
 tab =i*n;
System.out.println(tab);
i++;
}
}

// 5)WAP to find out the factorial of a number.
void factorial(){
System.out.println("Enter a Number");
int n =sc.nextInt();
int i=1;
while (n!=0) {

   i = i*n;
    n--;
}
System.out.println(" "+i);


}


// 6)WAP to find out the factors of a number.

void factor(){
System.out.println("Enter a number");

int j= sc.nextInt();
int i= 2;

 while ( j!=1) {
 if(j%i==0){
         
 j= j/i;
System.out.println(i);

 }
else{

    i++;
}
}
}



// 7)WAP to check whether entered number is prime or not.

void prime(){
System.out.println("Enter a number");
int n= sc.nextInt();

 int  i=2;
while (i<=n/2) {
    if(n%i==0)
    break;
    i++;                              // ek variable nikal kar bhi value assign kar sakte h but fir 1=bhi prime ho jayega to wrong h
    }

if(i>n/2&&n>1) {
    System.out.println("prime");
}
else{
    System.out.println("not prime");
}


}




// 8)WAP to print Fibonacci series.


void  fibonacci(){
System.out.println("Enter a number");
int n = sc.nextInt();
int f1= 0;
int f2=1;
int f;
System.out.print(f1+ " " +f2+" ");
while(n-2!=0){
    f=f1+f2;
    System.out.print(" "+f);
    f1=f2;
    f2=f;
    n--;
}
}



// 9)WAP to print N even numbers.
void  N_Even(){
System.out.println("Enter a number");
int n = sc.nextInt();

for (int i=0; n!=0; n--)
{

    i= i+2;
    System.out.println(i);
}

}



// 10)WAP to print Even numbers upto N.

void  N_Evenn(){
    System.out.println("Enter a number");
    int n = sc.nextInt();
    
    for (int i=0; n!=0; n--)
    {
    
        i= i+2;
        System.out.println(i);
    }
    
    } 


// 11)WAP to print N odd numbers.

void  N_Odd(){
    System.out.println("Enter a number");
    int n = sc.nextInt();
    
    for (int i=1; n!=0; n--)
    {
    
        i= i+2;
        System.out.println(i);
    }
    
    } 


    // 12)WAP to print Odd numbers upto N.

    void  N_Oddd(){
        System.out.println("Enter a number");
        int n = sc.nextInt();
        
        for (int i=1; n!=0; n--)
        {
        
            i= i+2;
            System.out.println(i);
        }
        
        } 
    



        // 13)WAP to print N natural numbers in reverse order
        void  N_R_num(){
            System.out.println("enter a number");
            int n = sc.nextInt();
            for( int i;n!=0; n--){
            
            System.out.println(n);
            }

            }
            
            
            



// 14)WAP to print alphabets in uppercase
void Al_Upper(){
    char a;
    for(a=65; a<=90; a++){
        System.out.println(a);
    
    
    }
    
    
    }
    
    
    
    // 15)WAP to print alphabets in lowercase
void Al_Lower(){
        char a;
        for(a=96; a<=122; a++){
            System.out.println(a);
        
        
        }


}
    
    
// 16)…... -6	-3	0	3	6	9	……. n terms	 
    
    void  Series(){
System.out.println("enter which n nouber of ap you want");
 int n = sc.nextInt();
int a=-6;
int b=-3,i;
int d =  b-(a);
int nth=0;

// System.out.println(d);
for( i=1;i<=n;i++ ){
 nth=a+(i-1)*d;
 System.out.println(nth);
}

    }




}






















































public class As3_Loop{

 public static void main(String args[]) {

As3  Obj = new  As3();
// Obj.St_1000();
// Obj.N_num();
// Obj.Sum_N();
// Obj.table();
// Obj.factorial();
// Obj.factor();
// Obj.prime();
//   Obj.fibonacci();
// Obj.N_Even();
// Obj.N_Evenn();
// Obj.N_Odd();
// Obj.N_Oddd();
// Obj.N_R_num();
//  Obj.Al_Upper();
// Obj.Al_Lower();
Obj.Series();
}
}