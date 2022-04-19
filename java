import java.io.*;
import java.util.*;
public class even
{
public static void main(String args[])
{
int n;
int i=1;
System.out.println("enter number");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
while(n>=i)
{
i++;
if(i%2==0)
{
System.out.print(i+" ");
}
}
}
}
