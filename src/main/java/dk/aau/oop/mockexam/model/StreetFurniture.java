package dk.aau.oop.mockexam.model;

public class StreetFurniture {
  private final String id;
  private GpsPosition gpsPosition;

  public StreetFurniture(final String id, final GpsPosition gpsPosition) {
    this.id = id;
    this.gpsPosition = gpsPosition;
  }

  /* default */ final String getId() {
    return id;
  }

  public final GpsPosition getGpsPosition() {
    return gpsPosition;
  }

  public final void setGpsPosition(final GpsPosition gpsPosition) {
    this.gpsPosition = gpsPosition;
  }

  @Override
  public String toString() {
    return "StreetFurniture{id='" + id + "'," + "position=" + gpsPosition + '}';
  }
}
