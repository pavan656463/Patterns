# Chain of Responsibility Pattern

The Chain of Responsibility pattern is a behavioral design pattern that allows an object to send a request to a chain of potential handlers. Each handler in the chain has the opportunity to handle the request or pass it on to the next handler in the chain.

## When to Use

- Use the Chain of Responsibility pattern when you want to decouple the sender and receiver of a request.
- Use it when multiple objects may handle a request, but the sender doesn't need to know which object will handle it.
- Use it when you want to avoid hardcoding the receiver of a request into the sender.

## Components

1. **Handler**: Defines an interface for handling requests and optionally implements the successor link.
2. **Concrete Handler**: Implements the Handler interface. It handles requests it's responsible for and forwards other requests to the next handler in the chain.
3. **Client**: Initiates the request to a chain of handlers.

## Example

Suppose we have a telecalling system where customers call in with different types of inquiries or requests regarding their orders on an e-commerce platform. We can use the Chain of Responsibility pattern to handle these calls efficiently.

## Implementation

In our example implementation, we have:
- `CallHandler`: An abstract handler class defining the interface for handling calls.
- `CustomerSupport`, `OrderProcessing`, and `PaymentSupport`: Concrete handlers that handle specific types of calls.
- `main()`: Client code that simulates incoming calls and passes them through the chain of handlers.

## Usage

To use the Chain of Responsibility pattern:
1. Define a chain of handlers with each handler capable of handling certain types of requests.
2. Set up the chain by linking the handlers together.
3. Send requests through the chain, allowing each handler to decide whether to handle the request or pass it on to the next handler.

## Benefits

- Promotes loose coupling between objects.
- Allows flexibility in handling requests.
- Enables adding or modifying handlers without affecting the client.

## Drawbacks

- Requests may go unhandled if there's no suitable handler in the chain.
- Can make the code more difficult to debug if the chain is too long or complex.

## Related Patterns

- **Decorator**: Can be used to add responsibilities dynamically to objects, which can complement the Chain of Responsibility pattern.
- **Command**: The chain can be used to implement a command queue where each handler processes a command and passes it to the next handler.
- **Observer**: Handlers can be observers of events and react to them accordingly.

## Example Code

Check out the [responsibilty.py](responsibilty.py) file for an example implementation of the Chain of Responsibility pattern in Python.

