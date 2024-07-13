#Duncan Armstrong 12/19/17
#Make a tree
Symbol = "#"
Height = input("Enter how long you want it:")
def Tree():
    Space = int(Height)
    Number = 1
    print(" " * Space + "*")
    print(" " * Space + "|")
    for i in range(int(Height)):
        print(" " * Space + Symbol * Number)
        Number += 2
        Space += -1
    for i in range(int(int(Height)/2)):
        print(" " * int(int(Height)/2+2) + Symbol * int(int(Height)-3))
Tree()
a=input("Press enter to end.") # To prevent Command Prompt from closing.
