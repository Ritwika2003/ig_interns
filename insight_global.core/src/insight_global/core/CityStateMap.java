package insight_global.core;

import java.util.*;

//CityStateMap.java
public class CityStateMap extends AbstractCollection<CityStateMapping> {
 private Map<String, CityStateMapping> cityStateMap;

 // Constructor to initialize the map
 public CityStateMap() {
     cityStateMap = new HashMap<>();
 }

 @Override
 public Iterator<CityStateMapping> iterator() {
     return cityStateMap.values().iterator();
 }

 @Override
 public int size() {
     return cityStateMap.size();
 }

 // Add a new city-state pair, replacing if city already exists
 public void addCityState(String city, String state) {
     cityStateMap.put(city, new CityStateMapping(city, state));
 }

 // Get the state of a city
 public String getStateOfCity(String city) {
     CityStateMapping mapping = cityStateMap.get(city);
     return (mapping != null) ? mapping.getState() : null;
 }

 // Get all cities
 public Set<String> getAllCities() {
     return cityStateMap.keySet();
 }

 // Get all states
 public Set<String> getAllStates() {
     Set<String> states = new HashSet<>();
     for (CityStateMapping mapping : cityStateMap.values()) {
         states.add(mapping.getState());
     }
     return states;
 }

 // Get cities for a specific state
 public List<String> getCitiesForState(String state) {
     List<String> cities = new ArrayList<>();
     for (CityStateMapping mapping : cityStateMap.values()) {
         if (mapping.getState().equals(state)) {
             cities.add(mapping.getCity());
         }
     }
     return cities;
 }

 // Delete all cities for a given state
 public void deleteCitiesForState(String state) {
     cityStateMap.values().removeIf(mapping -> mapping.getState().equals(state));
 }
}

