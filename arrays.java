import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class arrays {
   
   public static void main(String [] args){
//    //// Program to remove the duplicate elements of an array

    // int arr[] ={1,1,2,2,2,3,3,4,4}; 
    // int i =0;
    // for(int j=1;j<arr.length;j++){
    //     if(arr[j]!=arr[i]){
    //         arr[i+1]=arr[j];
    //         i++;
    //     }
    // }
    // System.out.print(arr[i]);  //give the size of array of removed elements


// ////print duplicate elements
    // int arr[]={1,2,3,4,2,7,8,8,3};
    // for(int i=0;i<arr.length;i++){
    //     for(int j=i+1;j<arr.length;j++){
    //         if(arr[i]==arr[j]){
    //             System.out.println("duplicate elements are :"+arr[j]);
    //         }
    //     }       
    // }  

//Program to print the largest element in an array
    
    // int arr[]={25,11,7,75,56};
    // //    Arrays.sort(arr);
    // //    System.out.print(arr[arr.length-1]);
    // int max = arr[0];
    // for(int j=1;j<arr.length;j++){
    //     if(arr[j]>max){
    //         max=arr[j];  
    //     }
    // }
    // System.out.print(max);

 // program to print smallest element in array
    
    // int arr[]={25,11,7,75,56};
    // int small=arr[0];
    // for(int j=1;j<arr.length;j++){
    //     if(arr[j]<small){
    //         small=arr[j];
            
    //     }
    // }
    // System.out.print(small);

// //program to find second largest 

// int arr[] ={1,2,5,6,3,2};
// int largest = arr[0];
// int slargest = -1;
// for(int i=1;i<arr.length;i++){
//     if(arr[i]>largest){
//         slargest=largest;
//         largest=arr[i];
//     }
//     else if(largest > arr[i] && slargest < arr[i]){
//         slargest=arr[i];
//     }
// }
// System.out.print(slargest);

// //program to find second smallest
    // int arr[]={1,2,3,7,7,5};
    // int smallest=arr[0];
    // int secsmallest=Integer.MAX_VALUE;
    // for(int i=1;i<arr.length;i++){
    //     if(arr[i]<smallest){
    //         secsmallest=smallest;
    //         smallest=arr[i];
    //     }
    //     else if(arr[i]!=smallest && arr[i]<secsmallest){
    //         secsmallest=arr[i];
    //     }
    // }
    // System.out.println(secsmallest);

// program to check sorted the array
    // int n=5;
    // int arr[]={1,2,3,4,5};
    // System.out.print(sortedArray(arr,n));
    // }

    // static boolean sortedArray(int arr[],int n){
    //     // int  arr[]={1,2,3,4,5};
    //     for(int i=1;i<arr.length;i++){
    //         if(arr[i]<arr[i-1])
    //         return false;
    //         } 
    //     return true; 
    // }  

// program to sort array in descending
//     int arr[]={5,2,8,7,1};
//     int temp=0;
//     for(int i=0;i<arr.length;i++){
//         for(int j=i+1;j<arr.length;j++){
//             if(arr[i]<arr[j]){
//                 temp=arr[i];
//                 arr[i]=arr[j];
//                 arr[j]=temp;
                
//             }
//         }
//     }
//     System.out.println();
//     for(int i=0;i<arr.length;i++){
//         System.out.print(arr[i]+ " ");
//     }
// // 
//     int arr[]={5,2,6,1};   //another way for sort descending
// int temp=0;
// int i=0;
// for(int j=i+1;j<arr.length;j++){
//     if(arr[i]<arr[j]){
//         temp=arr[i];
//         arr[i]=arr[j];
//         arr[j]=temp;

//     }
//     i++;
// }
// for(int k=0;k<arr.length;k++){
//     System.out.print(arr[k] + " ");
// }

//  //program to sort array in ascending
    // int arr[]={5,2,8,7,1};
    // int temp=0;
    // for(int i=0;i<arr.length;i++){
    //     for(int j=i+1;j<arr.length;j++){
    //         if(arr[i]>arr[j]){
    //             temp=arr[i];
    //             arr[i]=arr[j];
    //             arr[j]=temp;
    //         }
    //     }
    // }
    // System.out.println();
    // for(int i=0;i<arr.length;i++){
    //     System.out.print(arr[i] + " ");
    // }

// //  program to print the element of array in reverse order
// int arr[]={1,2,3,4,5};
// int start=0;
// int end=arr.length-1;
// int temp=0;
// while(start<=end){
//     temp=arr[start];
//     arr[start]=arr[end];
//     arr[end]=temp;
//     start++;
//     end--;
// }
// for(int i=0;i<arr.length;i++){
//     System.out.print(arr[i]+" ");
// }

// program to print elements of even position
// int arr[]={1,2,3,4,5,6};
//     for(int i=1;i<arr.length;i=i+2){
//         System.out.print(arr[i] + " ");
//     }

// program to print elemnts of odd position
// int arr[]={1,2,3,4,5,6,7};
//     for(int i=0;i<arr.length;i=i+2){
//         System.out.print(arr[i] + " ");
//     }

// //Program to print the sum of all the items of the array
    // int arr[]={1,2,3,4,5};
    // int sum=0;
    // for(int i=0;i<arr.length;i++){
    //     sum=sum+arr[i];
    // }
    // System.out.print(sum);

 //   //Program to print the number of elements present in an array
//  int arr[]={1,3,45,7,876,467,4};
//  for(int i=0;i<arr.length;i++){
//  }
//  System.out.println("number of elemnts in array:  " + arr.length);
 
// //Program to find the frequency of each element in the array
int arr[]={1,2,8,3,2,2,2,5,1};
int frequency[]=new int[arr.length];
int visited=-1;
    for(int i=0;i<arr.length;i++){
        int count=1;
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
                count++;
                frequency[j]=visited;
            }
           
        }
        if(frequency[i]!=visited){    
            frequency[i]=count;
        }
    }
    for(int i=0;i<frequency.length;i++){
        if(frequency[i]!=visited){   //frequency[] = {2, 4, 1, 1, -1, -1, -1, 1, -1}
            System.out.print( frequency[i] + " ");
        }
    }
