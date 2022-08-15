import java.util.Scanner;

public class num2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int real_N = N;
        int one = 1;
        //one =1 한자릿수
        //one =10 두자릿수 의미
        int nine = 9;

        //nine 변수는 자릿수*9이다.
        //만약 하지만 N-nine해서 양수가 나오지 않으면 nine-9를해주어 다시 계산하여준다.
        while ((real_N / one) > 0) {
            one *= 10;
            nine += 9;
        }

        if ((real_N / one) == 0) {
            one /= 10;
            nine -= 9;
        }

        //생성자 계산
        if (real_N - nine <= 0) {
            nine -= 9;//하나빼줌
        }

        N = real_N - nine;//여기서 부터 생성자 찾기 시작
        if(nine==0) N=1;
        int real_one = one; //원래 one을넣어준다.



        for (; N < real_N; N++) {
            //또 자릿수를 구해준다.
            //그래봤자 한 자리수밖에 차이 안날거기땜시
            int num = N;
            int nujeok = 0;
          one=real_one;

            //만약 생성자의 자릿수 적을 경우 자릿수 맞춰줌
            if ((N / real_one) == 0) { one /= 10 ;}


            one*=10;
            while (one != 1) {
                    num += (N%one)/(one/10);
                    one/=10;
            }
            if (num == real_N) {
                System.out.println(N);
                return;
            }
        }
        if (N == real_N) {
            System.out.println(0);
        }


    }
}







