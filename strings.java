import java.util.Arrays;
import java.io.*;
import java.lang.*;
public class strings {

    public static void main(String [] args){
       
    //count total no.of characters in string
        // String name = "pradnya";
        // int count =0;
        // for(int i=0;i<name.length();i++){
        //      if(name.charAt(i) != ' '){
        //     count ++;
        //      }
        // }
        // System.out.print(count);

    //Count the Total Number of Punctuation Characters Exists in a String
        // String string ="He said, 'The mailman loves you.' I heard it with my own ears.";   
        //    int count =0;
        // for(int  i =0;i<string.length();i++){
        //         if(string.charAt(i)=='!'|| string.charAt(i)==','|| string.charAt(i)=='?'
        //             || string.charAt(i)==';'|| string.charAt(i)=='.'|| string.charAt(i)==':' );
        //             count ++;
        //     }
        //     System.out.println(count);

    //count the total number of vowels and consonants in a string
        // String string = "This is a really simple sentence";
        // int vCount = 0;
        // int cCount = 0;
        // string=string.toLowerCase();
        // for(int i=0;i<string.length();i++){
        //     if(string.charAt(i) == 'a'|| string.charAt(i)=='e'||string.charAt(i)=='i'
        //          || string.charAt(i)=='o' || string.charAt(i) == 'u'){
        //             vCount++;
        //     }
        //     else if(string.charAt(i)>='a' && string.charAt(i)<='z'){
        //         cCount++;
        //     }
        // }
        // System.out.println(cCount);
        // System.out.println(vCount);

    //anagrams
    // String s1="Brag";
    // String s2="Grab";

    // s1=s1.toLowerCase();
    // s2=s2.toLowerCase();
    
    // char c1[] = s1.toCharArray();
    // char c2[] = s2.toCharArray();

    // Arrays.sort(c1);
    // Arrays.sort(c2);

    // s1=new String(c1);
    // s2=new String(c2);

    // if(s1.equals(s2)){
    //     System.out.print("both anagram");
    // }else{
    //     System.out.print("not anagram");
    // }

    // //Java Program  to Find a Character in the String
    // String s1="GeeksforGeeks is a computer science portal";

    // //Returns index of first occurrence of character.
    // int firststr=s1.indexOf( 's');
    // System.out.println(firststr + "found at this index .");

    // //Returns index of last occurrence of character.
    // int laststr=s1.lastIndexOf('s');
    // System.out.println(laststr + "found at this index");

    // //Index of the first occurrence of specified char after the specified index if found. 
    // int ans=s1.indexOf('s',10);
    // System.out.println(ans +"after index 10 s was on this index");
        
    // int anss=s1.lastIndexOf('s',20);
    // System.out.println(anss + "Last occurrence of char 's'" + " after index 20 is");

    // // // gives ASCII value of character at location 20 
    // int charat=s1.charAt(20);
    // System.out.print(charat + "character at loc 20");

// //Searching Substring in the String
       // String s1= "GeeksforGeeks is a computer science portal";
        // int ans=s1.indexOf("Geeks");
        // System.out.println(ans);

        // int ans1=s1.lastIndexOf("Geeks");
        // System.out.println(ans1);

        // int ans3=s1.indexOf("Geeks",10);
        // System.out.println(ans3);

        // int ans4=s1.lastIndexOf("Geeks",20);
        // System.out.println("Last occurrence of char Geeks after index 20 is"+ ans4);
     
     
        // String s1="computer";
        // CharSequence seq= "com";
        // boolean bool = s1.contains(seq);
        // System.out.print( "found? " + bool );

//// Java Program to Match ofstart and endof a Substring 
// String str="GeeksforGeeks is a computer science portal";
// System.out.println(str.startsWith("Geek"));
// System.out.println(str.startsWith("is",14));
// System.out.println(str.endsWith("port"));
  
// reverse the string
String s1= "Geeks";
char ch[]= s1.toCharArray();
char temp;
int start=0;
int end=s1.length()-1;
while(start<=end){
    temp= ch[start];
    ch[start]=ch[end];
    ch[end]=temp;
    start++;
    end--;
    
}
System.out.print(ch);

// using reverse keyword

// String str="Geeks";
// StringBuffer sb = new StringBuffer(str);
// sb.reverse();
// System.out.print(sb.toString());

//Left Rotation of string
    // String s1="GeeksForGeeks";
    // int d=2;
    // int n=s1.length();
    // char ch[]=s1.toCharArray();
    // d=d%3;
    // reverse(ch, 0, d-1);
    // reverse(ch, d, n-1);
    // reverse(ch,0,n-1);


    // System.out.print(ch);
    //     }
    //     static void reverse(char ch[], int start,int end){
    //         char temp=0;
    //         while(start<=end){
    //             temp=ch[start];
    //             ch[start]=ch[end];
    //             ch[end]=temp;
    //             start++;
    //             end--;

    //         }

// Right Rotation of String
    // String s1="GeeksForGeeks";
    // int d=2;
    // int n=s1.length();
    // char ch[]=s1.toCharArray();
    // d=d%3;
    // reverse(ch, 0,n-3 );
    // reverse(ch,n-d,n-1);
    // reverse(ch, 0, n-1);
    // System.out.print(ch);
    //     }

    // static void reverse(char ch[], int start,int end){
    //             char temp=0;
    //             while(start<=end){
    //                 temp=ch[start];
    //                 ch[start]=ch[end];
    //                 ch[end]=temp;
    //                 start++;
    //                 end--;

    //             }

    // sort string of char 
    // String str="geeksforgeeks";
    //             // char ch[]=str.toCharArray();
    //             // Arrays.sort(ch);
    //             // System.out.print(ch);
    //     char temp =0;
    // char ch[]= str.toCharArray();
    // for(int i=0;i<ch.length;i++){
    //     for(int j=0;j<ch.length-1-i;j++){
    //         if(ch[j]>ch[j+1]){
    //             temp= ch[j];
    //             ch[j]=ch[j+1];
    //             ch[j+1]=temp;

    //         }
    //     }
    // }
    // System.out.print(ch);

    // frequency of each character
    // String str= "aabccccddd";
    // char ch []=str.toCharArray();
    // int freq[]=new int[str.length()];

    // int visited=-1;
    // for(int i=0;i<ch.length;i++){
    //     int count =1;
    //     for(int j=i+1;j<ch.length;j++){
    //         if(ch[i]==ch[j]){
    //             count ++;
    //             freq[j]=visited;
    //         }
    //     }

    //     if(freq[i]!=visited){
    //         freq[i]=count;
    //     }
    
    // }
    // for(int i=0;i<freq.length;i++){
    //     if(freq[i]!=visited){
    //         System.out.println(ch[i] + " " + freq[i] + " ");
    //     }
    // }

    // replace 1 and last char of string
//     String s="james";
//    // char ch[]=s.toCharArray();
//     int n = s.length();
//     char first = s.charAt(0);
//     char last = s.charAt(n-1);
//     String mid=s.substring(1, n-1);
//     String result = last + mid + first;
//     System.out.print(result);

// swap 2 strings
    // String s= "HelloWorld"; //WorldHello
    // int n=s.length();
    // String first=s.substring(0, n-5);
    // String sec=s.substring(5,n-1);
    // String result=sec+first;
    // System.out.print(result);

// print initials of name  // P P S
// String name="Pradnya Prakash Shelar";
// char ch []=name.toCharArray();
// int n =name.length();
// System.out.print(name.charAt(0) + " ");
// for(int i =0;i<n;i++){
//     if(name.charAt(i)==' '){
//         System.out.print(name.charAt(i+1) + " ");
//     }
// }

// String s= "This is a cat";    //T.I.A.C
// s=s.toUpperCase();
// int n = s.length();
// //char ch[]=s.toCharArray();
// System.out.print(s.charAt(0)+".");
// for(int i=0 ; i<s.length();i++){
//     if(s.charAt(i)==' '){
//         System.out.print(s.charAt(i+1) + ".");
//     }
// }

//print pair of vowels
// String s= "BEAUTIFUL";
// int count =0;

// for(int i=0;i<s.length()-1;i++){
//     char ch=s.charAt(i);
//    char  ch1=s.charAt(i+1);

//     if((ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') &&
//     (ch1=='A'||ch1=='E'||ch1=='I'||ch1=='O'||ch1=='U'))
//     {
//        System.out.print(" " + ch+ch1 ); //" " due to this it will convert to char to string
//         count ++;

//     }
    
// }
// System.out.println();
//     System.out.println("No.of vowel pairs " + count);

// PANAGRAM --- which contains all letters from a-z
// String s = "The quick brown fox jumps over the lazy dog";
// System.out.print(isPanagram(s.toLowerCase()));
//     }
// public static boolean isPanagram(String s){
//         if(s.length()<26){
//             return false;
//         }else{
//             for(char ch ='a';ch<='z';ch++){
//                 if(s.indexOf(ch)<0){
//                     return false;
//                 }
//             }
//         }
//         return true;

//palindrome String
// String s ="nitin";
// System.out.print(isPalindrome(s));
//     }
//     public static boolean isPalindrome(String s){
//         int start=0;
//         int end = s.length()-1;

//     while (start<=end){
//         if(s.charAt(start)!=s.charAt(end)){
//             return false;
//         }
//         start++;
//         end--;
//     }
//     return true;
// }

// return ascii value of character

// char ch = 'b';
// System.out.print((int) ch);

// remove all vowels
// String s= "Take you forward";

// String result=" ";

// for(int i=0;i<s.length()-1;i++){
//   char ch = s.charAt(i);
//     if(!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u' ||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')){
//       result=result+ch;
//     }
    
// }
// System.out.println(result);

// remove white spaces
// String s="pradnya shelar";
// String result = "";
// for(int i=0;i<s.length();i++){
//    char ch =s.charAt(i);
//     if(ch!=' '){
//         result = result+ch;
//     }
// }
// System.out.print(result);

//remove char from string only alphabets
// String s = "1.python 2.java";
// String result ="";
// // for(int i=0;i<s.length();i++){
// //     char ch =s.charAt(i);
// //     // if(Character.isLetter(ch)){         // replaceAll("[^a-zA-z]" ,"")
// //     //     result=result+ch;
// //     // }
   
// // }
// result = s.replaceAll("[^a-zA-Z]", "");
// System.out.print(result);

// Remove brackets from an algebraic expression
// String s = "a+((b+c)+d)";
// String result="";
// for(int i=0;i<s.length();i++){
//     char ch = s.charAt(i);
//     if(!(ch=='('||ch==')')){
//         result = result+ch;
//     }
// }
// System.out.println(result);

// Sum of the numbers in a String
// String s="abc123xyz45def6";
// int sum=0;
// String temp="0";
// for(int i=0;i<s.length();i++){
//     char ch=s.charAt(i);
//     if(Character.isDigit(ch)){
//         temp=temp+ch;
//     }else{
//         sum= sum + Integer.parseInt(temp);
//         temp="0";
//     }
   
// }
// sum=sum+Integer.parseInt(temp);
// System.out.print(sum);

// Swap characters in a String  ---Input : S = "ABCDEFGH", B = 4, C = 3;  //Output:  DEFGBCAH 
// String s = "abcdefgh";
// int B=4;
// int C=3;

//  char[] ch = s.toCharArray();
//  int N = ch.length;
 
// for(int i=0; i<B;i++){
//     char temp = ch[i];
//     ch[i]=ch[(i+C)%N];
//     ch[(i+C)%N]=temp;
// }
    
 
// System.out.print(new String(ch));

// String s = "geeksforgeeks";
// int [] stars = {1,5,7,9};

// String ans = addstar(s, stars);
// System.out.print(ans);

//     }
    

// public static  String addstar(String s,int[] stars){

//     String ans = "";
//     int j=0;
//     for(int i=0;i<s.length();i++){
//             if(j<stars.length && i==stars[j]){
//                 ans = ans + '*';
//                 j++;
//             }
//             ans = ans + s.charAt(i);
            
//     }
//      return ans;
   

}
}        
    

    


  

