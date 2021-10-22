package demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Traingle //implements InitializingBean, DisposableBean
{
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
//	public void afterPropertiesSet() throws Exception {
//		System.out.println("After Properties Setting ");
//	}
//	public void destroy() throws Exception {
//		System.out.println("Destroy ");
//	}
	public void myInit()  {
		System.out.println("After Properties Setting ");
	}
	public void cleanup() {
		System.out.println("Destroy ");
	}
}