//Program to left rotate  the elements BY 1 PLACE
//     int arr[]={1,2,3,4,5};
//     int temp=arr[0];

//     for(int i=1;i<arr.length;i++){
//         arr[i-1]=arr[i];
//     }
//     arr[arr.length-1]=temp;
   
//    for(int i=0;i<arr.length;i++){
//     System.out.print(arr[i] + " ");
//    }
// //Program to left rotate  the elements BY "N" PLACE
    // int arr[]={1,2,3,4,5,6,7};
    // int d=3;
    // int n=arr.length;
    // int temp[]=new int[d];
    // for(int i=0 ; i<d ; i++){
    //     temp[i]=arr[i];
    // }
    // for(int i=d;i<n;i++){
    //     arr[i-3]=arr[i];
    // }
    // int j=0;
    // for(int i=n-d;i<n;i++){
    //     arr[i]=temp[j];
    //     j++;
    // }
    // for(int i=0;i<n;i++){
    //     System.out.print(arr[i]);
    // }

    //OPTIMAL WAY OF ABOVE
//     int arr[]={1,2,3,4,5,6,7};
//     int n = arr.length;
//     int d=3;
//     d=d%n;
//     Rotateleft(arr, n, d);
//     for(int i=0;i<n;i++){
//         System.out.print(arr[i] + " ");
//     }

// }
//     static void Rotateleft(int arr[],int n,int d){
//         reverse(arr, 0, n-d-1);
//         reverse(arr, n-d, n-1);
//         reverse(arr, 0, n-1);
//     }
//     static void reverse (int arr[],int start,int end){
//         int temp=0;
//         while(start<=end){
//             temp=arr[start];
//             arr[start]=arr[end];
//             arr[end]=temp;
//             start++;
//             end--;
//         }

// program to rotate right by 1 place

// int arr[]={1,2,3,4,5,6,7};
// int n=7;
// int d=1;
// int temp=arr[n-1];
// for(int i=n-2;i>=0; i--){
//     arr[i+1]=arr[i];
// }
// arr[0]=temp;
// for(int i=0; i<n; i++){
//     System.out.print(arr[i]);
// }

