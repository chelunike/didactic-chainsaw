
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
     * Devuelve la dirección IP del reto.
     * @return la dirección IP del reto.
     */
    public String getIp() {
        return ip;
    }

    /**
     * Establece la dirección IP del reto.
     * @param ip la dirección IP del reto.
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * Devuelve el puerto del reto.
     * @return el puerto del reto.
     */
    public int getPuerto() {
        return puerto;
    }

    /**
     * Establece el puerto del reto.
     * @param puerto el puerto del reto.
     */
    public void setPuerto(int puerto) {
        this.puerto = puerto;
    }

    /**
     * Devuelve el sistema operativo del reto.
     * @return el sistema operativo del reto.
     */
    public String getSo() {
        return so;
    }

    /**
     * Establece el sistema operativo del reto.
     * @param so el sistema operativo del reto.
     */
    public void setSo(String so) {
        this.so = so;
    }

    /**
     * Devuelve la versión del reto.
     * @return la versión del reto.
     */
    public String getVersion() {
        return version;
    }

    /**
     * Establece la versión del reto.
     * @param version la versión del reto.
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * Devuelve la flag del reto.
     * @return la flag del reto.
     */
    public String getFlag() {
        return flag;
    }

    /**
     * Establece la flag del reto.
     * @param flag la flag del reto.
     */
    public void setFlag(String flag) {
        this.flag = flag;
    }
}
