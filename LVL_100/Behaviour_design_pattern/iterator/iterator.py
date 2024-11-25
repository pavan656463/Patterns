# Iterator interface
class Iterator:
    def __init__(self, collection):
        self.collection = collection
        self.index = 0

    def next(self):
        if self.hasNext():
            value = self.collection[self.index]
            self.index += 1
            return value
        else:
            raise StopIteration()

    def hasNext(self):
        return self.index < len(self.collection)

# Aggregate interface
class Aggregate:
    def create_iterator(self):
        pass

# Concrete Aggregate
class MyList(Aggregate):
    def __init__(self):
        self.items = []

    def add_item(self, item):
        self.items.append(item)

    def create_iterator(self):
        return Iterator(self.items)

# Client code
my_list = MyList()
my_list.add_item(1)
my_list.add_item(2)
my_list.add_item(3)

iterator = my_list.create_iterator()

while iterator.hasNext():
    print(iterator.next())
