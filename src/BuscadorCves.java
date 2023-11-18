/**
 * Clase que enlaza los Retos y los Cves para procesar la información almacenada en ellos.
 * retos: Vector de Retos.
 * cves: Vector de Cves.
 */
public class BuscadorCves {
    private Vector<Reto> retos;
    private Vector<Cve> cves;

    /**
     * Constructor por defecto que inicializa los vectores de Retos y Cves.
     */
    public BuscadorCves() {
        retos = new Vector<>();
        cves = new Vector<>();
    }

    /**
     * Constructor por parámetros que inicializa los vectores de Retos y Cves.
     * @param retos the vector of Retos.
     * @param cves the vector of Cves.
     */
    public BuscadorCves(Vector<Reto> retos, Vector<Cve> cves) {
        this.retos = retos;
        this.cves = cves;
    }
}
