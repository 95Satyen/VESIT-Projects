import java.util.*;
class sjf
{
static int[] processno;
static int[] bursttime;
static int[] tt;
static int[] wt;

public static void main(String args[])
{int i,j,n;
Scanner sc=new Scanner(System.in);
processno=new int[100];
bursttime=new int[100];
tt=new int[100];
wt=new int[100];

System.out.println("Enter the no of processes");
n=sc.nextInt();
for(i=0;i<n;i++)
{System.out.println("Enter the bt for "+(i+1)+" process");
bursttime[i]=sc.nextInt();
processno[i]=i+1;}

int temp,turn=0,avg=0;
for(i=0;i<n-1;i++)
for(j=i+1;j<n;j++)
if(bursttime[i]>bursttime[j])
{temp=bursttime[i];
bursttime[i]=bursttime[j];
bursttime[i]=temp;
temp=processno[i];
processno[i]=processno[j];
processno[j]=temp;
}

wt[0]=0;
for(i=0;i<n;i++)
{tt[i]=wt[i]+bursttime[i];
wt[i+1]=tt[i];
System.out.println("Waiting time for "+processno[i]+" process = "+wt[i]);
}

for(i=0;i<n;i++)
{turn+=tt[i];
avg+=wt[i];
}

turn/=n;
avg/=n;

System.out.println("Avg Waiting time : "+avg);
System.out.println("total tt : "+turn);


}
}

