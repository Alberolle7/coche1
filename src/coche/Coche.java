package coche;



class Coche {
	Integer cilindrada;
	String color;
	Double precio;
	boolean isArrancado;
	
	 static void main (String args[]) {
			Coche c;
			c = new Coche();
			c.cilindrada= 1800;
			c.color = "plata";
			c.precio = 25000.0;
			System.out.println ("�Qu� coche es este?");
			c.verCoche();
			System.out.println("Vamos a arrancar el coche");
			c.arrancar();
			System.out.println ("�Qu� coche es este?");
			c.verCoche();
			System.out.println("Vamos a arrancar el coche");
			c.arrancar();
			}

	 void arrancar() {
		if (isArrancado != true) {
			isArrancado = true;
			System.out.println("���Brrrrrrr!!! El coche acaba de arrancar.");
		} else {
			System.out.println("���Kisch, kishch!!! El coche ya est� arrancado.");
		}
	}

	public void verCoche() {
		System.out.println("Este coche es de color " + color + " tiene una cilindrada de " + cilindrada + " y cuesta "
				+ precio + " euros.");
		if (isArrancado == true) {
			System.out.println("Ahora mismo est� arrancado.");
		} else {
			System.out.println("Ahora mismo est� parado.");
		}
	}

}

