package esgi.station_velibs_api.station_velibs_api.dto;

import java.time.ZonedDateTime;
import java.util.Map;

public class VelibStation {

    private String stationcode;
    private String name;
    private String is_installed;
    private int capacity;
    private int numdocksavailable;
    private int numbikesavailable;
    private int mechanical;
    private int ebike;
    private String is_renting;
    private String is_returning;
    private ZonedDateTime duedate;
    private Map<String, Double> coordonnees_geo;
    private String nom_commune;
    private String code_insee_commune;

    public String getStationcode() {
        return stationcode;
    }

    public void setStationcode(String stationcode) {
        this.stationcode = stationcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIs_installed() {
        return is_installed;
    }

    public void setIs_installed(String is_installed) {
        this.is_installed = is_installed;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getNumdocksavailable() {
        return numdocksavailable;
    }

    public void setNumdocksavailable(int numdocksavailable) {
        this.numdocksavailable = numdocksavailable;
    }

    public int getNumbikesavailable() {
        return numbikesavailable;
    }

    public void setNumbikesavailable(int numbikesavailable) {
        this.numbikesavailable = numbikesavailable;
    }

    public int getMechanical() {
        return mechanical;
    }

    public void setMechanical(int mechanical) {
        this.mechanical = mechanical;
    }

    public int getEbike() {
        return ebike;
    }

    public void setEbike(int ebike) {
        this.ebike = ebike;
    }

    public String getIs_renting() {
        return is_renting;
    }

    public void setIs_renting(String is_renting) {
        this.is_renting = is_renting;
    }

    public String getIs_returning() {
        return is_returning;
    }

    public void setIs_returning(String is_returning) {
        this.is_returning = is_returning;
    }

    public ZonedDateTime getDuedate() {
        return duedate;
    }

    public void setDuedate(ZonedDateTime duedate) {
        this.duedate = duedate;
    }

    public Map<String, Double> getCoordonnees_geo() {
        return coordonnees_geo;
    }

    public void setCoordonnees_geo(Map<String, Double> coordonnees_geo) {
        this.coordonnees_geo = coordonnees_geo;
    }

    public String getNom_commune() {
        return nom_commune;
    }

    public void setNom_commune(String nom_commune) {
        this.nom_commune = nom_commune;
    }

    public String getCode_insee_commune() {
        return code_insee_commune;
    }

    public void setCode_insee_commune(String code_insee_commune) {
        this.code_insee_commune = code_insee_commune;
    }
}
