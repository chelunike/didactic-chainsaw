
/**
 * Clase que representa un objeto reto con dirección IP, puerto, sistema operativo, versión y flag.
 * La dirección IP almacena la dirección de la máquina objetivo donde debemos acceder.
 * El puerto almacena el puerto por el cual se accederá a la máquina objetivo.
 * El sistema operativo guarda el tipo de sistema operativo que contiene la máquina objetivo.
 * La versión almacena la versión del sistema operativo de la máquina objetivo.
 * La flag es un campo de texto que representa el objetivo del reto CTF.
 */
public class Reto {
    private String ip;
    private int puerto;
    private String so;
    private String version;
    private String flag;

    /**
     * Constructor de la clase Reto.
     * @param ip la dirección IP del reto.
     * @param puerto el puerto del reto.
     * @param so el sistema operativo del reto.
     * @param version la versión del reto.
     * @param flag la flag del reto.
     */
    public Reto(String ip, int puerto, String so, String version, String flag) {
        this.ip = ip;
        this.puerto = puerto;
        this.so = so;
        this.version = version;
        this.flag = flag;
    }

    /**
     * Método que, dada la información de un reto, devuelve el CVE o CVEs que son aplicables a dicho reto.
     * @return el CVE o CVEs que son aplicables a dicho reto.
     */
    public Vector<CVE> BuscadorCves() {
        // TODO - implement Reto.BuscadorCves
        throw new UnsupportedOperationException();
    }
}
