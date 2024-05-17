import threading
import queue

class Student(threading.Thread):
    def __init__(self, name, queue):
        super().__init__()
        self.name = name
        self.queue = queue

    def run(self):
        for i in range(5):
            with semaphore:
                with mutex:
                    self.queue.put(f"{self.name} is studying...")
                    print(f"{self.name} is studying...")

mutex = threading.Lock()
semaphore = threading.Semaphore(1)
queue = queue.Queue()

students = [Student("Pavan", queue), Student("Ram", queue), Student("Vishnu", queue)]

for student in students:
    student.start()

for student in students:
    student.join()

while not queue.empty():
    print(queue.get())