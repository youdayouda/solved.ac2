import java.util.Scanner;

public class num1018{
    public static void main(String[] args) {

        String whiteb[]=
                {"WBWBWBWB",
                        "BWBWBWBW",
                        "WBWBWBWB",
                        "BWBWBWBW",
                        "WBWBWBWB",
                        "BWBWBWBW",
                        "WBWBWBWB",
                        "BWBWBWBW"
                };

        String  blackw[]=
                {"BWBWBWBW",
                        "WBWBWBWB",
                        "BWBWBWBW",
                        "WBWBWBWB",
                        "BWBWBWBW",
                        "WBWBWBWB",
                        "BWBWBWBW",
                        "WBWBWBWB"
                };

        Scanner a=new Scanner(System.in);
        int num1,num2;

        num1=a.nextInt();
        num2=a.nextInt();

        String answer[]=new String[num1];


        for(int i=0;i<num1;i++)
            answer[i]=a.next();


        int real_ans=0;

        int real_ans2=0;
        int num_ans=0;
        int num_ans2=0;
        boolean one=true;
        //한칸씩 옆으로 이동 하면서 계산하기
        for(int i=0;i<=num1-8;i++) {
            for(int j=0;j<=num2-8;j++) {

                num_ans=0;
                num_ans2=0;
                for(int o=0;o<8;o++) {

                    for(int k=0;k<8;k++) {
                        if(whiteb[o].charAt(k)!=answer[o+i].charAt(k+j))
                            num_ans++;
                        if(blackw[o].charAt(k)!=answer[o+i].charAt(k+j))
                            num_ans2++;
                    }
                }
                if(one){
                    real_ans=num_ans;
                    real_ans2=num_ans2;
                    one=false;
                }
                else{
                    if(real_ans>num_ans) real_ans=num_ans;
                    if(real_ans2>num_ans2) real_ans2=num_ans2;
                }
            }
        }

        if(real_ans>real_ans2)
            System.out.println(real_ans2);
        else
            System.out.println(real_ans);








    }
}