// program to right rotate by k optimal way 
// int arr[]={1,2,3,4,5,6,7};     // 4 3 2 1 7 6 5 // 5 6 7 1 2 3 4
//  int n=7;
//  int d=3;
//  RotateRight(arr, d, n);
//    for(int i=0;i<n;i++){
//     System.out.print(arr[i] + " ");
//    }
// }
// static void RotateRight(int arr[],int d,int n){
//     reverse(arr, 0, n-d-1);
//     reverse(arr, n-d, n-1);
//     reverse(arr, 0, n-1);
// }
// static void reverse (int arr[],int start,int end){
//             int temp=0;
//             while(start<=end){
//                 temp=arr[start];
//                 arr[start]=arr[end];
//                 arr[end]=temp;
//                 start++;
//                 end--;
//             }
// //Program to print Odd and Even Numbers from an Array
// int arr[]={1,2,3,4,5,6,7,8,9};
// System.out.print("odd nos.");
// for(int i=0;i<arr.length;i++){
//     if(arr[i]%2!=0){
//         System.out.print(arr[i] + " ");
//     }
// }
// System.out.println("even nos.");
// for(int i=0;i<arr.length;i++){
//     if(arr[i]%2==0){
//         System.out.print(arr[i] + " ");
//     }
// }

// // move all zeroes to end
// int arr[]={1,0,2,3,0,4,0,1};
// ArrayList <Integer> temp = new ArrayList<>();
// for(int i=0;i<arr.length;i++){
//     if(arr[i]!=0){
//         temp.add(arr[i]);
//     }
// }
// int n=temp.size();
// for(int i=0;i<n;i++){
// arr[i]=temp.get(i);
// }
// for(int i=n;i<arr.length;i++){
//     arr[i]=0;
// }
// for(int i=0;i<arr.length;i++){
//     System.out.print(arr[i] + " ");
// }

// //linear search
// int arr[]={2,7,1,4,9,0};
// int num=1;
//     for(int i=0;i<arr.length;i++){
//         if(arr[i]==num){
//         System.out.print(i);
//         }
//     }

// //union of two sorted arrays 
// int arr1[]={1,2,3,4,5,6,7,8,9,10};
// int arr2[]={2,3,4,4,5,11,12};

// HashSet <Integer> unionset=new HashSet<>();
//     for(int i=0;i<arr1.length;i++){
//         unionset.add(arr1[i]);
        
//     }
//     for(int j=0;j<arr2.length;j++){
//             unionset.add(arr2[j]);
//         }

//     int temp[]=new int[unionset.size()];
//         int index=0;
//         for(Integer num : unionset){
//             temp[index]=num;
//             index++;
//         }

//         for(int i=0;i<temp.length;i++){
//             System.out.print(temp[i] + " ");
//         }

// // intersection of arrays
// int arr1[]={1,2,3,4,5,6,7,8,9,10};
// int arr2[]={2,3,4,4,5,11,12};
// int n1=arr1.length;
// int n2=arr2.length;
// int visited[]=new int[n2];
// int ans[]=new int[n2];
// int index=0;
// for(int i=0;i<n1;i++){
//     for(int j=0;j<n2;j++){
//         if(arr1[i]==arr2[j] && visited[j]==0 ){
//             ans[index++]=arr1[i];
//             visited[j]=1;
//             break;
//         }
//         if(arr2[j]>arr1[i])
//         break;
    
//     }
    
// }
// ans=Arrays.copyOf(ans , index);  //resize the array so that it can remove unused elements
// for(int i=0;i<ans.length;i++){
//     System.out.print(ans[i] + " ");
// }
// //missing no. in array
 //int arr[]={1,2,4,5};
 //int n=5;

// for(int i=1;i<=n;i++){
//     int found=0;
//     for(int j=0;j<arr.length;j++){
//         if(arr[j]==i){
//             found=1;
//             break;
//         }
//     }
//     if(found==0){
//         System.out.print(i);
//     }
// }

//////////////// OPTIMAL SOLUTION //////////////////////
// int sum = n * (n+1)/2;
// int sum2=0;
// for(int i=0;i<arr.length;i++){
//     sum2=arr[i]+sum2;
// }
// int ans= sum - sum2;
// System.out.print(ans);

// // maximum consecutive one
// int arr[]={1,1,0,1,1,1,0,1,1};
// int maximum=0;
// int counter=0;
// for(int i =0;i< arr.length;i++){
//     if(arr[i]==1){
//         counter++;
//         maximum=Math.max(counter, maximum);
//     }else{
//         counter=0;
//     }
// }
// System.out.println(maximum);

