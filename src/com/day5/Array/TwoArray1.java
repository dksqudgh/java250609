package com.day5.Array;

// 2차원배열 [a][b] 이런식으로 생겨먹음 a는 {}의 갯수   b는 각{} 안에 있는 요소의 갯수 즉
/*
 {ㅁ,ㄴ,ㅇ,ㄹ},
 {ㅁ,ㄴ,ㅇ,ㄹ},
 {ㅁ,ㄴ,ㅇ,ㄹ}

 이런식
*/
public class TwoArray1 {
    public static void main(String[] args) {
        int is[][] = new int[3][4];
        System.out.println(is[0].length); //4
        System.out.println(is[1].length); //4
        System.out.println(is[2].length); //4
        System.out.println(is.length); //3
        is[0] = new int[4];

        for (int x=0;x<is.length;x++){
            for (int y=0;y<is[x].length;y++)
            {
                System.out.println(is[x][y]);
            }
        }

    }
}
