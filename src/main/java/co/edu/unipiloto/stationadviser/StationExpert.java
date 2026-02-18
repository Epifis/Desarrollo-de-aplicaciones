package co.edu.unipiloto.stationadviser;

import java.util.ArrayList;
import java.util.List;

public class StationExpert {
    public List<String> getEstaciones(String zone) {
        List<String> estaciones = new ArrayList<>();

        switch (zone) {
            case "Pacífica":
                estaciones.add("EDS BISERTA.BUGA");
                estaciones.add("EDS EL TRIUNFO.CALI");
                estaciones.add("EDS TULUA.TULUA");
                break;
            case "Orinoquía":
                estaciones.add("EDS GNCV MÓBIL LA LLANERITA.VILLAVICENCIO");
                estaciones.add("EDS YOPAL.YOPAL");
                break;
            case "Andina":
                estaciones.add("EDS GNV TERPEL EL PUENTE. BUCARAMANGA");
                estaciones.add("EDS GAZEL TERPEL MAYORA. MEDELLIN");
                estaciones.add("EDS GAZEL TEXACO 22 HEROES. BOGOTÁ");
                break;
            case "Caribe":
                estaciones.add("EDS COUNTRY MOTORS. BARRANQUILLA");
                estaciones.add("ESTACIÓN DE COMBUSTIBLES DE SAN BUENAVENTURA LTDA, CARTAGENA");
                estaciones.add("GASOLINERÍA DEL CARIBE LTDA. BARRANQUILLA");
                break;
            case "Amazonía":
                estaciones.add("EDS MILENIUM GAS CUNDUY.FLORENCIA");
                estaciones.add("EDS MILENIUM GAS CUNDUY.FLORENCIA");
                estaciones.add("EDS MILENIUM GAS CUNDUY.FLORENCIA");
                break;
        }

        return estaciones;
    }
}
