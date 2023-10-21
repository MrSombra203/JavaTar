public class EjemplosAutos {
    public static void main(String[] args){

        Autos toyota = new Autos("toyota", "agya", "verde", 3.5);
        /*toyota.setMarca("toyota");
        toyota.setModelo("agya");
        toyota.setColor("verde");
        toyota.setCilindraje(3.5);*/

        Autos kia = new Autos("kia", "rio", "naranja", 5.6);
        /*kia.setMarca("kia");
        kia.setModelo("rio");
        kia.setColor("naranja");
        kia.setCilindraje(5.6);*/

        Autos bmw = new Autos("bmw", "bmw x6", "negro", 6.0);
        /*bmw.setMarca("bmw");
        bmw.setModelo("bmw x6");
        bmw.setColor("negro");
        bmw.setCilindraje(6.0);*/

        Autos ferrari = new Autos("ferrari", "ferrari 812 gts", "gris", 7.0);
        /*ferrari.setMarca("ferrari");
        ferrari.setModelo("ferrari 812 gts");
        ferrari.setColor("gris");
        ferrari.setCilindraje(7.0);*/

        System.out.println(toyota.detalles());
        System.out.println(kia.detalles());
        System.out.println(bmw.detalles());
        System.out.println(ferrari.detalles());
        System.out.println(toyota.aceleracion(6000));
        System.out.println(kia.aceleracion(6000));
        System.out.println(bmw.aceleracion(6000));
        System.out.println(ferrari.aceleracion(6000));
        System.out.println(toyota.frenar());
        System.out.println(kia.frenar());
        System.out.println(bmw.frenar());
        System.out.println(ferrari.frenar());

        toyota.detalles();
        kia.detalles();
        bmw.detalles();
        ferrari.detalles();

        System.out.println(toyota.consumoCombustible(60.0f, 23.0f));
        System.out.println(toyota.consumoCombustible(60.0f, 23.0f));

    }
}
