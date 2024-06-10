# Define the node classes for the AST
class Expression:
    def interpret(self):
        pass

class AdditionExpression(Expression):
    def __init__(self, left, right):
        self.left = left
        self.right = right

    def interpret(self):
        return self.left.interpret() + self.right.interpret()

class SubtractionExpression(Expression):
    def __init__(self, left, right):
        self.left = left
        self.right = right

    def interpret(self):
        return self.left.interpret() - self.right.interpret()

class Number(Expression):
    def __init__(self, value):
        self.value = value

    def interpret(self):
        return int(self.value)

# Define the interpreter
class Interpreter:
    def __init__(self, expression):
        self.expression = expression

    def interpret(self):
        return self.expression.interpret()

# Example usage
if __name__ == "__main__":
    expression = AdditionExpression(
        SubtractionExpression(Number("10"), Number("5")),
        Number("3")
    )
    interpreter = Interpreter(expression)
    result = interpreter.interpret()
    print("Result:", result)  # Output: Result: 8
