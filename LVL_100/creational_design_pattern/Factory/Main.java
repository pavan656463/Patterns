package creational_design_pattern.Factory;

import java.util.ArrayList;
import java.util.List;

class Activity {
    private String type;
    private String name;

    public Activity(String type, String name) {
        this.type = type;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

class TourismItinerary {
    private List<Activity> activities;

    public TourismItinerary() {
        this.activities = new ArrayList<>();
    }

    public TourismItinerary addActivity(Activity activity) {
        this.activities.add(activity);
        return this;
    }

    public TourismItinerary addActivities(List<Activity> activities) {
        this.activities.addAll(activities);
        return this;
    }

    public TourismItinerary clone() {
        TourismItinerary newItinerary = new TourismItinerary();
        newItinerary.addActivities(this.activities);
        return newItinerary;
    }

    @Override
    public String toString() {
        return "TourismItinerary{" +
                "activities=" + activities +
                '}';
    }
}

class TourismFactory {
    public static TourismItinerary createItinerary() {
        return new TourismItinerary();
    }
}

public class Main {
    public static void main(String[] args) {
        TourismItinerary myItinerary = TourismFactory.createItinerary();

        myItinerary
                .addActivity(new Activity("sightseeing", "Cubbon Park"))
                .addActivity(new Activity("food", "Dosa"))
                .addActivity(new Activity("shopping", "Mantri Square"));

        //myItinerary.clone();

        System.out.println(myItinerary);

        TourismItinerary myItinerary2 = TourismFactory.createItinerary();
        myItinerary2
                .addActivity(new Activity("sightseeing123", "Cubbon Park"))
                .addActivity(new Activity("food123", "Dosa"))
                .addActivity(new Activity("shopping123", "Mantri Square"));

        
        System.out.println(myItinerary2);
    }
}
