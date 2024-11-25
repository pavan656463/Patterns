# Observer pattern implementation in Python for eagle and hawk observing food sources

class Environment:
    def __init__(self):
        self._observers = []

    def attach(self, observer):
        if observer not in self._observers:
            self._observers.append(observer)

    def detach(self, observer):
        try:
            self._observers.remove(observer)
        except ValueError:
            pass

    def notify(self, food_source):
        for observer in self._observers:
            observer.update(food_source)

class Bird:
    def __init__(self, name):
        self._name = name

    def update(self, food_source):
        pass

class Eagle(Bird):
    def update(self, food_source):
        print(f"{self._name}: Scanning for food source...")
        if food_source == "rabbit":
            print(f"{self._name}: Spotted a rabbit! Ready to hunt.")
        else:
            print(f"{self._name}: Not interested in {food_source}.")

class Hawk(Bird):
    def update(self, food_source):
        print(f"{self._name}: Scanning for food source...")
        if food_source == "fish":
            print(f"{self._name}: Spotted a fish! Diving in to catch it.")
        else:
            print(f"{self._name}: Not interested in {food_source}.")

if __name__ == "__main__":
    environment = Environment()
    eagle = Eagle("Eagle")
    hawk = Hawk("Hawk")

    environment.attach(eagle)
    environment.attach(hawk)

    print("=== Food sources in the environment ===")
    food_sources = ["rabbit", "fish", "mouse", "snake"]
    for food_source in food_sources:
        print(f"--- Environment: New food source detected: {food_source} ---")
        environment.notify(food_source)
