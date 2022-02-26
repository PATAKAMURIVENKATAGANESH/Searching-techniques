//20mis7081 .
package linearsearch;
import java.util.*;
        public class Linearsearch{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int i;
String sa="3";
System.out.println("enter the number of elements");
i=sc.nextInt();
int b[]=new int[i];
System.out.println("enter the element to search");
int j=sc.nextInt();
for(int h=0;h<i;h++){
b[h]=sc.nextInt();
}
System.out.println("enter the elements");
for(int h=0;h<i;h++){
if(b[h]==j)
sa="4";
}
if(sa=="4")
System.out.println("present");
else
System.out.println("absent");
}
}
