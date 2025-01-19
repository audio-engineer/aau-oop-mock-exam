package dk.aau.oop.mockexam.model;

import java.util.Objects;

public final class GpsPosition {
  private final double coordinateX;
  private final double coordinateY;

  public GpsPosition(final double coordinateX, final double coordinateY) {
    this.coordinateX = coordinateX;
    this.coordinateY = coordinateY;
  }

  public double getCoordinateX() {
    return coordinateX;
  }

  public double getCoordinateY() {
    return coordinateY;
  }

  @Override
  public boolean equals(final Object obj) {
    if (this == obj) {
      return true;
    }

    if (!(obj instanceof final GpsPosition other)) {
      return false;
    }

    return 0 == Double.compare(other.coordinateX, coordinateX)
        && 0 == Double.compare(other.coordinateY, coordinateY);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coordinateX, coordinateY);
  }

  @Override
  public String toString() {
    return "GpsPosition{" + "x=" + coordinateX + ", y=" + coordinateY + '}';
  }
}
