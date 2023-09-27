package dataTypes;

public class DatosPrimitivos {
	public static void main(String[] args) {
		/*
		 * Datos primitivos. Datos fundamentales en Java que sirven para gestionar los tipos de información más básicos
		 * Existen 8 tipos de datos primitivos: byte, short, int, long, float, double, boolean, char
		 */
		//byte. Vmin y VMax
		byte minByte = Byte.MIN_VALUE;
		byte maxByte = Byte.MAX_VALUE;
		System.out.println("El valor mínimo de Byte es: " + minByte);
		System.out.println("El valor máximo de Byte es: " + maxByte);
		
		//short. Vmin y VMax
		short minShort = Short.MIN_VALUE;
		short maxShort = Short.MAX_VALUE;
		System.out.println("El valor mínimo de Short es: " + minShort);
		System.out.println("El valor máximo de Short es: " + maxShort);
		
		//int. Vmin y VMax
		int minInt = Integer.MIN_VALUE;
		int maxInt = Integer.MAX_VALUE;
		System.out.println("El valor mínimo de un int es: " + minInt);
		System.out.println("El valor máximo de un int es: " + maxInt);
		
		//long. Vmin y VMax
		long minLong = Long.MIN_VALUE;
		long maxLong = Long.MAX_VALUE;
		System.out.println("El valor mínimo de un long es: " + minLong);
		System.out.println("El valor máximo de un long es: " + maxLong);
		
		//float. Vmin y VMax
		float minFloat = Float.MIN_VALUE;
		float maxFLoat = Float.MAX_VALUE;
		System.out.println("El valor mínimo de un float es: " + minFloat);
		System.out.println("El valor máximo de un float es: " + maxFLoat);
		
		//double. Vmin y VMax
		double minDouble = Double.MIN_VALUE;
		double maxDouble = Double.MAX_VALUE;
		System.out.println("El valor mínimo de un double es: " + minDouble);
		System.out.println("El valor máximo de un double es: " + maxDouble);
		
		//char. Vmin y VMax
		char minChar = Character.MIN_VALUE;
		char maxChar = Character.MAX_VALUE;
		System.out.println("El valor mínimo de Character es: " + minChar);
		System.out.println("El valor máximo de Character es: " + maxChar);
		
		//long
		long isbn = 9788499169019L;
		System.out.println(isbn);
		
		//float
		float salary = 15000f;
		System.out.println(salary);
		
		//double
		double ISR = 1239.45d;
		System.out.println(ISR);
		
		char valorChar1 = 64;
		char valorChar2 = 60;
		System.out.println(valorChar1);
		System.out.println(valorChar2);
		
		char aChiquita;
		aChiquita = 166;
		System.out.println(aChiquita);
		
		/*Casteo ( Conversión de tipos en Java).
		* -- Automático (dato más pequeño a un dato más grande)
		* -- Manual (tipo de dato más grande a tipo de dato más pequeño)
		*/
		
		int myNumber = 125;
		System.out.println(myNumber);
		//int < double
		double myCasting = myNumber;
		System.out.println(myCasting);
		
		short edad = 25;
		int valorEdad = edad;
		System.out.println(edad);
		System.out.println(valorEdad);
		
		//-- Manual
		int myNewCasting = (int) myCasting;
		System.out.println(myNewCasting);
		
		//Convertir de float a int
		float myFloat = 1.99f;
		System.out.println(myFloat);
		//Conversión
		int myNewFloat = (int) myFloat;
		System.out.println(myNewFloat);
		
		//Convertir de char a int
		char myChar = 'M';
		int myNewChar = myChar;
		System.out.println(myNewChar);
				
	}
}
