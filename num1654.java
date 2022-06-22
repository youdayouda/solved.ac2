import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class num1654 {
    public static void main (String[] args) throws IOException{
        int N,M;
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String s=bf.readLine();
        StringTokenizer st=new StringTokenizer(s);
        N=Integer.parseInt(st.nextToken());
        M=Integer.parseInt(st.nextToken());


//길이 입력
        //중간 값을 이용하여 줍니다.
        int num[]=new int[N];
        String array[]=new String[N];

        for(int i=0;i<N;i++){
            array[i]=bf.readLine();
            num[i]=Integer.parseInt(array[i]);
        }
        long max=num[0],min=0;

        for(int i=1;i<N;i++){
            if(max<num[i])
                max=num[i];
        }
        max++;

        long mid;
        int ans;
        while(min<max){
            ans=0;
            mid=(min+max)/2;
            for(int i=0;i<N;i++){
                ans+=(num[i]/mid);
            }
            //랜선의 개수보다 작으면
            //최대 길이를 줄인다.
            if(ans<M)
                max=mid;
            else min=mid+1;
        }

        System.out.println(min-1);

    }
}