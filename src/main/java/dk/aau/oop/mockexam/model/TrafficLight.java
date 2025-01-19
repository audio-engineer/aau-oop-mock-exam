package dk.aau.oop.mockexam.model;

import java.time.LocalDate;

public final class TrafficLight extends StreetFurniture {
  private LocalDate lastRevisited;

  public TrafficLight(
      final String id, final GpsPosition gpsPosition, final LocalDate lastRevisited) {
    super(id, gpsPosition);

    this.lastRevisited = lastRevisited;
  }

  public LocalDate getLastRevisited() {
    return lastRevisited;
  }

  public void setLastRevisited(final LocalDate lastRevisited) {
    this.lastRevisited = lastRevisited;
  }

  @Override
  public String toString() {
    return "TrafficLight{id='"
        + getId()
        + "', position="
        + getGpsPosition()
        + ", lastRevisited="
        + lastRevisited
        + "}";
  }
}
