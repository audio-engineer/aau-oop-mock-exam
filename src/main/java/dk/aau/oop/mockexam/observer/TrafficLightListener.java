package dk.aau.oop.mockexam.observer;

import dk.aau.oop.mockexam.model.TrafficLight;

@FunctionalInterface
public interface TrafficLightListener {
  void update(TrafficLight light);
}
