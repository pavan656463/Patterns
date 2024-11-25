# Tourism Itinerary Builder

This is a simple tourism itinerary builder implemented in JavaScript using the builder pattern. It allows you to create a tourism itinerary by adding sightseeing, food, and shopping activities.

## Getting Started

To use the tourism itinerary builder, you can follow these steps:

1. Create a new `TourismBuilder` object using the `new` keyword.
2. Add activities to the itinerary using the `addSightseeing`, `addFood`, and `addShopping` methods.
3. Build the itinerary using the `build` method.

Here's an example of how to use the tourism itinerary builder:

```javascript
const tourismBuilder = new TourismBuilder();
const myItinerary = tourismBuilder
.addSightseeing('Cubbon Park')
.addFood('Dosa')
.addShopping('Mantri Square')
.build();

console.log(myItinerary);