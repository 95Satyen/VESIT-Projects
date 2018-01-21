public class SSTF 
{
	public int arr[]={98,183,37,122,14,124,65,67};
	public int sum=0;
	public int head=50;
	public int ttrack=199;
	
	class Sstf
	{
		void start()
		{
			sum=0;
			head=53;
			
			int visited[]=new int[arr.length];
		
			System.out.println("Head at position "+head);
			for(int i=0;i<arr.length;i++)
			{
				int k=0;
				int small=199;
				for(int j=0;j<arr.length;j++)
				{
					if(Math.abs(arr[j]-head)<small&&visited[j]!=1)
					{
						small=Math.abs(arr[j]-head);
						k=j;
					}
				}
				if(head>arr[k])
				System.out.println(arr[k]+"<----"+head+ " "+sum);
				else
				System.out.println(head+"---->"+arr[k]+" "+sum);
				sum+=Math.abs(arr[k]-head);
				head=arr[k];
				visited[k]=1;
			}
			System.out.println("The overhead travelled = "+sum);
		}
	}
	public static void main(String[] args) 
	{
		SSTF x = new SSTF();
		System.out.println("*****SSTF*****");
		Sstf a2 = x.new Sstf();
		a2.start();
		System.out.println();
	}
}