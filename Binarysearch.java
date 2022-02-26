
package binarysearch;

import java.util.*;
 public class Binarysearch{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int i;
System.out.println("enter the number of elements");
i=sc.nextInt();
int b[]=new int[i];
System.out.println("enter the element to search");
int j=sc.nextInt();
System.out.println("enter the  elements");
for(int h=0;h<i;h++){
b[h]=sc.nextInt();
}
int count=binarysearch(b,0,i,j);
if(count==-1)
System.out.println("absent");
else
System.out.println("present");
}
public static int binarysearch(int q[],int e,int r,int y){
Arrays.sort(q);
if(r>=e){
int mid=e+(r-e)/2;
if(q[mid]==y){
return mid;
}
 if(mid>y){
return binarysearch(q,e,mid-1,y);
}
else{
return binarysearch(q,mid+1,r,y);
}
}
return -1;
}
}