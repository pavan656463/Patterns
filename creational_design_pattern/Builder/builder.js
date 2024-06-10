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

// Create plan1
const plan1 = TourismItinerary.builder()
    .addSightseeing('Cubbon Park')
    .addFood('bisi bele bath')
    .addShopping('Orion Mall')
    .build();

// Create plan2
const plan2 = TourismItinerary.builder()
    .addSightseeing('Mantri Square')
    .addFood('DBC')
    .addShopping('GT Mall')
    .build();

console.log(plan1);
console.log(plan2);
