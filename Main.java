import com.generation.classes.Cuadrado;
import com.generation.classes.FiguraGeometrica;
import com.generation.classes.Rectangulo;
import com.generation.classes.Rombo;
import com.generation.classes.Romboide;
import com.generation.classes.Trapecio;
import com.generation.classes.Triangulo;

public class Main {

	public static void main(String[] args) {
		Triangulo t1 = new Triangulo("Bermudas",20,10,15);
		//puedo cambiar esto para que solo tome un solo dato 
		Cuadrado c1 = new Cuadrado("Cuadrado Min",5,5,5);
		
		Rectangulo Rec1 = new Rectangulo("Rectangulo Min",5,10,5);
		Rombo Rom1 = new Rombo("Rombo Min",5,10,2);
		Romboide Romb2 = new Romboide("Romboide Min",5,5,5);
		Trapecio trap1 = new Trapecio("Trapecio Min",7,10,6,8.5);
		
		Main.imprmirCalculos(t1);
		Main.imprmirCalculos(c1);
		Main.imprmirCalculos(Rec1);
		Main.imprmirCalculos(Rom1);
		Main.imprmirCalculos(Romb2);
		Main.imprmirCalculos(trap1);

	}//main
	public static void imprmirCalculos(FiguraGeometrica t) {
		System.out.println(t);
		System.out.println("+-----------------------------------------+");
		System.out.println("| El area de ["+t.getNombre()
				+ "]");
		System.out.println("| es" + t.calcularArea());
		System.out.println("| El perimetro de ["+t.getNombre()
				+ "]");
		System.out.println("| es" + t.calcularPerimetro());
		System.out.println("+-----------------------------------------+");
	}

}//class main
