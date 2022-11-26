package j99_test;

// ** 정석 연습문제 7-4 p.285
// ** MyTv 클래스 만들기
// => 멤버변수 isPowerOn_boolean, channel_int, volume_int
//	  를 클래스 외부에서 접근할 수 없도록 제어자를 붙이고, -> private
//	  대신 이 멤버변수들의 값을 어디서나 읽고 변경할 수 있도록
//	  getter setter 메서드를 추가하라. -> public getter setter
// => channel 과 volume 의 범위를 아래 상수 범위로 제한하도록 작성한다.

// ** 정석 기초 연습 7-5 p.286
// => MyTv 클래스에 이전채널(previous channel)로 이동하는
//	 기능의 메서드를 추가해서 아래 실행결과와 같은 결과를 얻도록 하시오.
// => [Hint] 이전 채널의 값을 저장할 멤버변수를 정의하라.

// => 메서드명 : gotoPrevChannel
//	  기 능   : 현재 채널을 이전 채널로 변경한다.
//	  반환타입 : 없음
//	  매개변수 : 없음

class MyTv {
	private boolean isPowerOn;
	private int channel;
	private int volume;

// -> 변수명의 2번째 알파벳이 대문자인 경우엔
//	  자동완성 방법이 다른 경우 혼동이 일어날수 있어 대부분 사용하지 않는다. 
//	  private int tEst;
//	  public int gettEst() {return tEstl} -> 이클립스에서 자동완성한 코드의 예

	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;

// ** 정석 기초 연습 7-5 구현
// => 이전 채널의 값을 저장할 멤버변수를 정의
// => gotoPrevChannel 메서드 작성
	
	private int prevChannel;
	public void gotoPrevChannel() {
		setChannel(prevChannel); 
	}
// => 채널이 변경될 때 현재 채널의 값을 prevChannel에 보관하기
//	  setChannel 에서 처리하는것이 적합함.
	
	public boolean getIsPowerOn () {
		return this.isPowerOn;
	}

	public void setIsPowerOn (boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		if (channel > MAX_CHANNEL || channel < MIN_CHANNEL) {
			System.out.println("** channel 이 범위를 초과했습니다. **");
		} else {
			prevChannel = this.channel;
			// 채널이 변경되기전에 현재 채널의 값을 prevChannel 에 보관
			this.channel = channel;
		} // if

	} //setChannel

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		if (volume > MAX_VOLUME || volume < MIN_VOLUME) {
			System.out.println("** volume 이 범위를 초과했습니다. **");
			return;
		}
		this.volume = volume;
	} //setVolume

} //MyTv



public class Ex04_jung7_4 {

	public static void main(String[] args) {
		MyTv tv = new MyTv();
		tv.setChannel(10);
		System.out.println("CH : "+tv.getChannel());
		tv.setVolume(20);
		System.out.println("Vol : "+tv.getVolume());

		// 오류 Test
		tv.setChannel(110);
		tv.setVolume(200);
		
		// ** 정석 기초 연습 7-5 Test
		tv.setChannel(10);
		System.out.println("CH : "+ tv.getChannel()); // 10
		tv.setChannel(20);
		System.out.println("CH : "+ tv.getChannel()); // 20, prev = 10 보관
		tv.gotoPrevChannel();	// prev에 보관된 10 -> channel 로 set (동시에 prev = 이전 값(20))
		System.out.println("CH : "+ tv.getChannel()); // 10
		tv.gotoPrevChannel();
		System.out.println("CH : "+ tv.getChannel()); // 20

	}

}
