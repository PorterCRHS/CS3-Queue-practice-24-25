# CS3 Queue practice

## Exercise 1: Check Expressions using Stacks

Problem Description:
Read in a group of symbols and check to see if the appropriate opening symbol correctly matches up with the appropriate closing symbol. Basically, check if there is a balanced parenthesis and brackets. The opening symbols are “{(<[“ and the appropriate closing symbols are “})>]“. Use the Stack to solve the problem.
### input Sample:
```
(abc(*def)
[{}]
[
[{<()>}]
{<html[value=4]*(12)>{$x}}
[one]<two>{three}(four)
car(cdr(a)(b)))
car(cdr(a)(b))
(<)>
Output Sample:
Invalid expression
valid expression
Invalid expression
valid expression
valid expression
valid expression
Invalid expression
valid expression
Invalid expression
```

## Exercise 2: Expunge using Queues

Write a program that accepts a list of integers and make sure the elements are in ascending order from top to bottom, by removing any element that is smaller than any element(s) on top of it. You can use only java QUEUES.