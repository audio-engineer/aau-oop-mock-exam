package dk.aau.oop.mockexam.model;

import dk.aau.oop.mockexam.exception.PositionConflictException;
import dk.aau.oop.mockexam.observer.TrafficLightListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class CityMap {
  private final Map<GpsPosition, StreetFurniture> streetFurniture;
  private final List<TrafficLightListener> listeners;

  public CityMap() {
    streetFurniture = new HashMap<>(20);
    listeners = new ArrayList<>(20);
  }

  public void addListener(final TrafficLightListener listener) {
    listeners.add(listener);
  }

  public void removeListener(final TrafficLightListener listener) {
    listeners.remove(listener);
  }

  public List<TrafficLightListener> getListeners() {
    return Collections.unmodifiableList(listeners);
  }

  public void addStreetFurniture(final StreetFurniture streetFurniture) {
    final GpsPosition gpsPosition = streetFurniture.getGpsPosition();

    if (this.streetFurniture.containsKey(gpsPosition)) {
      throw new PositionConflictException(
          "Street furniture already exists at position " + gpsPosition);
    }

    this.streetFurniture.put(gpsPosition, streetFurniture);

    if (streetFurniture instanceof TrafficLight) {
      for (final TrafficLightListener listener : listeners) {
        listener.update((TrafficLight) streetFurniture);
      }
    }
  }

  public void removeStreetFurniture(final StreetFurniture streetFurniture) {
    final GpsPosition gpsPosition = streetFurniture.getGpsPosition();

    this.streetFurniture.remove(gpsPosition);
  }

  public StreetFurniture getStreetFurniture(final GpsPosition gpsPosition) {
    return streetFurniture.get(gpsPosition);
  }

  @Override
  public String toString() {
    return "CityMap{" + "streetFurniture=" + streetFurniture + ", listeners=" + listeners + '}';
  }
}
