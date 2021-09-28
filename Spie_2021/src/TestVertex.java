
public class TestVertex {

	public static void main(String[] args) {
		
		Vertex v1=new Vertex(17, 4);
		Vertex maus=new Vertex(24, 0);
		Vertex v3=v1.skalarMult(42.2);
		Vertex katze=new Vertex(1,1);
		Vertex elefant=katze.add(maus);
		
		System.out.println(katze);
		
		
		katze.addMod(maus);
		System.out.println(katze);
		System.out.println(elefant);

	}

}
