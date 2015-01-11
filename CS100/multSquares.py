"""
PartA. Define a function square that draws a square and takes two paramters:
1. t, a turtle object
2. length, the side length of a square

Part B. Define a function multSquares that draws multiple
squares of increasing size in a horizontal fashion
(as shown on the board) and takes 4 parameters:
1. p, a turtle object,
2. total, number of squares to draw
3. side, the initial length of the square
4. change, the difference between 2 consecutive square lengths

Note. multSquares should use the helper function in part A.

Part C.
Test part B to draw the squares on the board.

ALGORITHM FOR PART B

-repeat total time
    draw square of side side
    move over by side pixels
    make side bigger by change

"""
def square(t,length):
    t.down()
    for i in range(4):
        t.forward(length)
        t.right(90)

def multSquares(p,total,side,change):
    for i in range(total):
        square(p,side)
        p.forward(side)
        side=side+change#side+=change

import turtle
s=turtle.Screen()
pen=turtle.Turtle()
multSquares(pen,4,50,20)

s.exitonclick()





















