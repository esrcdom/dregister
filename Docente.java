package persona;

public class Docente extends Persona {

    public Docente() {
    }

    public Docente(int edad, String sexo) {
        super(edad, sexo);
    }
    
    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String getSexo() {
        return sexo;
    }

    @Override
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
