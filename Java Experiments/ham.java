import java.util.*;


class ham{
public static void main(String args[]) throws Exception
 {
Scanner sc = new Scanner(System.in);
int[] a = new int[12]; 
int[] r = new int[12]; 
int[] v = new int[4]; 
int value=0,c=0;
System.out.println("Enter the message");

for(int i=11;i>0;i--)
{if((i!=1)&&(i!=2)&&(i!=4)&&(i!=8))
a[i]=sc.nextInt();
else
a[i]=-1;
}

if(a[3]==1)c++;
if(a[5]==1)c++;
if(a[7]==1)c++;
if(a[9]==1)c++;
if(a[11]==1)c++;
if(c%2==0)
a[1]=0;
else
a[1]=1;

c=0;
if(a[3]==1)c++;
if(a[6]==1)c++;
if(a[7]==1)c++;
if(a[10]==1)c++;
if(a[11]==1)c++;
if(c%2==0)
a[2]=0;
else
a[2]=1;

c=0;
if(a[5]==1)c++;
if(a[6]==1)c++;
if(a[7]==1)c++;
if(c%2==0)
a[4]=0;
else
a[4]=1;

c=0;
if(a[9]==1)c++;
if(a[10]==1)c++;
if(a[11]==1)c++;
if(c%2==0)
a[8]=0;
else
a[8]=1;
System.out.println("Correct code");

for(int i=11;i>0;i--)
System.out.print(a[i]+" ");

System.out.println("\n Decoded code");
for(int i=11;i>0;i--)
{r[i]=sc.nextInt();
}
c=0;
if(r[1]==1)c++;
if(r[3]==1)c++;
if(r[5]==1)c++;
if(r[7]==1)c++;
if(r[9]==1)c++;
if(r[11]==1)c++;
if(c%2==0)
r[1]=0;
else
r[1]=1;

c=0;
if(r[2]==1)c++;
if(r[3]==1)c++;
if(r[6]==1)c++;
if(r[7]==1)c++;
if(r[10]==1)c++;
if(r[11]==1)c++;
if(c%2==0)
r[2]=0;
else
r[2]=1;

c=0;
if(r[4]==1)c++;
if(r[5]==1)c++;
if(r[6]==1)c++;
if(r[7]==1)c++;
if(c%2==0)
r[4]=0;
else
r[4]=1;

c=0;
if(r[8]==1)c++;
if(r[9]==1)c++;
if(r[10]==1)c++;
if(r[11]==1)c++;
if(c%2==0)
r[8]=0;
else
r[8]=1;
System.out.println("\n Decoded code");

for(int i=11;i>0;i--)
System.out.print(r[i]+" ");

value=(r[8]*8)+(r[4]*4)+(r[2]*2)+r[1];
System.out.println("\n"+value);

if(r[value]==0)
r[value]=1;
else
r[value]=0;


System.out.println("\n corr code");

for(int i=11;i>0;i--)
System.out.print(r[i]+" ");

}



}