package Behaviour_design_pattern.state;

public class YellowState implements TrafficLightState {
    @Override
    public void change(TrafficLightContext context) {
        System.out.println("Changing from Yellow to Red.");
        context.setState(new RedState());
    }

    @Override
    public String getState() {
        return "Yellow";
    }
}
