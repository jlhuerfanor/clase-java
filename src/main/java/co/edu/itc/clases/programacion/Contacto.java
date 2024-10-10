package co.edu.itc.clases.programacion;

public class Contacto {
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;

    public Contacto(
            String nombre,
            String apellido,
            String telefono,
            String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String valor) {
        if(valor == null || valor.isEmpty()) {
            throw new RuntimeException("El valor no puede ser vacio");
        } else {
            nombre = valor;
        }
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String valor) {
        correo = valor;
    }
}
