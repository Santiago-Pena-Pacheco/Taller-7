package santiago.interfazgrafica;

import java.util.ArrayList;

public class Registros {

    ArrayList<Envio> envios;

    public Registros() {
        this.envios = new ArrayList<>();
    }

    public void agregarEnvio(Envio envio) {
        this.envios.add(envio);
    }

    public ArrayList<Envio> obtenerEnvios() {
        return this.envios;
    }
}
