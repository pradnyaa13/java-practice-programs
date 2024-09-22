import java.util.Scanner;

public class basicprograms {
    public static void main(String []args){

        // //Fibonacci series
        // int num1=0;
        // int num2=1;
        // int n=12;
        // System.out.print(num1+" "+ num2);
        // for(int i=2;i<=n;i++){
        //     int num3 = num1+num2;
        //     System.out.print(" "+num3);
        //     num1=num2;
        //     num2=num3;
           
        // }

       // //prime numbers      //0 and 1 are not prime nos. 2 is the only even prime number
         // int num=3;
        // int m=num/2;         //it will check till specific no.
        // if(num<=1){
        //     System.out.print("its not a prime no.");
        // }else{
        //     for(int i=2;i<=m;i++){
        //         if(num % i==0){
        //             System.out.print("its not a prime no.");
        //             break;
        //         }else{
        //             System.out.print("its prime no.");
        //         }
                
        //     }
        // }

        //Palindrome Program
        // int num=121;
        // int s=0;
        // int r;
        // int temp=num;
        // while(num>0){
        //     r=num%10;          
        //     s=(s*10)+r;
        //     num=num/10;
        // }
        // if(temp==s){
        //     System.out.print("its palindrome");
        // }
        // else{
        //     System.out.print("its not palindrome");
        // }

        //factorial number
        // int fact=1;
        // Scanner sc = new Scanner(System.in);
        // System.out.print("enter no.");
        // int num= sc.nextInt();
        // for(int i=1;i<=num;i++){ 
        //     fact=fact*i;
        // }
        // System.out.print("factorial of no. is " + fact);

        //armstrong no.  //sum of cube of individual digits in a number 153----1*1*1 + 5*5*5 + 3*3*3 = 1+125+27 = 153

        // int num=155;
        // int temp=num;
        // int r;
        // int sum=0;
        //  while(num>0){
        //     r=num%10; 
        //     num=num/10;
        //     sum=sum + r*r*r ;
        //  }
        //  if(temp==sum){
        //     System.out.print("its armstrong no.");
        //  }else{
        //     System.out.print("its not armstrong no.");
        //  }

        //generate random no.     Math.random()

        // int max=400;
        // int min=200;
        // double res= Math.random()*(max-min+1)+min;
        // System.out.println(res);
        // int res1=(int)(Math.random()*(max-min+1)+min);
        // System.out.println(res1);

        //nth prime no.
        // int n=10;
        // int counter=0;
        // int num=1;
        // int i;
        // while(counter<n){
        //     num = num + 1;
        //     for( i=2;i<=num;i++){
        //         if(num % i == 0){
        //             break;
        //         }     
        //     } 
        //     if(i==num){
        //         counter=counter+1; 
        //     }
           
        // }
        // System.out.print(num);



    //     //check prime or not 
    //     //int n=19;
    //     for(int i=1;i<=100;i++){   //print from 1 - 100 prime nos.
    //         if(isPrime(i)){
    //             System.out.println(i + " is prime no.");
    //         }
    //     }
    //     // if(isPrime(n)){
    //     //     System.out.println("number is prime");
    //     // }else{
    //     //     System.out.println("number is not  prime");
    //     // }
    // }
    //    public static boolean isPrime(int n){
    //         if(n<2){
    //             return false;
    //         }

    //         for(int i=2; i<=n/2; i++){
    //             if(n % i == 0){
    //                 return false;
    //             }
    //         }
    //         return true;
           

        //square root of number  //Math.sqrt() is the inbuilt method

        // int num=9;
        // int sqrt=0;
        // for(int i=1;i<=num;i++){
        //     if(num%i==0){  //check if it is the factor of num
        //         if(i*i==num){
        //             sqrt=i;
        //         }
        //     }
        // }
        // System.out.println(sqrt);

        //gcd ----- highest common divisor between two num
        // int num1 = 12;
        // int num2 = 8;
        // int gcd=1;
        // for(int i=1 ; i<=num1 && i<=num2 ; i++){
        //     if(num1%i==0 && num2%i==0){
        //         gcd=i;
        //     }
           
        // }
        // System.out.println(gcd);

        //greatest in 3 no.
        // int n1=12;
        // int n2=23;
        // int n3=2;
        // if(n1>=n2 && n1>=n3){
        //     System.out.println("n1 is greatest");
        // }
        // else if(n2>=n3 && n2>=n1){
        //     System.out.println("n2 is greatest ");
        // }
        // else{
        //     System.out.println("n3 is greatest");
        // }

        //smallest no. of 3 no using nested if
        // int n1=2 , n2=4 , n3=9;
        // if(n1<=n2){
        //     if(n1<=n3)
        //     {
        //         System.out.println("n1 is smallest");
        //     }
        //     else
        //     {
        //         System.out.println("n3 is smallest");
        //     }
            
        // }
        // else{
        //         if(n2<=n3)
        //         {
        //             System.out.println("n2 is smallest");
                    
        //         } 
        //         else
        //         {
        //             System.out.println("n3 is smallest");
        //         }
        //     }
        
        //Check if a Number is Positive or Negative
        // int n1=-2;
        
        // if(n1>0){
        //     System.out.println("positive");

        // }else if(n1<0){
        //     System.out.println("negative");
        // }else if(n1==0){
        //     System.out.println("zero");
        // }else{
        //     System.out.println("enter only number");
        // }
    
        //check perfect square or not

    //     System.out.println(square(4));
    // }
    //     public static int square(int num1){
          
    //     int left=0;
    //     int right=num1/2;
   
    //     while(left<=right){
    //         int mid = (left+right) /2;
    //         if(mid *mid == num1){
    //          return mid;
    //         }else if(mid*mid > num1){
    //             right=mid=1;
    //         }else{
    //             left=mid+1;
    //         }
          
    //     }
    //     return -1;
    //     }

    //even no from 1-100
    // for(int i=1;i<=100;i++){
    //     if(i%2==0){
    //         System.out.println(i);
    //     }
    // }
    
    
    // //odd nos. from 1-100
    // for(int i=1;i<=100;i++){
    //     if(i%2==1){
    //         System.out.println(i);
    //     }
    // }

    //sum of natural nos from 1-100
    // int sum=0;
    // for(int i=1;i<=3;i++){
    //     sum=sum+i;
    // }
    // System.out.println(sum);
    
//  int arr[]={1,2,3,4};
//  for(int i=arr.length-1;i>=0;i--){
//     System.out.print(arr[i]);
 //}

 int arr[]={11,22,33,94};
 int t =33;
 for(int i =0;i<arr.length;i++){
    if(arr[i]==t){
        System.out.print(i);
    }
 }
    
 }  
}
