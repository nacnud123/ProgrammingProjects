# Duncan Armstrong 4/10/18
# This program is used to calculate the optimal number of cars, minivans, shor busses, and full size busses that would be required to transport people.

numPeople = input("Enter the number of people going on this trip: ") # Input
Done = int(numPeople)
LowVeh = 0
numCar = 0
numVan = 0
numSBus = 0
numFBus = 0
seats=0
numCar = (Done // 4) + 1
seats = (numCar * 4) - Done
i = 0
while(i == 0):
    if(numCar < 2) or (seats == 0):
        break
    else:
        numVan = numVan + 1
        seats = seats - 1
        numCar = numCar - 2
    
for i in range(Done):
    if Done > 0:
        Done -= 60
        LowVeh += 1
print("Lowest Number of Empty Seats:\nCar:",numCar,"\nVan:",numVan,"\nSmall Bus:",numSBus,"\nFull Bus:",numFBus)
print("Number of Empty Seats:",seats)
print("\n")
print("Lowest Required Vehicles:\nCar: 0\nMinivans: 0 \nSmall Bus: 0\nFull bus:",LowVeh)
print("Number of Empty Seats:",Done * -1)
a=input("Press enter to end.") # To prevent Command Prompt from closing.
