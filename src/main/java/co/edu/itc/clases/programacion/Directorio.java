package co.edu.itc.clases.programacion;

import java.util.ArrayList;
import java.util.List;

public class Directorio {
    private List<Contacto> contactos = new ArrayList<>();

    public void agregar(Contacto contacto) {
        contactos.add(contacto);
    }

    /**
     * Compara con los campos de los contactos y retorna el primer contacto cuyo atributo coincide
     * con el valor de entrada.
     * @param entrada
     * @return
     */
    public Contacto buscar(String entrada) {
        for(int i = 0; i < contactos.size(); i++) {
            Contacto contactoI = contactos.get(i);

            if(entrada.equals(contactoI.getNombre())
                    || entrada.equals(contactoI.getApellido())
                    || entrada.equals(contactoI.getCorreo())
                    || entrada.equals(contactoI.getTelefono()) ) {
                return contactoI;
            }
        }
        throw new RuntimeException("No existe");
    }

    public List<Contacto> obtenerTodos() {
        return contactos;
    }
}