// // find the no apperaing only once and other twice
// int arr[]={1,1,2,3,3,4,4};
// int xor=0;
// for(int i=0;i<arr.length;i++){
//     xor=xor^arr[i];
// }
// System.out.print(xor);
   
// // LONGEST SUBARRAY WITH SUM K
// int arr[]={10, 5, 2, 7, 1, 9};
// int maxlen=0;
// int K=15;

// for(int i=0;i<arr.length;i++){
//     for(int j=i;j<arr.length;j++){
//         int sum = 0 ;
//         for(int k=i;k<=j;k++){
//             sum = sum + arr[k];
//         }
//         if(sum==K){
//             maxlen=Math.max(maxlen,j-i+1);
//         }
//     }
// }
// System.out.print(maxlen);

// //Two Sum : Check if a pair with given sum exists in Array
// int arr[]={4,1,2,3,1};
// int target = 5;
// int ans[]=Twosum(arr, target);
// System.out.println("This is the answer for variant 2: [" + ans[0] + ", "
// + ans[1] + "]");
// //String ans=Twosum(arr, target);
// //System.out.println(ans);
//    }
// // public static String Twosum(int arr[], int target){
// //     for(int i=0;i<arr.length;i++){
// //         for(int j=i+1;j<arr.length;j++){
// //             if(arr[i]+arr[j]==target){
// //               return "yes";
// //             }
// //         }
// //     }
// //     return "no";
// //}

// public static int[] Twosum(int arr[],int target){
//     int ans[]=new int[2];
//     ans[0] = ans[1] = -1;
//     for(int i=0;i<arr.length;i++){
//                 for(int j=i+1;j<arr.length;j++){
//                     if(arr[i]+arr[j]==target){
//                       ans[0]=i;
//                       ans[1]=j;
//                       return ans;
//                     }
//                 }
//             }
//             return ans ;
//         }
// }

// // sort 0,1,2 in an array
// int arr[]={0,1,2,0,1,2,1,2,0,0,0,1};
// int n =arr.length;
// int counter0=0 ;
// int counter1=0;
// int counter2=0;
// for(int i=0;i<n;i++){
//     if(arr[i]==0) {
//         counter0++;
//     }  
//     else if(arr[i]==1) {
//         counter1++;
//     }
//     else{
//         counter2++;
//     }   
//    }
//    for(int i =0; i<counter0; i++){
//     arr[i]=0;
//    }
//    for(int i=counter0;i<counter0+counter1;i++){
//     arr[i]=1;
//    }
//    for(int i=counter0+counter1;i<n;i++){
//     arr[i]=2;
//    }

//    for(int i=0;i<n;i++){
//     System.out.print(arr[i]);
//    }

// //MAJORITY ELEMENTS
//int arr[]={3,2,3};
 //int n=arr.length;
// System.out.println(majorityEle(arr, n));
//    }
//    public static int majorityEle(int arr[],int n){
//     for(int i=0;i<n;i++){
//         int counter=0;
//         for(int j=0;j<n;j++){
//             if(arr[i]==arr[j]){
//                 counter++;
//             }
//             if(counter>n/2){
//                 return arr[i];
//             }
//         }
        
//     }
//     return 1;
//    }


//OPTIMAL MOORE'S ALGORITHM
 
    // int ct=0;
    // int el=0;
    // for(int i=0;i<n;i++){
        
    //     if(ct==0){
    //         ct=1;
    //         el=arr[i];
    //     }
    //     else if(arr[i]==el){ 
    //         ct++;
    //     }else{
    //         ct--;
    //     }
    // }
    // int counter=0;
    // for(int i=0;i<n;i++){
    //     if(arr[i]==el){
    //         counter++;
    //     }
    // }
    // if(counter>n/2){
    //     System.out.print(el);
    // }

 //   //KADANE'S ALGORITHM (MAXSUBARRAY SUM) 
