// Define the TourismItinerary class
class TourismItinerary {
    constructor() {
      this.activities = [];
    }
  
    addActivity(activity) {
      this.activities.push(activity);
      return this;
    }
  
    build() {
      // Return a new TourismItinerary object with the same activities
      return new TourismItinerary().addActivities(this.activities);
    }
    
    // Method to add multiple activities at once
    addActivities(activities) {
        for (const activity of activities) {
            this.activities.push(activity);
        }
        return this;
    }
}
  
// Define the TourismFactory class
class TourismFactory {
    static createItinerary() {
      return new TourismItinerary();
    }
}
  
// Create a new TourismItinerary object using the factory method
const myItinerary = TourismFactory.createItinerary();
  
// Add activities to the itinerary
myItinerary
  .addActivity({ type: 'sightseeing', name: 'Cubbon Park' })
  .addActivity({ type: 'food', name: 'Dosa' })
  .addActivity({ type: 'shopping', name: 'Mantri Square' });
  
// Build the itinerary
const myBuiltItinerary = myItinerary.build();
  
// Log the itinerary
console.log(myBuiltItinerary);
