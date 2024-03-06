package cuentas;



/**
 * <p>Esta clase simula una cuenta bancaria y permite realizar varias operaciones con ella, como 
 * ingresar, retirar o comprobar su estado.</p>
 * 
 * <p>Incluye datos de la cuenta, como el nombre del titular, el nombre o número de la cuenta,
 * el saldo, y el tipo de interés</p>
 * 
 * 
 * @author Ivan de la Cruz
 * @version 1.0
 */
public class CCuenta {

	/**
	 * <p>Dispone de 4 atributos que han sido encapsulados para restringir su acceso desde fuera</p>
	 * 
	 */
	private String nombre;
	private String cuenta;
	private double saldo;
	private double tipoInterés;
	
	/**
	 * Constructor por defecto de la cuenta, que inicia los atributos con los valores predeterminados
	 */
	
	public CCuenta() {
	}
	
	
	/**
	 * Constructor con parámetros de la cuenta, que inicia con valores asigandos.
	 * 
	 * @param nom nombre del titular de la cuenta
	 * @param cue nombre o número de la cuenta
	 * @param sal saldo de la cuenta
	 * @param tipo tipo de interés de la cuenta
	 */
	
	public CCuenta(String nom, String cue, double sal, double tipo) {
		setNombre(nom);
		setCuenta(cue);
		setSaldo(sal);
	}
	
	/**
	 * Método que devuelve el saldo de la cuenta
	 * 
	 * @return el saldo actual de la cuenta
	 */
	
	public double estado() {
		return getSaldo();
	}
	
	/**
	 * Método para realizar un ingres en la cuenta
	 * 
	 * <p>Suma la cantidad ingresada al saldo de la cuenta</p>
	 * 
	 * 
	 * @param cantidad el importe que se ingresa en la cuenta
	 * @throws Exception excepción si se intenta ingresar una cantidad negativa
	 */
	
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		setSaldo(getSaldo() + cantidad);
	}
	
	/**
	 * Método para retirar saldo de la cuenta
	 * 
	 * <p>Resta la cantidad indicada al saldo de la cuenta</p>
	 * 
	 * 
	 * @param cantidad el importe que se retira de la cuenta
	 * @throws Exception excepción que trata los casos de intentar retirar una cantidad negativa o
	 * si no hay suficiente saldo.
	 */
	
	public void retirar(double cantidad) throws Exception {
		if (cantidad <= 0)
			throw new Exception("No se puede retirar una cantidad negativa");
		if (estado() < cantidad)
			throw new Exception("No se hay suficiente saldo");
		setSaldo(getSaldo() - cantidad);
	}
	
	/**
	 * Getters y Setters de los atributos
	 * 
	 * <p>A partir de aquí constan los métodos get y set de cada atributo. Han sido creados para
	 * la encapsulación. Asignan o devuelven los valores de cada atributo.
	 * 
	 * 
	 * @return en los métodos get, devuelve el valor del atributo
	 */
	
	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getCuenta() {
		return cuenta;
	}

	protected void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	protected double getSaldo() {
		return saldo;
	}

	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	protected double getTipoInterés() {
		return tipoInterés;
	}

	protected void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
}