//  int arr[]={-2,1,-3,4,-1,2,1,-5,4};
//  int start=0;
//  int ansstart=-1;
//  int ansend=-1;
//  int sum=0;
//  int maxi=Integer.MIN_VALUE;
//  for(int i=0;i<arr.length;i++){
//     if(sum==0) start=i;
//     sum = sum + arr[i];
//     if(sum>maxi)
//     { 
//         maxi=sum;
//         ansstart=start;
//         ansend=i;
//     }
//     if(sum<0){
//         sum=0;
//     }
//  }
 
//     System.out.print("the subarray is :");
//     for(int i=ansstart; i<=ansend;i++){
//         System.out.print(arr[i] + " ");
//     }
//    System.out.print(maxi);
// }
// }

// best time to stock buy and sell
// int arr[]={7,1,5,3,6,4};
// int profit=0;
// int minPrice=arr[0];
// for(int i=1;i<arr.length;i++){
//    int cost=arr[i]-minPrice;
//    minPrice=Math.min(minPrice, arr[i]);
//    profit=Math.max(profit, cost);
// }
// System.out.println(profit);

// //rearrange elements alternately by sign (equal pos and neg elements)
//int arr[]={1,2,-4,-5};
// int ans []=new int[arr.length];
// int positive=0;
// int negative=1;
// for(int i=0;i<arr.length;i++){
//     if(arr[i]>0)
//     positive +=2;

//     if(arr[i]<0)
//     negative+=2;
// }
// for(int i=0;i<ans.length;i++){
//     System.out.print(arr[i] + " ");
// }

// //rearrange elements alternately by sign (notequal pos and neg elements and remaing put at last )

//int arr[]={1,2,-4,-5,3,4};
// ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,-4,-5,3,4));
// ArrayList <Integer> positive = new ArrayList<>();
// ArrayList <Integer>negative=new ArrayList<>();
// ArrayList <Integer> ans = new ArrayList<>(Arrays.asList(new Integer[arr.size()]));
//  for(int i=0;i<arr.size();i++){
//     if(arr.get(i)>0){
//         positive.add(arr.get(i));

//     }else{
//         negative.add(arr.get(i));
//     }
//  }

//  if(positive.size()>negative.size())
//  {
//     for(int i=0;i<negative.size();i++)
//     {
//         ans.set(2*i,positive.get(i));
//         ans.set(2*i+1,negative.get(i));
//     }
//     int index=negative.size()*2;
//     for(int i=negative.size();i<positive.size();i++)
//      {
//         ans.set(index,positive.get(i));
//         index++;
//      }
//  }
//  else{
//     for(int i=0;i<positive.size();i++)
//     {
//         ans.set(2*i,positive.get(i));
//         ans.set(2*i+1,negative.get(i));
//     }
//     int index=positive.size()*2;
//     for(int i=positive.size();i<negative.size();i++)
//     {
//         ans.set(index,negative.get(i));
//         index++;
//     }

//  }
//  for(int i=0;i<ans.size();i++){
//     System.out.print(ans.get(i));
//  }


// // next permutation 
// int arr[]={1,3,2};
// int n= arr.length;
// int index=-1;
//     for(int i=n-2;i>=0;i--){
//         if(arr[i]<arr[i+1]){
//             index=i;
//             break;
//         }    
//     }
//     if(index==-1){
//         reverseArray(arr, 0, n-1 );
//     }else{
//         for(int i=n-1;i>index;i--){
//             if(arr[i]>arr[index]){
//                 int temp =arr[i];
//                 arr[i]=arr[index];
//                 arr[index]=temp;
            
                
//                 // System.out.println(arr[i]);
        
//                 // System.out.println(arr[index] );
//                 break;
//         }
//     }
    
//         reverseArray(arr, index+1,n-1);
// }


// for(int i=0;i<n;i++){
//     System.out.print(arr[i]);
// }
// }
//   public static void reverseArray(int[] arr, int start, int end) {
//     while (start < end) {
//         int temp = arr[start];
//         arr[start] = arr[end];
//         arr[end] = temp;
//         start++;
//         end--;
//     }

// // LEADERS IN ARRAYS

// int arr[]={4,7,1,0};
// ArrayList<Integer> ans = new ArrayList<>();

// for (int i=0;i<arr.length;i++){

//     boolean leader = true;

//     for(int j=i+1;j<arr.length;j++)

//         if(arr[j]>arr[i])
//         {
//             leader=false;
//           break;
//         }

