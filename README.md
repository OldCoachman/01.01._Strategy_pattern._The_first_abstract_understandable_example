The code represents intuitive example of Strategy pattern, the example is provided by Christopher Okhravi (https://www.youtube.com/c/ChristopherOkhravi).
Suppose we have a duck which can:
- quack
- fly
- be represented in console

Consider the example.
Assume, we need construct two ducks: rubber duck and newborn duck. 
The rubber duck cannot fly, because it is rubber duck (soory for my excellent explanation).
Similarly, the newborn duck cannot fly, because it has not enough power for it. 
Then, we need duplicate method "fly" (which shows that a duck cannot fly) for these 2 ducks. 

Now imagine we need to construct 10 ducks, and all of these cannot fly. So, we duplicate method "fly" 10 times. That is why it's more elegant to spicify interface 
IFlyStrategy, because then we can produce single class "NoFlyStrategy" and use it instead duplicating code.
