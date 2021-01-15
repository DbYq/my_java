package test.java;

import java.util.Scanner;

//摄氏度与华氏度的转换
/*
 * public class Pta {
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * double F=100; double C; C=(int)5*(F-32)/9; System.out.println(C); }
 * 
 * }
 */
//计算物体下落距离
/*
 * public class Pta { public static void main(String[] args) { int hight=0; int
 * i=0; for(i=0;i<=3;i++) { hight=hight+10*i; } System.out.println(hight); } }
 */
//计算平均分
/*
 * public class Pta { public static void main(String[] args) { int Math=87; int
 * English=72; int Computer=93; int average=(Math+English+Computer)/3;
 * System.out.println(average); } }
 */
//计算平方数
/*
 * public class Pta { public static void main(String[] args) { int x=3; int y=9;
 * System.out.println(y+"="+x+"*"+x); System.out.println(x+"*"+x+"="+y); } }
 */
//整数152的各位数字
/*
 * public class Pta { public static void main(String[] args) { int a=152; int
 * g,s,b; g=152/1%10; s=152/10%10; b=152/100%10;
 * System.out.println(a+"="+b+"*100"+"+"+s+"*10"+"+"+g); } }
 */
//计算分段函数
/*
 * public class Pta { public static void main(String[] args) { Scanner in=new
 * Scanner(System.in); System.out.println("输入一个数：\n"); double x=in.nextDouble();
 * double y; if(x==0) { y=0; } else { y=1/x; } System.out.println(y); } }
 */
//计算利息
/*
 * public class Pta { public static void main(String[] args) { Scanner in=new
 * Scanner(System.in); double money=in.nextDouble(); double
 * rate=in.nextDouble(); int year=in.nextInt(); double
 * interest=money*Math.pow(1+rate, year)-money;
 * System.out.printf("interest="+"%.2f",interest); } }
 */
/*
 //计算分段函数
 /* public class Pta { public static void main(String[] args) { double y; Scanner
 * in=new Scanner(System.in); double x=in.nextDouble(); if(x>=0) {
 * y=Math.sqrt(x); } else { y=Math.pow(x+1, 2)+2*x+1/x; }
 * System.out.printf("f(%.2f)=%.2f",x,y); } }
 */
//计算平均值
/*
 * public class Pta { public static void main(String[] args) { Scanner in=new
 * Scanner(System.in); int a=in.nextInt(); int b=in.nextInt(); int
 * c=in.nextInt(); int d=in.nextInt(); int sum; double average; sum=a+b+c+d;
 * average=1.0*sum/4; System.out.printf("sum=%d,average=%.1f",sum,average); } }
 */
//整数四则运算
/*
 * public class Pta { public static void main(String[] args) { Scanner in=new
 * Scanner(System.in); int a=in.nextInt(); int b=in.nextInt();
 * System.out.printf("%d+%d=%d\n",a,b,a+b);
 * System.out.printf("%d-%d=%d\n",a,b,a-b);
 * System.out.printf("%d8%d=%d\n",a,b,a*b);
 * System.out.printf("%d/%d=%d\n",a,b,a/b); } }
 */
//阶梯电价
/*
 * public class Pta { public static void main(String[] args) { Scanner in=new
 * Scanner(System.in); double x=in.nextDouble(); if(x<0) {
 * System.out.println("Invalid Value!"); } else if(x<=50) {
 * System.out.printf("cost=%.2f",0.53*x); } else {
 * System.out.printf("cost=%.2f",0.53*50+(x-50)*(0.53+0.05)); } } }
 */
//计算火车运行时间
/*
 * public class Pta { public static void main(String[] args) { Scanner in=new
 * Scanner(System.in); int a=in.nextInt(); int b=in.nextInt(); int
 * c,d,e,f,minute,hour; c=a%100; d=b%100; e=a/100; f=b/100; minute=d-c;
 * if(d-c<0) { f=f-1; minute=minute+60; } hour=f-e;
 * System.out.printf("%02d:%02d",hour,minute); } }
 */
//求1到100的和
/*
 * public class Pta { public static void main(String[] args) { int i=0; int
 * sum=0; for(i=1;i<=100;i++) { sum=sum+i; } System.out.println(sum); } }
 */
//n分之一序列的前n项和
/*
 * public class Pta { public static void main(String[] args) { Scanner in=new
 * Scanner(System.in); int n=in.nextInt(); double i=0; double sum=0;
 * for(i=1;i<=n;i++) { sum=sum+1/i; } System.out.printf("sum=%.6f",sum); } }
 */
//求奇数分之一序列的前n项和
/*
 * public class Pta { public static void main(String[] args) { Scanner in=new
 * Scanner(System.in); int n=in.nextInt(); double i=0,sum=0;
 * for(i=1;i<=100;i+=2) { if(n==0) { break; } sum=sum+1/i; n--; }
 * System.out.printf("sum=%.6f",sum); } }
 */
/*
 * public class Pta { public static void main(String[] args) { Scanner in=new
 * Scanner(System.in); int n=in.nextInt(); double i=0,sum=0; int k=1;
 * for(i=1;i<=100;i+=3) { if(n==0) { break; } sum=sum+k*(1/i); n--; k=-k; }
 * System.out.printf("sum=%.3f",sum); } }
 */
