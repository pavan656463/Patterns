# Component interface
class Coffee:
    def cost(self):
        pass

# Concrete Component
class SimpleCoffee(Coffee):
    def cost(self):
        return 5

# Decorator
class CoffeeDecorator(Coffee):
    def __init__(self, coffee):
        self._coffee = coffee

    def cost(self):
        return self._coffee.cost()

# Concrete Decorator
class Milk(CoffeeDecorator):
    def cost(self):
        return self._coffee.cost() + 2

# Concrete Decorator
class Sugar(CoffeeDecorator):
    def cost(self):
        return self._coffee.cost() + 1

# Usage
coffee = SimpleCoffee()
print("Cost of simple coffee:", coffee.cost())

coffee_with_milk = Milk(coffee)
print("Cost of coffee with milk:", coffee_with_milk.cost())

coffee_with_milk_and_sugar = Sugar(coffee_with_milk)
print("Cost of coffee with milk and sugar:", coffee_with_milk_and_sugar.cost())
