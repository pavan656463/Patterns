package Behaviour_design_pattern.state;

public class GreenState implements TrafficLightState {
    @Override
    public void change(TrafficLightContext context) {
        System.out.println("Changing from Green to Yellow.");
        context.setState(new YellowState());
    }

    @Override
    public String getState() {
        return "Green";
    }
}

