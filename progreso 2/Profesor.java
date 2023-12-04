public class Profesor extends Persona{
    private float ID;
    private String materia;
    private float añosEnseñamnsa;

    public Profesor() {
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public String getLenguaje() {
        return super.getLenguaje();
    }

    public float getID() {
        return ID;
    }

    public void setID(float ID) {
        this.ID = ID;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public float getAñosEnseñamnsa() {
        return añosEnseñamnsa;
    }

    public void setAñosEnseñamnsa(float añosEnseñamnsa) {
        this.añosEnseñamnsa = añosEnseñamnsa;
    }
}
