package Behaviour_design_pattern.state;

public class StatePatternDemo {
    public static void main(String[] args) {
        TrafficLightContext trafficLight = new TrafficLightContext();
        
        // Simulate the traffic light changes
        System.out.println("Initial State: " + trafficLight.getState());
        trafficLight.change();
        System.out.println("Current State: " + trafficLight.getState());
        trafficLight.change();
        System.out.println("Current State: " + trafficLight.getState());
        trafficLight.change();
        System.out.println("Current State: " + trafficLight.getState());
        trafficLight.change();
        System.out.println("Current State: " + trafficLight.getState());
    }
}