//         if(leader)
//         {
//             ans.add(arr[i]);
//         }

    
    
// }
// for(int i=0;i<ans.size();i++){
//     System.out.print(ans.get(i));
// }

// //LONGEST CONSECUTIVE SEQUENCE
// int arr[]={100,200,1,2,1,3,4};
// int longest =1;
// HashSet <Integer> ans = new HashSet<>();
// for(int i=0;i<arr.length;i++)
// ans.add(arr[i]);
// int startoflongestarray = 0;
// for(int it : ans){
//     if(!ans.contains(it - 1)){
//         int count=1;
//         int x = it;
//         while(ans.contains(x+1)){
//             x=x+1;
//             count++;
//         }
//        longest=Math.max(longest, count);
//         // if(count>longest){         
//         //     longest=count;
//         //     startoflongestarray=it;
//         // }
//     }
    
// }
// for(int i=0;i<longest;i++){
//     System.out.print( startoflongestarray + i );
// }
//System.out.print(longest);

// SET MATRIX ZERO

// ArrayList <ArrayList<Integer>> matrix = new ArrayList<>(); 
// matrix.add(new ArrayList<>(Arrays.asList(1,1,1)));
// matrix.add(new ArrayList<>(Arrays.asList(1,0,1)));
// matrix.add(new ArrayList<>(Arrays.asList(1,1,1)));
// int n = matrix.size();
// int m = matrix.size();

// ArrayList<ArrayList<Integer>> ans = zeromatrix(matrix, n, m);
// for(ArrayList<Integer> row : ans){
//     for(Integer ele : row ){
//         System.out.print(ele + " ");
//     }
//     System.out.println();
// }
// }
// static ArrayList<ArrayList<Integer>> zeromatrix(ArrayList<ArrayList<Integer>>matrix, int n ,int m)
// {
//     int[] col = new int[m];
// int [] row = new int[n];

// for(int i=0;i<n;i++){
//     for(int j=0;j<m;j++){
//         if(matrix.get(i).get(j)==0){
//             row[i]=1;
//             col[j]=1;
//         }
//     }
// }
// for(int i=0;i<n;i++){
//     for(int j=0;j<m;j++){
//         if(row[i]==1 || col[j]==1){
//             matrix.get(i).set(j,0);
//         }
//     }
// }
// return matrix;


// rotate  matrix by 90 degree 
// int [][] matrix ={
//                     {1,2,3},
//                     {4,5,6},
//                     {7,8,9}
//                 };
// int n = matrix.length;
// int [][] rotatedmatrix = new int[n][n];

// for(int i=0;i<n;i++){
//     for(int j=0;j<n;j++){
//         rotatedmatrix[j][n-1-i]=matrix[i][j];
//     }
// }
// for(int i=0;i<rotatedmatrix.length;i++){
//     for(int j=0;j<rotatedmatrix.length;j++){
//         System.out.print(rotatedmatrix[i][j] + " ");
//     }
//     System.out.println();
// }

// count subarrays sum equals with k
// int[] arr ={3,1,2,4};
// int t=6;
// int count=0;
// for(int i=0;i<arr.length;i++){
//     for(int j=i;j<arr.length;j++){
//         int sum =0;
//         for(int k =i; k<=j; k++){
//             sum = sum + arr[k];
//         }
//         if(sum==t){
//             count++;
//         }
//     }
    
// }
// System.out.print("no . of subarrays are :" + count);

// PASCALS TRAINGLE 
// int n=6;
// ArrayList<ArrayList<Integer>> ans = pascalTriangle(n);
// for(ArrayList<Integer> it : ans){
//     for(int element : it ){
//         System.out.print(element + " ");
//     }
//     System.out.println();
// }
//    }
// public static ArrayList<Integer> generateRow(int row){
//     long ans=1;
//     ArrayList <Integer> ansRow = new ArrayList<>();
//     ansRow.add(1);
//     for(int col=1;col<row;col++){
//         ans=ans*(row-col);
//         ans=ans/col;
//         ansRow.add((int)ans);
//     }
//     return ansRow;
// }
// public static ArrayList<ArrayList<Integer>> pascalTriangle(int n){

//     ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
//     for(int row =1;row<=n;row++){
//         ans.add(generateRow(row));
//     }
//     return ans;

