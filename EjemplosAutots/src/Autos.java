public class Autos {
    private String marca;
    private String modelo;
    private String color = "Rojo";
    private Double cilindraje;

    /*public String getMarca (){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getModelo (){
        return this.modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getColor (){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public  Double getCilindraje (){
        return this.cilindraje;
    }
    public void setCilindraje(double cilindraje){
        this.cilindraje = cilindraje;
    }*/

    public Autos(String marca, String modelo, String color, Double cilindraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.cilindraje = cilindraje;
    }

    public  String detalles(){
        String auto
                = "auto.marca: " + this.marca +
                "\n auto.modelo: " +  this.modelo +
                "\n auto.color: " + this.color +
                "\n auto.cilindraje: " + this.cilindraje;
        return auto;
    }

    public String aceleracion(int rpm){

        return "El auto " + this.marca + "\tacelera a " + rpm + "\trpm";
    }

    public String frenar(){
        return "El auto " + this.marca + " esta frenado";
    }

    public float consumoCombustible(float km, float captan){
        return km / captan;
    }

    public double consumoCombustible(int km, int captan){
        return km / captan;
    }

}
