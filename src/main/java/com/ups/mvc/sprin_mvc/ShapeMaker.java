package com.ups.mvc.sprin_mvc;

public class ShapeMaker {
	private Shape circle;
	private Shape rectangle;
	private Shape square;

	public Shape getCircle() {
		return circle;
	}

	public void setCircle(Shape circle) {
		this.circle = circle;
	}

	public Shape getRectangle() {
		return rectangle;
	}

	public void setRectangle(Shape rectangle) {
		this.rectangle = rectangle;
	}

	public Shape getSquare() {
		return square;
	}

	public void setSquare(Shape square) {
		this.square = square;
	}

	public void drawCircle() {
		circle.draw();
	}

	public void drawRectangle() {
		rectangle.draw();
	}

	public void drawSquare() {
		square.draw();
	}
}