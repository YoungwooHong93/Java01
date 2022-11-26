package javaStudy;

class MyPoint {
	int x;
	int y;
}

//class Circle extends MyPoint {
//	int r;
//}


class Circle {
	MyPoint p = new MyPoint();
	int r;
}

public class InheritanceTest {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.p.x = 1;
		c.p.y = 2;
		c.r = 3;
		
		
		
		
	}

}
