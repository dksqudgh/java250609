package com.network;

import javax.swing.*;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class TimeClient extends Thread{
    Socket socket = null;
    ObjectOutputStream oos = null;
    ObjectInputStream ois = null;
    JLabel jlb_timer = null;
    public TimeClient(JLabel jlb_timer){
        this.jlb_timer = jlb_timer;
    }
    @Override
    public void run() {
        //서버로 부터 읽어온 시간 정보 담기
        String timeMsg = null;
        try{
            socket = new Socket("127.0.0.1",3000);
            oos = new ObjectOutputStream(socket.getOutputStream());
            ois = new ObjectInputStream(socket.getInputStream());
            while (true){
                try {
                    while ((timeMsg = (String)ois.readObject()) != null){
                        System.out.println(timeMsg);
                        jlb_timer.setText(timeMsg);
                    }
                    sleep(1000);
                }catch (Exception e){
                    System.out.println(e.toString());
                }
            }
        }catch (Exception e){
            System.out.println("서버에 접속할 수 없습니다");
        }finally {
            try {
                if (oos != null){
                    oos.close();
                }
                if (ois != null){
                    ois.close();
                }
                if (socket != null){
                    socket.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        //TimeClient timeClient = new TimeClient();
        // timeClient.start();
    }
}
