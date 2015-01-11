"""Silvia Carbajal
CS100 2014Su Section 01
HW1,May 9,2014
"""

import turtle
myscreen=turtle.Screen()
pen = turtle.Turtle()

small=int(input("smallest side poly: "))
large=int(input("largest side poly: "))
length=int(input("length of side of polygon: "))

def polySequence(smallest,largest,size,p):
    for i in range(smallest,largest+1):
        for j in range(i):
            angle=int(360/i)
            p.forward(size)
            p.right(angle)

polySequence(small,large,length,pen)

