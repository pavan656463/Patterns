// Implementing Implementor interface
class Implementor {
    sendMessage(message) {
      throw new Error("sendMessage() method must be implemented");
    }
  }
  
  // Concrete Implementor A
  class ConcreteImplementorA extends Implementor {
    sendMessage(message) {
      return `Sending message "${message}" using Concrete Implementor A`;
    }
  }
  
  // Concrete Implementor B
  class ConcreteImplementorB extends Implementor {
    sendMessage(message) {
      return `Sending message "${message}" using Concrete Implementor B`;
    }
  }
  
  // Abstraction
  class Messenger {
    constructor(impl) {
      this.impl = impl;
    }
  
    sendMessage(message) {
      return this.impl.sendMessage(message);
    }
  }
  
  // Refined Abstraction
  class RefinedMessenger extends Messenger {
    refinedOperation() {
      return "Refined Abstraction operation";
    }
    
    sendMessage(message) {
      return this.impl.sendMessage("Cheers! " & message);
    }

  }
  
  // Usage
  const implementorA = new ConcreteImplementorA();
  const implementorB = new ConcreteImplementorB();
  
  const abstraction1 = new Messenger(implementorA);
  console.log(abstraction1.sendMessage("Hello")); // Output: Sending message "Hello" using Concrete Implementor A
  
  const abstraction2 = new Abstraction(implementorB);
  console.log(abstraction2.sendMessage("Hi")); // Output: Sending message "Hi" using Concrete Implementor B
  
  const refinedAbstraction = new RefinedAbstraction(implementorA);
  console.log(refinedAbstraction.sendMessage("Hey")); // Output: Sending message "Hey" using Concrete Implementor A
  console.log(refinedAbstraction.refinedOperation()); // Output: Refined Abstraction operation
  