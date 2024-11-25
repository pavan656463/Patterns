package Behaviour_design_pattern.state;

public class RedState implements TrafficLightState {
    @Override
    public void change(TrafficLightContext context) {
        System.out.println("Changing from Red to Green.");
        context.setState(new GreenState());
    }

    @Override
    public String getState() {
        return "Red";
    }
}
