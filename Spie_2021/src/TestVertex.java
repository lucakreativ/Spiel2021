
public class TestVertex {

	public static void main(String[] args) {
		
		Vertex v1=new Vertex(17, 4);
		Vertex v2=new Vertex(24, 0);
		Vertex v3=new Vertex(0, 0);
		
		
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v3.y+v2.x+v1.x);
		System.out.println(v3.y+(v2.x+v1.x));

	}

}
