# Creational Design Patterns

Author: Popescu Paula   
Academic Group: FAF-191

## Table of Contents:
1. [Objectives:](#objectives) 
2. [Task:](#task)
3. [Theory:](#theory)
4. [Implementation:](#implementation)
5. [Results:](#results)

## Objectives:
1. Study and understand the Creational Design Patterns.
2. Choose a domain, define its main classes/models/entities and choose the appropriate instantiation mechanisms.
3. Use some creational design patterns for object instantiation in a sample project.

## Task:
1. Choose an OO programming language and a suitable IDE or Editor (No frameworks/libs/engines allowed).
2. Select a domain area for the sample project.
3. Define the main involved classes and think about what instantiation mechanisms are needed.
4. Based on the previous point, implement atleast 3 creational design patterns in your project.

## Theory:
In software engineering, the creational design patterns are the general solutions that deal with object creation, trying to create objects in a manner suitable to the situation. The basic form of object creation could result in design problems or added complexity to the design. Creational design patterns solve this problem by optimizing, hiding or controlling the object creation.

Some examples of this kind of design patterns are:
* Singleton
* Builder
* Prototype
* Object Pooling
* Factory Method
* Abstract Factory

## Implementation:
In this laboratory work, I simulate a bookstore, where the products are devided into two categories : by genres and by language. Therefore, each category has a factory method implemented GenreFactory and LanguageFactory, which are used to generate objects of concrete classes. The Genre Factory and Language Factory implement the interface Abstract Factory which has the method sellBook(). Each factory has three subclasses with their separate implemented builders. This was done in order to enable the user to create different representations from the same construction process. In each two concrete factories, there is a static creation method that acts like a constructor. This method calls the private constructor to create an object and saves it in a static field. All following calls to this method return the cached object.   
* Abstract Factory
```
public interface AbstractFactory {
    Book sellBook(String name);
}
```
