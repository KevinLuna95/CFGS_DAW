Algoritmo calculo_salario
	// Este algoritmo calcula el salario de una persona seg�n sus horas trabajadas y coste por hora trabajada
	// Definicion de variables
	Definir numHoras como Entero
	Definir precioPorHora como Real
	Definir salario como Real
	// Bloque de entrada de datos
	Escribir "Introduce el numero de horas trabajadas"
	Leer numHoras
	Escribir "Introduce el precio por hora:"
	Leer precioPorHora
	// Bloque de transformaci�n de datos
	salario <- numHoras * precioPorHora
	Escribir salario
	Escribir "El salario es de : ", salario
FinAlgoritmo
