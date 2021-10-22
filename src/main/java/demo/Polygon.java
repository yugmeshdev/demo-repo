package demo;

import java.util.List;

import lombok.Data;

@Data
public class Polygon {
	private List<Point> points;
	
	public void draw() {
		for(Point point : points) {
			System.out.println(point);
		}
	}
}
