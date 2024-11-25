# Visitor Interface
class ShapeVisitor:
    def visit_circle(self, circle):
        pass

    def visit_square(self, square):
        pass

    def visit_triangle(self, triangle):
        pass

# Concrete Visitor: Calculates the area of each shape
class AreaVisitor(ShapeVisitor):
    def visit_circle(self, circle):
        return 3.14 * circle.radius ** 2

    def visit_square(self, square):
        return square.side_length ** 2

    def visit_triangle(self, triangle):
        # For simplicity, assuming equilateral triangles
        return (triangle.side_length ** 2) * 0.433 / 2

# Concrete Visitor: Calculates the area and perimeter of each shape
class AreaPerimeterVisitor(ShapeVisitor):
    def visit_circle(self, circle):
        area = 3.14 * circle.radius ** 2
        perimeter = 2 * 3.14 * circle.radius
        return area, perimeter

    def visit_square(self, square):
        area = square.side_length ** 2
        perimeter = 4 * square.side_length
        return area, perimeter

    def visit_triangle(self, triangle):
        # For simplicity, assuming equilateral triangles
        area = (triangle.side_length ** 2) * 0.433 / 2
        perimeter = 3 * triangle.side_length
        return area, perimeter
    
# Element Interface
class Shape:
    def accept(self, visitor):
        pass

# Concrete Elements
class Circle(Shape):
    def __init__(self, radius):
        self.radius = radius

    def accept(self, visitor):
        return visitor.visit_circle(self)

class Square(Shape):
    def __init__(self, side_length):
        self.side_length = side_length

    def accept(self, visitor):
        return visitor.visit_square(self)

class Triangle(Shape):
    def __init__(self, side_length):
        self.side_length = side_length

    def accept(self, visitor):
        return visitor.visit_triangle(self)

# Object Structure
class ShapeCollection:
    def __init__(self):
        self.shapes = []

    def add_shape(self, shape):
        self.shapes.append(shape)

    def calculate_area(self, visitor):
        areas = []
        for shape in self.shapes:
            areas.append(shape.accept(visitor))
        return areas

    def calculate_area_perimeter(self, visitor):
        results = []
        for shape in self.shapes:
            results.append(shape.accept(visitor))
        return results

# Usage
collection = ShapeCollection()
collection.add_shape(Circle(5))
collection.add_shape(Square(4))
collection.add_shape(Triangle(6))

area_perimeter_visitor = AreaPerimeterVisitor()
results = collection.calculate_area_perimeter(area_perimeter_visitor)

print("Areas and perimeters of shapes:")
for shape, result in zip(collection.shapes, results):
    area, perimeter = result
    print(f"{type(shape).__name__}: Area={area}, Perimeter={perimeter}")
