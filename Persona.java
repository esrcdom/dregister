package persona;

abstract class Persona {
    protected int edad;
    protected String sexo;

    public Persona() {
    }

    public Persona(int edad, String sexo) {
        this.edad = edad;
        this.sexo = sexo;
    }
    
    abstract int getEdad();

    abstract void setEdad(int edad);

    abstract String getSexo();

    abstract void setSexo(String sexo);    
}
