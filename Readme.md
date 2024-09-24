### Education Initiatives Assignment

## Task - 1 : Design Patterns Demonstration

# Patterns Implemented

- Behavioral Design Patterns

    -> Observer Pattern
        In this pattern, an object (subject) maintains a list of its dependents (observers) and notifies them automatically of any state changes. Example: A stock price notifier where investors are notified of stock price changes.

    -> Command Pattern
        The Command Pattern encapsulates a request as an object, thereby allowing parameterization of clients with queues, requests, and operations. Example: A robot control system where multiple commands like move, stop, and rotate can be executed independently.

- Creational Design Patterns

    -> Singleton Pattern
        Ensures that a class has only one instance and provides a global point of access to it. Example: A database connection instance that is reused throughout the application.

    -> Factory Pattern
        This pattern defines an interface for creating objects but allows subclasses to alter the type of objects that will be created. Example: A shape factory that creates objects like circles, squares, or triangles based on input.

- Structural Design Patterns

    -> Adapter Pattern
        Converts the interface of a class into another interface that the client expects. Example: Adapting incompatible audio interfaces to work together.
    ->Facade Pattern
        Provides a simplified interface to a complex system, making it easier for the client to interact with the system. Example: A video conversion tool that simplifies the process of video encoding and saving files.

Commands to run Task1
-> Compile: javac Task1/Behavioral_DesignPattern/ObserverPattern/*.java
            javac Task1/Behavioral_DesignPattern/CommandPattern/*.java
            javac Task1/Creational_DesignPattern/*.java
            javac Task1/Structural_DesignPattern/*.java

-> Run: java Task1.Behavioral_DesignPattern.ObserverPattern.ObserverPatternDemo
        java Task1.Behavioral_DesignPattern.CommandPattern.Main
        java Task1.Creational_DesignPattern.SingletonPattern.Main
        java Task1.Structural_DesignPattern.AdapterPattern.Main



## Task - 2: Satellite Command System

Key Features: 
- Satellite Initialization: The satellite starts with default attributes (orientation, solar panels status, and data collected).

- Rotate Command: Changes the satellite's orientation based on the input direction (North, South, East, West).

- Activate/Deactivate Solar Panels: Controls the status of the solar panels (Active or Inactive).

- Data Collection: Collects data only if the solar panels are active. Each collection increments the data by 10 units.

- Command Handling: Implements the Command Pattern to handle user commands and maintain satellite state.

- Logging and Exception Handling: Proper logging and error handling mechanisms are in place to ensure robust execution.


Command to run Task2
-> Compile: javac Task2/SatelliteCommandSystem/*.java
-> Run: java Task2.SatelliteCommandSystem.Main
