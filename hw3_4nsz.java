package baiduyun;
import java.util.Scanner;
public class hw3_4nianshuzi{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String[] ary1={"ling","yi","er","san","si","wu","liu","qi","ba","jiu"};
		int count=0;
		int num=in.nextInt();
		if(num==0)
		{
			System.out.print(ary1[0]);
			System.exit(0);
		}
		if(num<0)
		{
			System.out.print("fu ");
		}	
		num=Math.abs(num); //求绝对值
		int temp=num;
		while(temp!=0)
		{
			temp/=10;
			count++;
		}
		int a=num/(int)Math.pow(10, count-1); //Math函数pow（a,b）a的b次方
		System.out.print(ary1[a]);
		while(count>1)
		{
			int b=num/(int)Math.pow(10, count-2)%10;
			System.out.print(" "+ary1[b]);
			count--;
		}
//		String x=in.nextLine();  //将本行输入的数字作为字符串
//		int y=Integer.valueOf(x); //由于x字符串为数字 强行转换String x值为Int并 赋值
//		if(y<0)
//		{
//			System.out.print("fu ");
//		}
//		y=Math.abs(y); //绝对值
//		int[] ary2=new int[x.length()];  //将字符串的长度作为新数组长度
//		for(int i=0;i<x.length();i++) //遍历字符串
//		{
//			char c=x.charAt(i);  //新建单字符变量c逐个获取字符串的字符
//			ary2[i]=(int)(c-'0'); //字符的数字-'0' 就是纯数字
//		}
//		for(int i=0;i<ary2.length;i++)
//		{
//			int temp=0;
//			temp=ary2[i];
//			System.out.print(ary1[temp]+" ");	
//		}
	}
}
//import java.util.Scanner;  
//public class Main {    
//    public static void main(String[] args) {  
//
//        Scanner in = new Scanner(System.in);  
//        int[][] num = new int[2][120];  
//        int i,j,size,New,max=0,tag=0;           
//        for(i=0;i<2;i++){ 
//            size = in.nextInt(); 
//            if(max<size)  
//                max=size;             
//            num[i][size]=in.nextInt();  
//            if(size==0)
//                continue;  
//            do { 
//                New = in.nextInt();  
//                num[i][New]+=in.nextInt();  
//            } while (New!=0);  
//        }    
//        for(i=max;i>=0;i--){  
//            if(max==0)
//                {System.out.print((num[0][i]+num[1][i]));break;}  
//            if((num[0][i]+num[1][i])!=0){ 
//                if(tag==1)
//                    if((num[0][i]+num[1][i])>=0)
//                        System.out.print("+");  
//                if((num[0][i]+num[1][i])!=1||i==0)
//                    System.out.print(num[0][i]+num[1][i]);  
//                if(i!=0)
//                    System.out.print("x");  
//                if(i!=0&&i!=1)
//                    System.out.print(i);  
//                tag=1;
//            }  
//            if(tag==0&&i==0&&(num[0][i]+num[1][i])==0)
//                System.out.print((num[0][i]+num[1][i]));                  
//        }  
//        System.out.println();  
//        }  
//}  
//
//
