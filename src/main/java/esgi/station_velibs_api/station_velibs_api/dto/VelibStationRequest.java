package esgi.station_velibs_api.station_velibs_api.dto;

import java.util.List;

public class VelibStationRequest {
    
    private List<String> towns;

    public List<String> getTowns() {
        return towns;
    }

    public void setTowns(List<String> towns) {
        this.towns = towns;
    }
}
