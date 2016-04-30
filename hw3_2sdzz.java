package baiduyun;

import java.util.*;
public class hw3_2shudezhengzhi {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		int num=0;  //
		int digit=0;  // 数位
		int Parity=1;  //数字奇偶 1偶数 -1奇数
		int Parity2=1; //数位奇偶 1偶数 -1奇数
		int agree=0;  //一致性 1一致  0不一致
		int binary=1;  //二进制
		int sum=0;
		while(x!=0)
		{
				num=x%10;
				digit++;
				Parity2*=-1;
				if(num%2==0)
				{
					Parity=1;
				}
				else 
				{
					Parity=-1;
				}
				if(Parity==Parity2)
				{
					agree=1;
				}
				else
				{
					agree=0;
				}
				if(agree==1)
				{
					sum+=binary;
				}
				x/=10;
				binary*=2;
		}
		System.out.print(sum);
	}
}