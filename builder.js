class TourismItinerary {
    constructor(builder) {
        this.activities = builder.activities;
    }

    addActivity(activity) {
        this.activities.push(activity);
        return this;
    }

    static builder() {
        return new TourismBuilder();
    }
}

class TourismBuilder {
    constructor() {
        this.activities = [];
    }

    addSightseeing(activity) {
        this.activities.push({ type: 'sightseeing', name: activity });
        return this;
    }

    addFood(activity) {
        this.activities.push({ type: 'food', name: activity });
        return this;
    }

    addShopping(activity) {
        this.activities.push({ type: 'shopping', name: activity });
        return this;
    }

    build() {
        return new TourismItinerary(this);
    }
}

const tourismBuilder = TourismItinerary.builder();
const myItinerary = tourismBuilder
    .addSightseeing('Cubbon Park')
    .addFood('Fruit Salad')
    .addShopping('Orion Mall')
    .build();

console.log(myItinerary);
