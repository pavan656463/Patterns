# Interpreter Design Pattern Example

This is a simple example demonstrating the Interpreter Design Pattern. In this example, we implement a basic arithmetic expression interpreter that can evaluate expressions containing addition and subtraction operations.

## Overview

The Interpreter Design Pattern is a behavioral design pattern that is used to define a grammar for a language and provide a way to evaluate sentences in that language. It's typically used when you have a language to interpret, such as a scripting language or a domain-specific language.



## Example Explanation

We have implemented the interpreter for arithmetic expressions consisting of addition and subtraction operations. Here's how it works:

1. **Define the Grammar**: We define the grammar using BNF notation.

2. **Create Abstract Syntax Tree (AST)**: We represent expressions as a tree structure, where each node represents an operation (addition or subtraction) and leaf nodes represent numbers.

3. **Implement the Interpreter**: We define classes for each node type and an interpreter to evaluate the expressions.

4. **Interpret Sentences**: We parse input arithmetic expressions, construct the AST, and then use the interpreter to evaluate them.

## Usage

To run the example, execute the Python script `interpreter_example.py`. You can modify the expressions in the script to test different arithmetic expressions.

``` php 
<expression> ::= <expression> '+' <term> | <expression> '-' <term> | <term>
<term> ::= <number>
<number> ::= [0-9]+
