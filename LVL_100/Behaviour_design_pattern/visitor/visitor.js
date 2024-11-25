// Visitor Interface
class ShapeVisitor {
    visitCircle(circle) {
        throw new Error('Method "visitCircle" must be implemented.');
    }

    visitSquare(square) {
        throw new Error('Method "visitSquare" must be implemented.');
    }

    visitTriangle(triangle) {
        throw new Error('Method "visitTriangle" must be implemented.');
    }
}

// Concrete Visitor: Calculates the area of each shape
class AreaVisitor extends ShapeVisitor {
    visitCircle(circle) {
        return 3.14 * circle.radius ** 2;
    }

    visitSquare(square) {
        return square.sideLength ** 2;
    }

    visitTriangle(triangle) {
        // For simplicity, assuming equilateral triangles
        return (triangle.sideLength ** 2) * 0.433 / 2;
    }
}

// Concrete Visitor: Calculates the area and perimeter of each shape
class AreaPerimeterVisitor extends ShapeVisitor {
    visitCircle(circle) {
        const area = 3.14 * circle.radius ** 2;
        const perimeter = 2 * 3.14 * circle.radius;
        return { area, perimeter };
    }

    visitSquare(square) {
        const area = square.sideLength ** 2;
        const perimeter = 4 * square.sideLength;
        return { area, perimeter };
    }

    visitTriangle(triangle) {
        // For simplicity, assuming equilateral triangles
        const area = (triangle.sideLength ** 2) * 0.433 / 2;
        const perimeter = 3 * triangle.sideLength;
        return { area, perimeter };
    }
}

// Element Interface
class Shape {
    accept(visitor) {
        throw new Error('Method "accept" must be implemented.');
    }
}

// Concrete Elements
class Circle extends Shape {
    constructor(radius) {
        super();
        this.radius = radius;
    }

    accept(visitor) {
        return visitor.visitCircle(this);
    }
}

class Square extends Shape {
    constructor(sideLength) {
        super();
        this.sideLength = sideLength;
    }

    accept(visitor) {
        return visitor.visitSquare(this);
    }
}

class Triangle extends Shape {
    constructor(sideLength) {
        super();
        this.sideLength = sideLength;
    }

    accept(visitor) {
        return visitor.visitTriangle(this);
    }
}

// Object Structure
class ShapeCollection {
    constructor() {
        this.shapes = [];
    }

    addShape(shape) {
        this.shapes.push(shape);
    }

    calculateArea(visitor) {
        const areas = [];
        for (const shape of this.shapes) {
            areas.push(shape.accept(visitor));
        }
        return areas;
    }

    calculateAreaPerimeter(visitor) {
        const results = [];
        for (const shape of this.shapes) {
            results.push(shape.accept(visitor));
        }
        return results;
    }
}

// Usage
const collection = new ShapeCollection();
collection.addShape(new Circle(5));
collection.addShape(new Square(4));
collection.addShape(new Triangle(6));

const areaPerimeterVisitor = new AreaPerimeterVisitor();
const results = collection.calculateAreaPerimeter(areaPerimeterVisitor);

console.log("Areas and perimeters of shapes:");
for (let i = 0; i < collection.shapes.length; i++) {
    const shape = collection.shapes[i];
    const result = results[i];
    console.log(`${shape.constructor.name}: Area=${result.area}, Perimeter=${result.perimeter}`);
}
