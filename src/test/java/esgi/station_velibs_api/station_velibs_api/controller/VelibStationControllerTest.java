package esgi.station_velibs_api.station_velibs_api.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class VelibStationControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testGetStationsByTowns_returnsMatchingStations() throws Exception {
        String json = """
                {
                  "towns": ["Nogent-sur-Marne", "Vincennes"]
                }
                """;

        mockMvc.perform(get("/stations/velibs")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.stations.length()").value(3))
                .andExpect(jsonPath("$.stations[0].nom_commune").value("Nogent-sur-Marne"));
    }
}
