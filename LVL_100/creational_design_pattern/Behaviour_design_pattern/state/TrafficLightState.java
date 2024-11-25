package Behaviour_design_pattern.state;

public interface TrafficLightState {
    void change(TrafficLightContext context);
    String getState();
}

