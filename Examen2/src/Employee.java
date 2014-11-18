/**
 * Una clase que crear un empleado por instancia de los cual guarda el nombre del empleado y el salario que percibe
 * 
 * @author Amine Merimi
 * @version Primera versión
 */
public class Employee {
	private String myName;
	private double mySalary;
	/**
	 * Constructor que coge dos parámetros nombre(String) y salario(double).
	 * Con cada llamada al constructor se crea un nuevo empleado que sería una instancia de la clase Employee.
	 * @param name Un string que contiene el nombre del empleado.
	 * @param salary Un double que contiene el salario que cobra dicho empleado.
	 */
	public Employee(String name, double salary) {
		myName = name;
		mySalary = salary;
	}
	/**
	 * Método getName() devuelve el nombre del empleado.
	 * @return myName <b>String</b> con el nombre del empleado. 
	 */
	public String getName() {
		return myName;
	}
	/**
	 * Método getSalary() devuelve el salario del empleado.
	 * @return mySalary <b>double</b> con el salario que cobra el empleado
	 */
	public double getSalary() {
		return mySalary;
	}
	/**
	 * Método que sube el salario el tanto por ciento que recibe por parámetro
	 * Este método devuelve void
	 * @param percent int que indica el porcentaje de subida de salario que queremos aplicar al empleado.
	 */
	public void raiseSalary(int percent) {
		mySalary = mySalary + percent * 0.01 * mySalary;
	}
	/**
	 * Método que asigna lo que recibe por parámetro como el nuevo salario del empleado
	 * Este método devuelve void
	 * @param salary double indica el nuevo salario que será asignado al empleado.
	 */
	public void setSalary(double salary) {
		mySalary = salary;
	}
	public void setName(String name) {
		myName = name;
	}
	
	/**
	 * Metodo que devuelve la cadena "Name: (nombre empleado), Salary: (Salario actual del empleado)
	 * @return Cadena <b>String</b> donde tenemos el nombre y el salario actual del empleado.
	 */
	public String toString() {
		return "Name: " + getName() + ", Salary: " + getSalary();
	}
}
