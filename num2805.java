import java.util.Scanner;

public class num2805{
    //나무자르기
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        int N=a.nextInt();
        long M=a.nextLong();

        long namu[]=new long[N];
        for(int i=0;i<N;i++)
            namu[i]=a.nextLong();
        long max,min=0,mid,ans;
        max=namu[0];

        for(int i=1;i<N;i++){
            if(max<namu[i]) max=namu[i];
        }

        if(N==1){
            long num=namu[0]-M;
            String s=String.valueOf(num);
            System.out.println(s);

        }
        else{
            while(min<max){
                ans=0;
                mid=(min+max)/2;
                for(int i=0;i<N;i++){
                    if(namu[i]-mid>0)
                        ans+=(namu[i]-mid);
                }
                if(ans>=M)
                    min=mid+1;
                else
                    max=mid;

            }
            long dd=max-1;
            String ss=String.valueOf(dd);
            System.out.println(ss);}

    }
}
