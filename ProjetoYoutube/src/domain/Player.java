package domain;

public class Player {

	public static void main(String[] args) {
		Video v[] = new Video[3];
		v[0] = new Video("Aula 1");
		v[1] = new Video("Aula 2");
		v[2] = new Video("Aula 3");

		Gafanhoto g[] = new Gafanhoto[2];
		g[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
		g[1] = new Gafanhoto("Maria", 22, "F", "bei");

		//System.out.println(v[1].toString());
		//System.out.println(g[0].toString());
		
		Visualizacao vis[] = new Visualizacao[5];
		vis[0] = new Visualizacao(g[0], v[2]); // assistiu aula 1
		vis[0].avaliar();
		System.out.println(vis[0].toString());
		
		
		vis[1] = new Visualizacao(g[0], v[1]); // assistiu aula 2
		vis[0].avaliar(87.0f);
		System.out.println(vis[1].toString());
		
		vis[2] = new Visualizacao(g[1], v[2]);
		vis[2].avaliar(23.4f);
		System.out.println(vis[2].toString());
	}
	
	

}
