import java.util.Scanner;


public class Main {
	
	static Circle c = new Circle ();
	static Triangle t = new Triangle ();
	static Rectangle r = new Rectangle ();
	static Scanner sc = new Scanner (System.in);

	

	public static void main(String[] args) {
		
		
		String inputYes;
		
		
		
		do {
			
			System.out.println("Choose a shape: Press 1 = Circle   2 = Triangle   3 = Rectangle");
			int chooseFigur = sc.nextInt();
			
		
			
			switch (chooseFigur) {
			
			case 1:
				System.out.print("Set the radius: ");
				c.setRadius(sc.nextDouble());
				System.out.println("Which value of the Circle do you want to calculate? Press 1 = DIAMETER   2 = AREA   3 = PERIMETER   4 = ALL");
				int chooseAttributC = sc.nextInt();
				
					if (chooseAttributC == 1) {
						
						System.out.println("Circles DIAMETER =  " + c.diameter());
					}
	
					else if (chooseAttributC == 2) {
						System.out.println("Circles AREA = " + c.area());
					}
	
					else if (chooseAttributC == 3) {
						System.out.println("Circles PERIMETER = " + c.perimeter());
					} 
					
					else if (chooseAttributC == 4) {
						System.out.println("Circles DIAMETER = " + (c.diameter()) + ", AREA = " + c.area()
								+ " and PERIMETER = " + c.perimeter());
				}
				break;
				
				
								
			case 2:
				
				System.out.println("Which value do you want to calculate? Press 1 = AREA    2 = PERIMETER   3 = ALL");
				int chooseAttributT = sc.nextInt();
				
				
				
					if (chooseAttributT == 1) {
						System.out.print("Set the height: ");
						t.setHeight(sc.nextDouble());
						
						System.out.print("Set the base: ");
						t.setBase(sc.nextDouble());
						System.out.println("Triangles AREA = " + t.area());
					}
	
					else if (chooseAttributT == 2) {
						System.out.print("Set side A: ");
						t.setA(sc.nextDouble());
						System.out.print("Set side B: ");
						t.setB(sc.nextDouble());
						System.out.print("Set side C: ");
						t.setC(sc.nextDouble());
						
						System.out.println("Triangles PERIMETER = " + t.perimeter());
					}
	
					else if (chooseAttributT == 3) {
						System.out.print("Set the height: ");
						t.setHeight(sc.nextDouble());
						System.out.print("Set the base: ");
						t.setBase(sc.nextDouble());
						
						System.out.print("Set side A: ");
						t.setA(sc.nextDouble());
						System.out.print("Set side B: ");
						t.setB(sc.nextDouble());
						System.out.print("Set side C: ");
						t.setC(sc.nextDouble());
						
						System.out.println("Triangles AREA = " + t.area() + " and PERIMETER = " + t.perimeter());
					}
				break;
				
				
								
			case 3:
				
				System.out.println("Which value do you want to calculate? Press 1 = AREA    2 = PERIMETER   3 = ALL");
				int chooseAttributR = sc.nextInt();
				
				System.out.print("Set side A: ");
				r.setA(sc.nextDouble());
				System.out.print("Set side B: ");
				r.setB(sc.nextDouble());
				
					if (chooseAttributR == 1) {
						System.out.println("Rectangles AREA = " + r.area());
					}
	
					else if (chooseAttributR == 2) {
						System.out.println("Rectangles PERIMETER = " + r.perimeter());
					}
	
					else if (chooseAttributR == 3) {
						System.out.println("Rectangles AREA = " + r.area() + " and PERIMETER = " + r.perimeter());
					}
				
				break;
				
				

			default:
				System.out.println(
						"There is no shape with that number.");
				break;

			}
			
			sc.nextLine();
			System.out.println("Do you want to continue making calculations? Press y = Yes   n = No");
			inputYes = sc.nextLine();
			System.out.println("");
			System.out.println("*********************************  NEW SHAPE  *********************************");
		} while (inputYes.equals("y"));


		sc.close();
		
		
	}

	

	

}
