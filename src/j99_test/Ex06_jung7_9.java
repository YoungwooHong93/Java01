package j99_test;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// ** 정석기초 연습 7-9
// => 아래의 EventHandler를 익명 클래스 로 변경하시오 (anonymous class) .

class EventHandler extends WindowAdapter {
	public void windowClosing(WindowEvent e) {
		e.getWindow().setVisible(false);
		e.getWindow().dispose();
		System.exit(0);
	} //windowClosing
} //EventHandler

public class Ex06_jung7_9 {

	public static void main(String[] args) {
		Frame f = new Frame();
		//f.addWindowListener(new EventHandler());
		// => 익명클래스(Anonymous class) 로 변경
		f.addWindowListener(new WindowAdapter() {


			public void windowClosing(WindowEvent e) {
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
				System.exit(0);
			} //windowClosing 
		}
				);
	}//main

}//class