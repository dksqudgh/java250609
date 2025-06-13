package com.day5.design;
//클래스 사이의 관계를 static으로 처리하지 않고
//생성자로 처리하는 방법
import java.util.Random;

public class RandomGameLogic {
    int dap;
    RandomGameUI rgui = null;
    RandomGameUI randomGameUI = null; //원본을 사용하므로 복사본을 만들지 않는다.
    //버튼에 접근하려면 RandomGameUI에 대한 인스턴스변수가 필요함

    public RandomGameLogic(RandomGameUI rgui){
        this.rgui = rgui;
    }
    public void nanSu(){
        System.out.println("채번 메서드 호출");
        //정답채번하기- 초기화
        Random rand = new Random();
        dap =  rand.nextInt(10);
    }
    //front와 Back 만나는 부분
    //dap은 전변으로 my는 지변으로 하였음
    public String myOut(int my){
        String msg = null;
        //정답인 경우
        if(dap == my){
            msg = "축하합니다. 정답입니다.";//초기화
            //System.exit(0);//JVM연결고리 강제로 끊어낸다.
        }else if(dap> my){
            msg = "높여라";
        }else if(dap < my){
            msg = "낮춰라";
        }

        return msg;
    }
}

