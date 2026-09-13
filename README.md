# Pizza Builder

## Description

This project demonstrates the Builder Design Pattern in Java using a pizza ordering example.

The Builder Pattern is used to construct a complex Pizza object step by step. The project contains two concrete builders that create different types of pizza: Classic Pizza and Spicy Pizza.

## Project Structure

- `Pizza` — Product class representing the final pizza.
- `PizzaBuilder` — Builder interface that defines construction steps.
- `BasePizzaBuilder` — Abstract builder containing common construction logic.
- `ClassicPizzaBuilder` — Concrete builder for classic pizza.
- `SpicyPizzaBuilder` — Concrete builder for spicy pizza.
- `PizzaDirector` — Director that defines standard pizza construction processes.
- `Main` — Client class demonstrating the Builder Pattern.

## How to Run

Run the `Main` class.

The program creates two different pizzas and prints their configurations to the console.

## Example Output

Classic Pizza:
`Pizza{size='Medium', crust='Classic', sauce='Tomato', cheese='Mozzarella', toppings=[Tomato, Basil]}`

Spicy Pizza:
`Pizza{size='Large', crust='Thin', sauce='Spicy Tomato', cheese='Cheddar', toppings=[Pepperoni, Jalapeno, Chili]}`

## Clean Code Principles

The project demonstrates several Clean Code principles:

1. Meaningful names
2. Small and focused methods
3. Avoiding duplicated construction logic
4. Focused classes with clear responsibilities
5. Consistent formatting
6. Controlled object construction

## Technologies

- Java
- Maven
- IntelliJ IDEA
- Git and GitHub

## Design Pattern

The project implements the **Builder Design Pattern**.