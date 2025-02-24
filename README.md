# Scala Age Setter Bug

This repository demonstrates a common error in Scala class design, specifically improper handling of invalid input within a setter method. The `MyClass` class includes a setter for the `age` property that throws an `IllegalArgumentException` if a negative age is attempted. However, this error handling could be improved for better robustness and user experience.

## Bug Description
The primary bug lies in the abrupt termination of the program upon encountering a negative age.  A more graceful solution would involve either logging the error, using a default value, or providing more informative feedback to the user.

## Solution
The solution improves error handling by incorporating a `try-catch` block or employing a default value strategy to manage the potential `IllegalArgumentException`.