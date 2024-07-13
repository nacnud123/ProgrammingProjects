# Duncan Armstrong 4/30/18 - 5/4/18
# This program is the card game war.
import random
import time
playerCard = [] #Holds the player's cards.
compCard = [] #Holds the computer's cards
playerWar = [] #Holds the player's cards used in war.
compWar = [] #Holds the computer's cards used in war
count = 0
def card(): #Function that gives the computer and player cards.
    Cards = [4,4,4,4,4,4,4,4,4,4,4,4,4]  #Holds the number of cards remaining.
    Letters = [14,13,12,11,10,9,8,7,6,5,4,3,2] #Holds the valuse of the cards
    
    while len(playerCard) <= 26:
        CardNum = random.randint(0,12)
        if Cards[(CardNum -2)] > 0:
            playerCard.append(Letters[CardNum])
            Cards[(CardNum - 2)] -= 1
    Cards = [4,4,4,4,4,4,4,4,4,4,4,4,4] #Resets the number of cards.
    while len(compCard) <= 26:
        CardNum = random.randint(0,12)
        if Cards[(CardNum -2)] > 0:
            compCard.append(Letters[CardNum])
            Cards[(CardNum -2)] -= 1

card()
def War(): #Function that is used for war.
    global playerCard
    global compCard
    global playerWar
    global compWar
    global count
    print("WAR!")
    i=0
    if len(playerCard) > 3 or len(compCard) > 3:
        count = 3
    if len(playerCard) == 3 or len(compCard) == 3:
        count = 2
    if len(playerCard) == 2 or len(compCard) == 2:
        count = 1
    if len(playerCard) == 1 or len(compCard) == 1:
        count = 0
    for i in range(count):
        playerWar.append(playerCard[i])
        compWar.append(compCard[i])
        playerCard.remove(playerCard[i])
        compCard.remove(compCard[i])
    i=0
    time.sleep(5)
    if playerCard[i] == 14:
        print("You draw an Ace!")
    elif playerCard[i] == 13:
        print("You draw a King!")
    elif playerCard[i] == 12:
        print("You draw a Queen!")
    elif playerCard[i] == 11:
        print("You draw a Jack!")
    else:
        print("You draw a" + " " + str(playerCard[i]))
    if compCard[i] == 14:
        print("Comp draws an Ace!")
    elif compCard[i] == 13:
        print("Comp draws a King!")
    elif compCard[i] == 12:
        print("Comp draws a Queen!")
    elif compCard[i] == 11:
        print("Comp draws a Jack!")
    else:
        print("Comp draws a" + " " + str(compCard[i]))
    time.sleep(.5)
    if compCard[i] == playerCard[i]:
        War()
    else:
        if playerCard[i] > compCard[i]:
            print("You win this War!")
            playerCard += compWar
            playerCard += playerWar
            print("You won",compWar, playerWar,"\n")
        elif compCard[i] > playerCard[i]:
            print("The comp won this War!")
            compCard += compWar
            playerCard += playerWar
            print("The comp won", compWar, playerWar,"\n")
        playerWar = []
        compWar = []
def play(): #Function that plays the game.
    
    i = 0
    while len(playerCard) > 0 or len(compCard) > 0:
        if playerCard[i] == 14:
            print("You draw an Ace!")
        elif playerCard[i] == 13:
            print("You draw a King!")
        elif playerCard[i] == 12:
            print("You draw a Queen!")
        elif playerCard[i] == 11:
            print("You draw a Jack!")
        else:
            print("You draw a" + " " + str(playerCard[i]) + "!")
        if compCard[i] == 14:
            print("Comp draws an Ace!")
        elif compCard[i] == 13:
            print("Comp draws a King!")
        elif compCard[i] == 12:
            print("Comp draws a Queen!")
        elif compCard[i] == 11:
            print("Comp draws a Jack!")
        else:
            print("Comp draws a" + " " + str(compCard[i]) + "!")
        if playerCard[i] == compCard[i]:
            War()
        elif playerCard[i] > compCard[i]:
            print("You win this round")
            playerCard.append(compCard[i])
            compCard.remove(compCard[i])
            playerCard.append(playerCard[i])
            playerCard.remove(playerCard[i])
            print("You have", len(playerCard) ,  " Cards \n")
        elif compCard[i] > playerCard[i]:
            print("The comp won this round \n" )
            compCard.append(playerCard[i])
            playerCard.remove(playerCard[i])
            compCard.append(compCard[i])
            compCard.remove(compCard[i])
        time.sleep(1.5)
        if len(playerCard) == 0 or len(compCard) >= 52:
            print("\nComp wins")
            break
        if len(compCard) == 0 or len(playerCard) >= 52:
            print("\nPlayer wins")
            break

play()
a=input("Press enter to end.") # To prevent Command Prompt from closing.
