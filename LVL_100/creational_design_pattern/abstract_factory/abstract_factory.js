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
  
  // Define the abstract factory interface
  class TourismItineraryFactory {
    createItinerary() {
      throw new Error('Method "createItinerary" must be implemented.');
    }
  }
  
  // Define the concrete factory classes for different types of itineraries
  class BangaloreTourismItineraryFactory extends TourismItineraryFactory {
    createItinerary() {
      const itinerary = new TourismItinerary();
      itinerary
      .addActivity({ type: 'sightseeing', name: 'Cubbon Park' })
      .addActivity({ type: 'food', name: 'Dosa' })
      .addActivity({ type: 'shopping', name: 'Mantri Square' });
      return itinerary;
    }
  }
  
  class DelhiTourismItineraryFactory extends TourismItineraryFactory {
    createItinerary() {
      const itinerary = new TourismItinerary();
      itinerary
      .addActivity({ type: 'sightseeing', name: 'Red Fort' })
      .addActivity({ type: 'food', name: 'Butter Chicken' })
      .addActivity({ type: 'shopping', name: 'Chandni Chowk' });
      return itinerary;
    }
  }
  
  // Create a new itinerary using the concrete factory class
// Create a new itinerary using the concrete factory class
const factory = new BangaloreTourismItineraryFactory();
const myNewItinerary = factory.createItinerary();

// Log the new itinerary
console.log(myNewItinerary);
