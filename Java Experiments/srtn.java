import java.util.*;
class srtn{
static int[] bt;
static int[] at;
static int[] wt;
static int[] tt;
static int[] pno;
static int[] timeline;
static int n;
public static void main(String args[])
{timeline =new int[1000];
pno = new int[100];
    bt = new int[100];
    wt = new int[100];
    at = new int[100];
    tt = new int[100];

Scanner sc=new Scanner(System.in);
System.out.println("Enter the no of processes");
int i,j,temp,range=0;
for(i=0;i<n;i++)
{System.out.println("Enter the burst time and arival time of  process no "+ (i+1));
bt[i]=sc.nextInt();
at[i]=sc.nextInt();
pno[i]=i+1;
}



for(i=0;i<n-1;i++)
for(j=i+1;j<n;j++)
if(at[i]>at[j])
{temp=bt[i];
	bt[i]=bt[j];
	bt[j]=temp;
	temp=at[i];
	at[i]=at[j];
	at[j]=temp;
                  temp=pno[i];
	pno[i]=pno[j];
	pno[j]=temp;
}
i=0;
for(;i<n;)
{if((at[i]<=range)&&(bt[i]!=0))
{bt[i]--;
timeline[range]=pno[i];
range++;}
else
i++; 
}
for(i=0;i<range;i++)
System.out.print(timeline[range]+" ");
}




static void sort(int r)
{int i,j,temp;
for(i=0;i<n-1;i++)
for(j=i+1;j<n;j++)
if((bt[i]>bt[j])&&(at[i]<=r))
{temp=bt[i];
	bt[i]=bt[j];
	bt[j]=temp;
	temp=at[i];
	at[i]=at[j];
	at[j]=temp;
                  temp=pno[i];
	pno[i]=pno[j];
	pno[j]=temp;

}
}
}