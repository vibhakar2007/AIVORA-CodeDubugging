import turtle

def drawSquare():
    screen = turtle.Screen()
    t = turtle.Turtle()
    t.speed(0)
    with open("Q2-10\Python\coords.txt", "r") as file:
        coords = file.readlines()

    points = []

    for line in coords:
        x, y = line.strip().split(",")
        points.append((int(x), int(y)))

    t.penup()
    t.goto(points[0])
    t.pendown()

    for point in points[1:]:
        t.goto(point)

    t.goto(points[0])

    screen.mainloop()
    
def callDrawer():
    with open("Q2-10\Python\drawer.txt", "r") as file:
        code = f"""{file.read()}"""
    exec(code)

if __name__ == "__main__":
    drawSquare()
    callDrawer()