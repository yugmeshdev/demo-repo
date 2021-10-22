package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component
public class Circle {

	private Point center;
	private double radius;
	public Point getCenter() {
		return center;
	}
	
	@Required
	@Qualifier("pointA")
	public void setCenter(Point center) {
		this.center = center;
	}
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void draw() {
		System.out.println("Cirlce is created at " + center + " with radious " + radius);
	}
}
