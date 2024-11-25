# Task Manager Application

## **Overview**
The Task Manager application is a Spring Boot-based project that helps manage personal and team tasks for multiple users. It adheres to the **SOLID principles** to ensure modularity, scalability, and maintainability.

---

## **Features**
- Add, view, and manage tasks for multiple users.
- Supports both **Personal Tasks** and **Team Tasks**.
- Task assignment and filtering based on user.
- Uses **Spring Dependency Injection** for flexibility and testability.
- Demonstrates the implementation of **SOLID principles** in a real-world scenario.

---

## **Technologies Used**
- Java 17+
- Spring Boot 3+
- Maven for build management

---

## **SOLID Principles**
1. **Single Responsibility Principle (SRP)**: 
   - Separate classes for `Task`, `User`, `TaskService`, and `UserService` ensure each class has a single reason to change.
2. **Open/Closed Principle (OCP)**: 
   - Easily extendable `Task` class to add new task types without modifying existing code.
3. **Liskov Substitution Principle (LSP)**: 
   - `PersonalTask` and `TeamTask` can replace `Task` without altering application behavior.
4. **Interface Segregation Principle (ISP)**:
   - Focused classes with no redundant or unused methods.
5. **Dependency Inversion Principle (DIP)**:
   - `TaskService` and `UserService` depend on abstractions (`TaskRepository` and `UserRepository`) and use dependency injection.

---

## **Modules**
### **1. Models**
- **`Task`**: Abstract class representing a general task.
- **`PersonalTask`**: Represents a personal task assigned to a single user.
- **`TeamTask`**: Represents a task assigned to a team and a specific user.

### **2. Services**
- **`TaskService`**: Manages tasks (adding, retrieving, and filtering tasks by user).
- **`UserService`**: Manages user operations (adding and retrieving users).

### **3. Controllers**
- **`TaskController`**: Coordinates task-related actions.
- **`UserController`**: Coordinates user-related actions.

---

## **Getting Started**

### **Prerequisites**
- **Java 17** or later
- **Maven** (for dependency management)
- Any IDE (e.g., IntelliJ IDEA, Eclipse)

---
# Task Manager Application

## **Overview**
The Task Manager application is a Spring Boot-based project designed to manage tasks for multiple users. It supports personal and team tasks and follows the **SOLID principles** for a clean, modular, and scalable architecture.

---

## **Features**
- Add, view, and manage tasks for multiple users.
- Handles both **Personal Tasks** and **Team Tasks**.
- Utilizes **Spring Dependency Injection** for flexible and testable components.
- Demonstrates adherence to all five **SOLID principles**.

---

## **SOLID Principles in Practice**

### **1. Single Responsibility Principle (SRP)**
- **Definition**: A class should have only one reason to change.
- **Implementation**:
  - Each class in the application has a single responsibility:
    - **`Task`**: Defines common properties and methods for tasks.
    - **`PersonalTask`** and **`TeamTask`**: Extend the `Task` class to provide specific behavior.
    - **`User`**: Represents a user entity.
    - **`TaskService`**: Handles business logic related to tasks.
    - **`UserService`**: Handles business logic related to users.
    - **`TaskController`**: Coordinates task-related actions.
    - **`UserController`**: Coordinates user-related actions.

By segregating responsibilities, changes in one module do not affect other unrelated parts of the application.

---

### **2. Open/Closed Principle (OCP)**
- **Definition**: Classes should be open for extension but closed for modification.
- **Implementation**:
  - The `Task` class is open for extension. New task types, such as `RecurringTask` or `UrgentTask`, can be added as subclasses without altering the `Task` class.
  - The `displayTaskDetails()` method is overridden in `PersonalTask` and `TeamTask` to provide specific behavior without modifying the base `Task` class.

This allows the system to grow without impacting existing functionality.

---

### **3. Liskov Substitution Principle (LSP)**
- **Definition**: Subtypes must be substitutable for their base types.
- **Implementation**:
  - Subclasses `PersonalTask` and `TeamTask` can replace the base class `Task` wherever required.
  - The `TaskService` class works seamlessly with `Task`, `PersonalTask`, and `TeamTask`.
  - Polymorphic behavior ensures that the correct implementation of `displayTaskDetails()` is invoked based on the task type.

This ensures flexibility and uniform handling of different task types.

---

### **4. Interface Segregation Principle (ISP)**
- **Definition**: A class should not be forced to implement interfaces it does not use.
- **Implementation**:
  - While explicit interfaces are not used in this implementation, behavior is segregated into distinct classes:
    - `PersonalTask` and `TeamTask` focus on task-specific functionality.
    - Shared functionality resides in the `Task` class, ensuring derived classes inherit only relevant behavior.

Future extensions can utilize smaller interfaces to maintain clean class designs.

---

### **5. Dependency Inversion Principle (DIP)**
- **Definition**: High-level modules should not depend on low-level modules. Both should depend on abstractions.
- **Implementation**:
  - `TaskService` and `UserService` depend on abstractions (`TaskRepository` and `UserRepository`), not on concrete implementations.
  - Dependency injection is used to provide the required dependencies, ensuring decoupling.
    ```java
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
    ```

This enables easy testing and swapping of implementations without altering the service layer.

---

## **Summary of SOLID Usage**

| **Principle**               | **Application in Code**                                                                                                                                                                                                                          |
|------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| **Single Responsibility**   | Separate classes for users, tasks, services, and controllers. Each class focuses on one responsibility.                                                                                                                                        |
| **Open/Closed**             | New task types can be added by extending the `Task` class without modifying existing code.                                                                                                              |
| **Liskov Substitution**     | `PersonalTask` and `TeamTask` can replace `Task` wherever required, ensuring polymorphism.                                                                                                             |
| **Interface Segregation**   | Classes contain only relevant behavior, avoiding unused methods or properties.                                                                                                                          |
| **Dependency Inversion**    | High-level modules (`TaskService`, `UserService`) depend on abstractions (`TaskRepository`, `UserRepository`), not concrete implementations. Dependencies are injected using Spring's DI framework.                                             |

---

## **Getting Started**

### **Prerequisites**
- **Java 17** or later
- **Maven** for dependency management
- Any IDE (e.g., IntelliJ IDEA, Eclipse)

---