// majority element >n/2

// int arr[]={1,2,2,3,2};
// int count =0;
// int ans=0;
// for(int i =0; i<arr.length;i++){
   
//     for(int j=1;j<arr.length;j++){
//         if(arr[j]==arr[i])
//         count++;
//     }
//     if(count > arr.length/2){
//          ans =arr[i];
 
//     }

// }
// System.out.print(ans);

//3 Sum : Find triplets that add up to a zero
 //int arr [] ={-1,0,1,2,-1,-4};
// HashSet <ArrayList<Integer>> set = new HashSet<>();
// for(int i=0;i<arr.length;i++){
//     {
//         for(int j=i+1;j<arr.length;j++){
//             for(int k =j+1 ; k<arr.length; k++){
//                 if(arr[i]+arr[j]+arr[k] ==0){
//                     ArrayList<Integer> temp = new ArrayList<>(Arrays.asList(arr[i],arr[j],arr[k]));
//                     temp.sort(null);
//                     set.add(temp);
//                 }
//             }
//         }
//     }
// }
// ArrayList<ArrayList<Integer>> ans = new ArrayList<>(set);

// for(ArrayList<Integer> it : ans){
//     System.out.print("[");
//     for(Integer  ele : it ){
//         System.out.print (ele + " ");
//     }
//     System.out.print("] ");
// }
// System.out.println();

//optimal approach
        // int arr [] ={-1,0,1,2,-1,-4};
        // ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        // Arrays.sort(arr);
        // for(int i=0;i<arr.length;i++){
        //     if(i>0 && arr[i]==arr[i-1]) continue;
        //     int j = i+1;
        //     int k = arr.length-1;
        //     while(j<k){
        //         int sum = arr[i]+arr[j]+arr[k] ;
        //         if(sum<0){
        //             j++;
        //         }else if (sum>0){
        //             k--;
        //         }else{
        //             ArrayList<Integer> temp = new ArrayList<>(Arrays.asList(arr[i],arr[j],arr[k]));
        //             ans.add(temp);
        //             j++;
        //             k--;
        //             while(j<k && arr[j]==arr[j-1]) j++;
        //             while(j<k && arr[k]==arr[k+1]) k--;
        //         }
        //     }
        // }

        // ArrayList<ArrayList<Integer>> ans1 = new ArrayList<>(ans);
        // for(ArrayList<Integer> it : ans1){
        //     System.out.print("[ ");
        //     for(Integer ele : it){
        //         System.out.print(ele + " ");
        //     }
        //     System.out.print("] ");

            
        // }
        // System.out.println();

// // 4 sum -Find Quads that add up to a target value
            // int arr[]={1,0,-1,0,-2,2};
            // int target=0;
            // HashSet <ArrayList<Integer>> set = new HashSet<>();
            // for(int i =0 ; i<arr.length;i++){
            //     for(int j=i+1;j<arr.length;j++){
            //         for(int k = j+1; k<arr.length;k++){
            //             for(int m=k+1;m<arr.length;m++){
            //                     if(arr[i]+arr[j]+arr[k]+arr[m]==target){
            //                         ArrayList<Integer> temp = new ArrayList<>(Arrays.asList(arr[i],arr[j],arr[k],arr[m]));
            //                         temp.sort(null);
            //                         set.add(temp);
            //                     }
            //             }
            //         }
            //     }
            // }
            // ArrayList <ArrayList<Integer>> ans = new ArrayList<>(set);
            // for(ArrayList<Integer> it : ans)
            // {
            //     System.out.print("[");
            //     for(Integer ele : it){
            //         System.out.print(ele + " ");
            //     }
            //     System.out.print("] ");
            // }
            // System.out.println();
// length of longest subarray with zero sum
    // int arr[] = {9,-3,3,-1,6,-5};
    // int maxlen = 0;
    // for(int i=0;i<arr.length;i++){
    //   for(int j=i;j<arr.length;j++){
    //     int sum =0;
    //     for(int k =i;k<=j;k++){     // can also skip k for k loop ans sum = sum + arr[j]
    //         sum = sum + arr[k];
    //         if(sum==0)
    //         maxlen=Math.max(maxlen , j-i+1);
    //     }
    //   }
    // }
    // System.out.print(maxlen);





 }
 
 }








   

