package fr.esgi.velibs.dto;

import esgi.station_velibs_api.station_velibs_api.dto.VelibStation;

import java.util.List;

public class VelibStationResponse {
    private List<VelibStation> stations;

    public List<VelibStation> getStations() {
        return stations;
    }

    public void setStations(List<VelibStation> stations) {
        this.stations = stations;
    }
}
