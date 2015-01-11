"""Silvia Carbajal
CS100 2014Su Section 01
HW1,May 9,2014
"""
import turtle
myscreen=turtle.Screen()
pen = turtle.Turtle()

def drawPolygon(side,length):
    for i in range(side):
        pen.forward(length)
        pen.right(90)

sideLen=int(input("side length of first square : "))
num=int(input("number of squares: "))
change=int(input("side length change between squares: "))

def centeredSquares(sideLen,num,change,pen):
    for x in range(num):
        drawPolygon(4,sideLen)
        pen.up()
        pen.forward(change/2)
        pen.right(90)
        pen.forward(change/2)
        pen.left(90)
        pen.down()
        sideLen=sideLen-change
        
centeredSquares(sideLen,num,change,pen)

