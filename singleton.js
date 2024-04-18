// The Singleton class is a simple implementation of the singleton design pattern in JavaScript. 
//The singleton pattern ensures that a class has only one instance, providing a global point of access to this instance.

// The Singleton class has a constructor that checks if an instance of the class already exists. 
//If no instance exists, it creates a new object and sets the instance property to point to this new object. 
//Subsequent calls to the constructor will return the existing instance.

// The Singleton class also has two methods: setData and getData. 
//The setData method sets a key-value pair in the data object of the singleton instance. 
//The getData method returns the value associated with a given key in the data object of the singleton instance.

class Singleton {
    constructor() {
      if (!Singleton.instance) {
        this.data = {};
        Singleton.instance = this;
      }
      return Singleton.instance;
    }
  
    setData(key, value) {
      this.data[key] = value;
    }
  
    getData(key) {
      return this.data[key];
    }
  }
  const singleton1 = new Singleton();
singleton1.setData('Name', 'Pavan');

const singleton2 = new Singleton();
console.log(singleton2.getData('Name')); 