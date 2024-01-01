/**
 * Clase que representa un CVE (Common Vulnerabilities and Exposures) y contiene los atributos código de referencia, autor, descripcion y referencias.
 * Código de referencia: código que entre otras cosas, indica el año de descubrimiento de la vulnerabilidad.
 * Autor: persona que descubrió la vulnerabilidad.
 * Descripción: descripción de como se ha descubierto la vulnerabilidad.
 * Referencias: Enlaces de referencia al código donde se demuestra y soluciones al mismo.
 */
public class Cve {
    private String codigoReferencia;
    private String autor;
    private String descripcion;
    private String referencias;

    /**
     * Constructor de la clase Cve.
     * @param codigoReferencia el código de referencia del CVE.
     * @param autor el autor del CVE.
     * @param descripcion la descripción del CVE.
     * @param referencias las referencias del CVE.
     */
    public Cve(String codigoReferencia, String autor, String descripcion, String referencias) {
        this.codigoReferencia = codigoReferencia;
        this.autor = autor;
        this.descripcion = descripcion;
        this.referencias = referencias;
    }
}
