package esgi.station_velibs_api.station_velibs_api.controller;

import esgi.station_velibs_api.station_velibs_api.dto.VelibStationRequest;
import esgi.station_velibs_api.station_velibs_api.service.VelibStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stations/velibs")
public class VelibStationController {

    @Autowired
    private VelibStationService velibStationService;

    @GetMapping
    public fr.esgi.velibs.dto.VelibStationResponse getStationsByTowns(@RequestBody VelibStationRequest request) {
        fr.esgi.velibs.dto.VelibStationResponse response = new fr.esgi.velibs.dto.VelibStationResponse();
        response.setStations(velibStationService.getStationsByTowns(request.getTowns()));
        return response;
    }
}