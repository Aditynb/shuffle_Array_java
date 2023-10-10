import java.util.*;
class shuffle{
    public static void shuffle_Array(int a[],int n){
        Random r=new Random();
        for(int i=n-1;i>0;i--){
            int j=r.nextInt(i+1);
            int t=a[i];
            a[i]=a[j];
            a[j]=t;
        }
    }
    public static void main(String args[]){
     int a[]={1,2,3,4,5,6,7};
     shuffle_Array(a,a.length);
     for(int i=0;i<a.length;i++)
     System.out.print(a[i]+" ");
    }
}
     