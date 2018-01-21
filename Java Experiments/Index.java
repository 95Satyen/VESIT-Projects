import java.util.*;
class Index
  {
static int[][] Disk;  
public static void main(String args[])
    {
     Scanner s=new Scanner(System.in);
      Disk=new int[30][71];
int i=0,j=0;
int count=3;
for(i=0;i<5;i++)
{Disk[3][i]=count;
count=count*2;
}
count=4;
for(i=0;i<5;i++)
{Disk[2][i]=count;
count=count*2;}

int FileA=3;
int FileB=2;


System.out.println("Enter the file to be accessed \n 1.File A \n 2.File B ");
int z=s.nextInt();

switch(z){
case 1: System.out.println("File A has index 3");
for( i=0;i<5;i++)
System.out.println(Disk[FileA][i]);
System.out.println("\nDisk");
for(j=0;j<70;j++)
{
System.out.print("\n"+(j+1)+"  ");
for(i=0;i<5;i++)
if(Disk[3][i]==j+1)
{
System.out.print("FileA");
i++;
}

}
break;
case 2: System.out.println("File B has index 2");
for( i=0;i<5;i++)
System.out.println(Disk[FileB][i]);
System.out.println("\nDisk");
for(j=0;j<70;j++)
{
System.out.print("\n"+(j+1)+"  ");
for(i=0;i<5;i++)
if(Disk[2][i]==j+1)
{
System.out.print("FileB");
i++;
}
}
}

}}