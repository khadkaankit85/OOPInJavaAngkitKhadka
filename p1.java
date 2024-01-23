public class Main {
   public static void main(String arg[])
  {
    int n=5,t=0; // t=0 is an empty bag
    int a[]=new int[n];
    a[0]=10;
    a[1]=20;
    a[2]=30;
    a[3]=40;
    a[4]=50;
    for(int i=0;i<n;i++)  //body of for loop will fill bag t by iteration
    t=t+a[i];
    System.out.println("average of  ("+a[0]+","+a[1]+","+a[2]+","+a[3]+","+a[4]+")  is ="+ t/n  + "total=" + t);
  }
}