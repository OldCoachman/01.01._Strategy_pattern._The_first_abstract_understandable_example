The code represents an intuitive example of the Strategy pattern. The example is provided by Christopher Okhravi (https://www.youtube.com/c/ChristopherOkhravi). Suppose we have a duck that can:
- quack
- fly
- be represented in console

Consider the example.
Assume we need to construct two ducks: a rubber duck and a newborn duck. The rubber duck cannot fly because it is rubber (so sorry for my excellent explanation). Similarly, the newborn duck cannot fly, because it does not have enough power for it. Then, we need to duplicate the method "fly" (which shows that a duck cannot fly) for these 2 ducks. 

Imagine we need to build ten ducks, none of which can fly.So, we duplicate the method "fly" 10 times. That is why it's more elegant to spicify the interface 
IFlyStrategy, because then we can produce a single class "NoFlyStrategy" and use it instead of duplicating code.

P.S. Check the UML diagram.




