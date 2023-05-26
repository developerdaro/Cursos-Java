package poli;

public class Vehiculo {

    protected String Matricula;
    protected String Marca;
    protected String Modelo;

    public Vehiculo(String Matricula, String Marca, String Modelo) {
        this.Matricula = Matricula;
        this.Marca = Marca;
        this.Modelo = Modelo;
    }

    public String getMatricula() {
        return Matricula;
    }

    public String getMarca() {
        return Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public String mostrarDatos() {
        return "Matricula: " + Matricula + "\nMarca: " + Marca + "\nModelo: " + Modelo;
    }
}
