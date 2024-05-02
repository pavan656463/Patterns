// Define the constructor function for the Chemistry object
function Chemistry(compound, formula) {
  this.compound = compound;
  this.formula = formula;
}

// Add a method to the prototype of the constructor function
Chemistry.prototype.describe = function() {
  console.log(`The compound ${this.compound} has the formula ${this.formula}.`);
};

// Add another method to the prototype to change the compound name dynamically
Chemistry.prototype.changeCompound = function(newCompound) {
  this.compound = newCompound;
};

// Create a new object using the constructor function
const myChemistry = new Chemistry('Water', 'H2O');

// Call the method on the new object
myChemistry.describe(); // The compound Water has the formula H2O.

// Change the compound name dynamically
myChemistry.changeCompound('Ethanol');
myChemistry.describe(); // The compound Ethanol has the formula H2O.
