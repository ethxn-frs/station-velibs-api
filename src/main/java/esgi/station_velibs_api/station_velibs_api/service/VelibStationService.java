package esgi.station_velibs_api.station_velibs_api.service;

import esgi.station_velibs_api.station_velibs_api.dto.VelibStation;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;

@Service
public class VelibStationService {

    public List<VelibStation> getStationsByTowns(List<String> towns) {
        List<VelibStation> allStations = List.of(
                createStation("41303", "Gare de Nogent-le-Perreux", "Nogent-sur-Marne"),
                createStation("41302", "Charles de Gaulle - Beauté", "Nogent-sur-Marne"),
                createStation("41301", "Bois de Vincennes - Gare", "Vincennes")
        );

        return allStations.stream()
                .filter(station -> towns.contains(station.getNom_commune()))
                .toList();
    }

    private VelibStation createStation(String code, String name, String town) {
        VelibStation station = new VelibStation();
        station.setStationcode(code);
        station.setName(name);
        station.setNom_commune(town);
        station.setIs_installed("OUI");
        station.setCapacity(0);
        station.setNumdocksavailable(10);
        station.setNumbikesavailable(20);
        station.setMechanical(5);
        station.setEbike(15);
        station.setIs_renting("OUI");
        station.setIs_returning("OUI");
        station.setDuedate(ZonedDateTime.now());
        station.setCoordonnees_geo(Map.of("lon", 2.4, "lat", 48.8));
        station.setCode_insee_commune("94000");
        return station;
    }
}
