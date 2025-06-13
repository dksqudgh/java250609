package com.day5.design;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//RandomGameEvent는 ActionListener구현체 클래스가 되어야 함.
public class RandomGameEvent implements ActionListener {
    RandomGameUI rgui = null; //원본을 사용하므로 복사본을 만들지 않는다.
    //버튼에 접근하려면 RandomGameUI에 대한 인스턴스변수가 필요함
    int count = 0;

    public RandomGameEvent(RandomGameUI rgui){
        //직접 인스턴스화 하는게 아니고 생성자 파라미터를 통해서
        //객체를 주입 받아야 원본을 쥐게 된다. -  내가 모르는 코드가 있어서는 안된다.
        this.rgui = rgui;
    }

    @Override
    public void actionPerformed(ActionEvent e){
        Object obj = e.getSource();
        if(obj == rgui.btnDap){
            rgui.rgl.nanSu();
            rgui.jta.append("정답은 " + rgui.rgl.dap + " 입니다. \n" );
            count = 0;
        }
        else if(obj == rgui.btnNew){
            count = 0;
            rgui.rgl.nanSu();
            System.out.println("새로 채번된 숫자는 "+rgui.rgl.dap);
            rgui.jta.append("NewGame\n");
        }
        else if (obj == rgui.btnClear) {
            rgui.jta.setText("");
        }
        else if(obj == rgui.btnExit){
            System.exit(0);
        }
        else if(obj==rgui.jtf){
            String msg = null;
            System.out.println(rgui.jtf.getText());
            String s = rgui.jtf.getText();
            //파라미터에 문자열을 넣으면 정수로 바꿔주는 메소드가 있다.

            //call bt value , pass by value
            int my = Integer.parseInt(s);
            msg = rgui.rgl.myOut(my);

            rgui.rgl.myOut(my);

            //jta.append(++count+"회차 : "+s);
            //메소드 안에서 리턴타입이 있는 메소드 호출은 합법이다.
            rgui.jta.append(++count+"회차 : "+my+"-"+msg+"\n");
            rgui.jtf.setText("");
        }
    }
}
