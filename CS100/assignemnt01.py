import turtle
myscreen=turtle.Screen()
pen = turtle.Turtle()

def drawPolygon(side,length):
    for i in range(side):
        pen.forward(length)
        pen.right(90)

#small=int(input("smallest side poly: "))
#large=int(input("largest side poly: "))
#length=int(input("length of side of polygon: "))

def polySequence(smallest,largest,size,p):
    for i in range(smallest,largest+1):
        for j in range(i):
            angle=int(360/i)
            p.forward(size)
            p.right(angle)

#polySequence(small,large,length,pen)

#sideLen=int(input("side length of first square : "))
#num=int(input("number of squares: "))
#change=int(input("side length change between squares: "))

def centeredSquares(sideLen,num,change,pen):
    for x in range(num):
        drawPolygon(4,sideLen)
        pen.up()
        pen.forward(10)
        pen.right(90)
        pen.forward(10)
        pen.left(90)
        pen.down()
        sideLen=sideLen-change

        
centeredSquares(100,5,20,pen)
