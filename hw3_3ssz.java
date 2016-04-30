package baiduyun;
import java.util.*;
public class hw3_3sushusum {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		int sum=0;
		int count=0;  //计数器
		OUT:
			for(int x=2;;x++)
			{
				int is=1;
				for(int i=2;i<x;i++)
				{
					if(x%i==0)
					{
						is=0;
						break;
					}
				}
				if(is==1)
				{
					count+=1;
					if(count>=n&&count<=m)
					{
						sum+=x;
						if(count==m)
						{
							break OUT;
						}
					}				
				}
			}
		System.out.println(sum);
	}
}

