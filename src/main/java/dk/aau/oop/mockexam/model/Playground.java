package dk.aau.oop.mockexam.model;

public final class Playground extends StreetFurniture {
  private final int maxCapacity;

  public Playground(final String id, final GpsPosition gpsPosition, final int maxCapacity) {
    super(id, gpsPosition);

    this.maxCapacity = maxCapacity;
  }

  public int getMaxCapacity() {
    return maxCapacity;
  }

  @Override
  public String toString() {
    return "Playground{id='"
        + getId()
        + "', position="
        + getGpsPosition()
        + ", maxCapacity="
        + maxCapacity
        + "}";
  }
}
