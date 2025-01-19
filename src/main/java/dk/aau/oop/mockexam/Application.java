package dk.aau.oop.mockexam;

import dk.aau.oop.mockexam.model.CityMap;
import dk.aau.oop.mockexam.model.GpsPosition;
import dk.aau.oop.mockexam.model.Playground;
import dk.aau.oop.mockexam.model.StreetFurniture;
import dk.aau.oop.mockexam.model.TrafficDepartment;
import dk.aau.oop.mockexam.model.TrafficLight;
import java.time.LocalDate;
import java.util.Set;

@SuppressWarnings("PMD.UseUtilityClass")
final class Application {
  private Application() {
    //
  }

  @SuppressWarnings("OverlyLongMethod")
  public static void main(final String[] args) {
    // Exercise 1
    System.out.println("Exercise 1");
    final GpsPosition pos1 = new GpsPosition(55.676_098, 12.568_337);
    final GpsPosition pos2 = new GpsPosition(55.676_098, 12.568_337);
    final boolean equals = pos1.equals(pos2);
    System.out.println(equals);

    final StreetFurniture bench =
        new StreetFurniture("SF001", new GpsPosition(55.676_098, 12.568_337));
    final GpsPosition pos = bench.getGpsPosition();
    System.out.println(bench);
    System.out.println(pos);

    bench.setGpsPosition(new GpsPosition(55.676_100, 12.568_340));
    System.out.println(bench);

    System.out.println();

    // Exercise 2
    System.out.println("Exercise 2");
    final Playground pg = new Playground("PG123", new GpsPosition(12.34, 56.78), 30);
    System.out.println(pg);

    final LocalDate lastRevisited = LocalDate.of(2024, 1, 15);
    final TrafficLight tl = new TrafficLight("TL456", new GpsPosition(90.12, 34.56), lastRevisited);
    System.out.println(tl);

    System.out.println();

    // Exercise 3
    System.out.println("Exercise 3");
    final CityMap cityMap = new CityMap();

    final GpsPosition pos3 = new GpsPosition(12.34, 56.78);
    final StreetFurniture playground = new Playground("PG123", pos3, 30);
    cityMap.addStreetFurniture(playground);

    final GpsPosition pos4 = new GpsPosition(90.12, 34.56);
    final StreetFurniture trafficLight = new TrafficLight("TL456", pos4, lastRevisited);
    cityMap.addStreetFurniture(trafficLight);

    final StreetFurniture foundFurniture = cityMap.getStreetFurniture(pos3);
    System.out.println(foundFurniture);

    cityMap.removeStreetFurniture(playground);
    final StreetFurniture streetFurniture = cityMap.getStreetFurniture(pos3);
    System.out.println(streetFurniture);

    System.out.println();

    // Exercise 4
    System.out.println("Exercise 4");

    final CityMap cityMap2 = new CityMap();
    final TrafficDepartment trafficDepartment = new TrafficDepartment();

    cityMap2.addListener(trafficDepartment);

    final GpsPosition pos5 = new GpsPosition(12.34, 56.78);
    final TrafficLight trafficLight1 = new TrafficLight("TL456", pos5, lastRevisited);
    cityMap2.addStreetFurniture(trafficLight1);

    final Set<TrafficLight> trafficLights = trafficDepartment.getTrafficLights();
    System.out.println(trafficLights);
  }
}
