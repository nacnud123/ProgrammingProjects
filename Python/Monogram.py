#Duncan Armstrong 12/19/17
#Makes a monogram
fullName = input("Enter your first, middle, and last name:")
fullName = fullName.split(" ")
if len(fullName) > 2:
    print("Please enter a name with a first, middle, and last without spaces in each")
else:
    fName = fullName[0]
    mName = fullName[1]
    lName = fullName[2]
    mono = fName[0].upper()+lName[0].upper()+mName[0].upper()
    print(mono)
a=input("Press enter to end.") # To prevent Command Prompt from closing.
