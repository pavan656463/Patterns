# Strategy interface
class SortStrategy:
    def sort(self, data):
        pass

# Concrete strategy classes
class BubbleSortStrategy(SortStrategy):
    def sort(self, data):
        # Implementation of Bubble Sort
        n = len(data)
        for i in range(n):
            for j in range(0, n-i-1):
                if data[j] > data[j+1]:
                    data[j], data[j+1] = data[j+1], data[j]
        return data

class QuickSortStrategy(SortStrategy):
    def sort(self, data):
        # Implementation of Quick Sort
        if len(data) <= 1:
            return data
        pivot = data[len(data) // 2]
        left = [x for x in data if x < pivot]
        middle = [x for x in data if x == pivot]
        right = [x for x in data if x > pivot]
        return QuickSortStrategy().sort(left) + middle + QuickSortStrategy().sort(right)

class MergeSortStrategy(SortStrategy):
    def sort(self, data):
        # Implementation of Merge Sort
        if len(data) > 1:
            mid = len(data) // 2
            left_half = data[:mid]
            right_half = data[mid:]

            self.sort(left_half)
            self.sort(right_half)

            i = j = k = 0

            while i < len(left_half) and j < len(right_half):
                if left_half[i] < right_half[j]:
                    data[k] = left_half[i]
                    i += 1
                else:
                    data[k] = right_half[j]
                    j += 1
                k += 1

            while i < len(left_half):
                data[k] = left_half[i]
                i += 1
                k += 1

            while j < len(right_half):
                data[k] = right_half[j]
                j += 1
                k += 1
        return data

# Context
class Sorter:
    def __init__(self, strategy):
        self.strategy = strategy

    def set_strategy(self, strategy):
        self.strategy = strategy

    def sort_data(self, data):
        return self.strategy.sort(data)

# Usage
data = [3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5]

sorter = Sorter(BubbleSortStrategy())
print("Bubble Sort:", sorter.sort_data(data))

sorter.set_strategy(QuickSortStrategy())
print("Quick Sort:", sorter.sort_data(data))

sorter.set_strategy(MergeSortStrategy())
print("Merge Sort:", sorter.sort_data(data))
