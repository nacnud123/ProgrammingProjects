# Duncan Armstrong 10/25/17
# This program calculates Momentum

def Momentum():
    Mass = eval(input("Enter the mass of the object in kilograms: ")) # This gets the mass
    Velocity = eval(input("Enter the velocity of the object in meters per second: ")) # This gets the velocity
    Momentum = Mass * Velocity # Used to calculate the momentum
    print("The momentum of the object is",Momentum)

Momentum()
a=input("Press enter to end.") # To prevent Command Prompt from closing.
