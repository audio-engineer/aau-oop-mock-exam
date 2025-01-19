package dk.aau.oop.mockexam.model;

import dk.aau.oop.mockexam.observer.TrafficLightListener;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class TrafficDepartment implements TrafficLightListener {
  private final Set<TrafficLight> trafficLights;

  public TrafficDepartment() {
    trafficLights = new HashSet<>(20);
  }

  @Override
  public void update(final TrafficLight light) {
    addTrafficLight(light);
  }

  public void addTrafficLight(final TrafficLight trafficLight) {
    trafficLights.add(trafficLight);
  }

  public Set<TrafficLight> getTrafficLights() {
    return Collections.unmodifiableSet(trafficLights);
  }

  @Override
  public String toString() {
    return "TrafficDepartment{" + "trafficLights=" + trafficLights + '}';
  }
}
