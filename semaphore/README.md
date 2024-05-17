# Multi-threaded Application with Mutexes and Semaphores

This is a simple multi-threaded application in Python that demonstrates thread synchronization using mutexes and semaphores. The application simulates a study group of students, where each student is represented by a separate thread.

## Description

The `Student` class represents a student in the study group. Each student has a name and a queue, which is used to simulate a shared resource that multiple students can access.

The `run` method of the `Student` class is where the student's behavior is defined. Each student acquires the lock and semaphore, adds a message to the queue indicating that they are studying, and then releases the lock and semaphore.

The `mutex` object is a lock that is used to synchronize access to the shared resource. The `semaphore` object is a semaphore that is used to limit the number of students that can access the shared resource at the same time.

The `queue` object is a queue that is used to simulate a shared resource that multiple students can access.

The `students` list contains instances of the `Student` class, each with a unique name.

The `for` loop at the end of the code starts each student thread.

The `for` loop at the end of the code waits for all student threads to complete.

The final `while` loop prints out any remaining messages in the queue.

## Usage

To run the application, simply execute the Python script `semaphore_multithread.py`. Make sure you have Python installed on your system.

```bash
python semaphore_multithread.py
