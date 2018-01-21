import java.util.Scanner;
class CRC
{
public static void main(String args[])
{ 
Scanner sc=new Scanner(System.in);
int m,g[],n,d[],z[],r[],msb,i,j,k;
System.out.print("Enter no. of data bits : ");
n=sc.nextInt();
System.out.print("Enter no. of generator bits : ");
m=sc.nextInt();
d=new int[n+m];
g=new int[m];
System.out.print("Enter data bits : ");
for(i=0;i<n;i++)
d[i]=sc.nextInt();
System.out.print("Enter generator bits : ");
for(j=0;j<m;j++)
g[j]=sc.nextInt();
for(i=0;i<m-1;i++)
d[n+i]=0;
r=new int[m+n];
for(i=0;i<m;i++)
r[i]=d[i];          //division var

for(i=0;i<n;i++)
{ 
k=0;
msb=r[i];
for(j=i;j<m+i;j++)
{ 
if(msb==0) 
r[j]=(r[j]^0);
else  
r[j]=(r[j]^g[k]);
k++;
}
r[m+i]=d[m+i];
}
System.out.print("The code bits added are : ");
for(i=n;i<n+m-1;i++)
{ 
d[i]=r[i];
System.out.print(d[i]);
}
System.out.print("\nThe code data is : ");
for(i=0;i<n+m-1;i++)
{ 
System.out.print(d[i]); 
}
}

}