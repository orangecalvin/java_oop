package ezen.shape;

public class Lectangle extends Shape {
	protected double width, heigth;

	public Lectangle() {}

	public Lectangle(double x, double y, double width, double heigth) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.heigth = heigth;
			
	}



	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeigth() {
		return heigth;
	}

	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}

	@Override
	public void draw() {
		System.out.println(getX() + "," + getY() + " 위치의 폭이" + width + "이고 높이가"+heigth+"인사각형");
	}

	@Override
	public double getLength() {
		return 2 * (width + heigth);
	}
	
	@Override
	public double getArea() {
		return width * heigth;
	}
	
	
	
}
