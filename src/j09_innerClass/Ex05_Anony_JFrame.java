package j09_innerClass;

import java.awt.Button;

//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import java.awt.event.*;
// import 시에 클래스명 대신 * 을 사용가능

import javax.swing.JFrame;

// ** 익명 클래스의 활용 예
// => 이벤트 리스너를 이용하여 종료버튼 만들기

public class Ex05_Anony_JFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		// ** UI 준비
		Ex05_Anony_JFrame ex05 = new Ex05_Anony_JFrame();
		Button btn = new Button("Stop");	// () 안에는 버튼에 표시될 value(이름) 을 작성함.
		ex05.setSize(300, 300);
		ex05.add(btn);						// 버튼 형태를 만들어줌.
		ex05.setVisible(true);				// 버튼을 보이게 설정함.
		
		// ** 1) 이벤트 리스너에 Inner 클래스 적용
//		ActionListener ac = new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// => Button btn 에서 발생된 이벤트인지 확인후 종료
//				if(e.getActionCommand().equals("Stop")) System.exit(0);
//			} //actionPerformed
//		}; //문장의 끝에는 ; 붙임
//		btn.addActionListener(ac);
		
		// ** 2) 매개변수 위치에 익명 클래스를 직접 장성
		// => 많이 사용 됨
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// => Button btn 에서 발생된 이벤트인지 확인후 종료
				if(e.getActionCommand().equals("Stop")) System.exit(0);
			} //actionPerformed
		});

	} //main

} //class
