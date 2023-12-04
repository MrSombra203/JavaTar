//"extendas" es para

public class Alumno extends Persona{
    private float ID;
    private String colegio;
    private String paralelo;

    public Alumno() {
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    public float getID() {
        return ID;
    }

    public void setID(float ID) {
        this.ID = ID;
    }

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    public String getParalelo() {
        return paralelo;
    }

    public void setParalelo(String paralelo) {
        this.paralelo = paralelo;
    }
}
