package Behaviour_design_pattern.state;

public class TrafficLightContext {
    private TrafficLightState currentState;

    public TrafficLightContext() {
        // Initial state
        this.currentState = new RedState();
    }

    public void setState(TrafficLightState state) {
        this.currentState = state;
    }

    public void change() {
        this.currentState.change(this);
    }

    public String getState() {
        return this.currentState.getState();
    }
}
