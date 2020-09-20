package lotto.biz;

import java.util.*;

/* ========================================================
 *  @ 프로그램 설명 :
 *  @ 작성자 : seunghyo
 *  @ 작성일 : 2020.06.20
 *  ========================================================
 * */
public class LottoBIz {


    /* ========================================================
     *  @ 메소드 설명 : 로또 번호 생성 및 중복제거
     *  @ 작성자 : seunghyo
     *  @ 작성일 : 2020.06.20
     *  ========================================================
     * */
    public List<Integer> getLottoNums() {
        // 랜덤함수 생성
        Random rnd = new Random();
        // 로또어레이 생성
        List<Integer> lottoArray = new ArrayList<>();

        // 반복문 시작
        while(lottoArray.size() < 6){
            // 0~45까지 난수 생성


            // 컴터의 랜덤을 더욱 랜덤하게 만들고자 기능 추가
            List<Integer> pickList = new ArrayList<>();
            for (int i = 0; i < 94; i++){
                int lottoNum = rnd.nextInt(45) + 1;
                pickList.add(lottoNum);
            }

            int lottoNum = 0;

            for (int i =0; i<94; i++){
                Collections.shuffle(pickList);
                lottoNum = pickList.get(rnd.nextInt(9));
            }

            // 조건문 생성
            if (!lottoArray.contains(lottoNum)){
                 lottoArray.add(lottoNum);
            }
        }
        return lottoArray;
    }

    /* ========================================================
    *  @ 메소드 설명 : 데이터 오름차순 정렬
    *  @ 작성자 : seunghyo
    *  @ 작성일 : 2020.06.20
    *  ========================================================
    * */
    public List<Integer> lottoSort(List<Integer> lottoArray) {
        //정렬 메서드
        lottoArray.sort(Comparator.naturalOrder());
    return lottoArray;
    }
}
