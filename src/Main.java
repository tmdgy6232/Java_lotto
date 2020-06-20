import lotto.biz.LottoBIz;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        LottoBIz lottoBIz = new LottoBIz();

        for (int i=0; i<5; i++) {
            // 번호 생성
            List<Integer> lottoArray = lottoBIz.getLottoNums();

            // 데이터 정렬
            lottoArray = lottoBIz.lottoSort(lottoArray);

            // 데이터 출력
            for (int a : lottoArray){
                System.out.print(a + "\t");
            }
            System.out.println("");
        }
    }
}
