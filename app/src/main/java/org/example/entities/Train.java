package org.example.entities;

import java.sql.Time;
import java.util.List;
import java.util.Map;

public class Train {
    public String getTrainId() {
        return trainId;
    }

    public void setTrainId(String trainId) {
        this.trainId = trainId;
    }

    public String getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(String trainNo) {
        this.trainNo = trainNo;
    }

    public Map<String, Time> getStationTimeMap() {
        return stationTimeMap;
    }

    public void setStationTimeMap(Map<String, Time> stationTimeMap) {
        this.stationTimeMap = stationTimeMap;
    }

    public List<List<Integer>> getSeats() {
        return seats;
    }

    public void setSeats(List<List<Integer>> seats) {
        this.seats = seats;
    }

    public List<String> getStations() {
        return stations;
    }

    public void setStations(List<String> stations) {
        this.stations = stations;
    }

    private String trainId;
    private String trainNo;

    private List<List<Integer>> seats;

    private Map<String, Time> stationTimeMap;

    private List<String> stations; // List<String>


    public String getTrainInfo() {
        return trainId + " " + trainNo;
    }
}
