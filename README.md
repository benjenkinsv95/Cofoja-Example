# Cofoja
*A Design by Contract programming framework for Java.*

## What is Design by Contract?
Design by contract allows a developer to define precise specifications for software components.
These specifications, known as contracts, define preconditions, postconditions, and invariants which must be true whenever
a method is called.

An example of  *Design by Contract* preconditions and postconditions is shown below.

It is an implementation of a `List`'s `add(int index, E element)` method using Java's assert statements.

Preconditions have been added to ensure the index is valid and that the element can be retrieved from the List
after inserting it.

![alt text](img/add_with_asserts.png "An add() method that has precondition and postcondition assert statements")

## What is Cofoja?
Cofoja is a framework for specifying contracts in Java using annotations. 

### Defining preconditions and postconditions in Cofoja

Using the same example as before, we can now specify preconditons using the `@Requires` annotation
and postconditions using the `@Ensures` annotation.

![alt text](img/add_both_contracts.png "An add() method that uses Cofojas @Requires preconditions and @Ensures postconditions")

#### Violating a precondition

If the user passes in a bad index.

![alt text](img/add_both_contracts_precondition_violated_code.png "Alt text!")

The precondition will be violated and Cofoja will print the following error.

![alt text](img/add_both_contracts_precondition_violated.png "Alt text!")


#### Violating a postcondition

If the user passes in correct data.

![alt text](img/add_both_contracts_postcondition_violated_code.png "Alt text!")

But the postcondition is violated then Cofoja will print the following error.

![alt text](img/add_both_contracts_postcondition_violated.png "Alt text!")


### What benefits does Cofoja provide over Java's built in assertions?
Cofoja has two huge benefits over Java's assert statements
* Application logic is separated from contract logic.
* The contract is included in the Javadoc. 

![alt text](img/add_javadoc_generated.png "Alt text!")

If we were using Java's built in assert methods for contracts we would have to maintain
the contract in the code and the documentation separately. Which is error prone if one 
 is updated without the other.


## What are the benefits of Design by Contract?
### Defect localization
When an error is raised, you know the method with the error. Which reduces debugging time.

### Determines cause of error
Contracts help determine if the implementor or user of a library caused an issue.

## What are the downsides of Design by Contract?
### Cofoja license
Cofoja uses the GPLv3 license, so you most likely won't be able to use it commercially.

### Lack of native language support
[The biggest languages with native support are Clojure and Perl6.](https://en.wikipedia.org/wiki/Design_by_contract#Language_support)
 Though .NET *used to* have good support through Code Contracts.

