# Duncan Armstrong 1/9/18.
# This is a program that Encodes and Decodes a message.

Start = input("Do want to Encode or Decode:") # Input to see if you want to encode of decode
if (Start.lower() == "encode"):
    message = input("Enter a message:")# Input of the message to encode
    code = input("Enter a letter to encode:") # the letter used to encode
    messageUnicode = 0
    code = code.upper()
    Out = ""
    Amount = ord(code) # Turns the input into unicode
    Amount = Amount * -1
    Amount = Amount + 64
    for i in range(len(message)): # Loop that changes each letter
        messageUnicode = ord(message[i])
        if (messageUnicode >= 97 and messageUnicode <= 122):
            messageUnicode  = messageUnicode + Amount
            if (messageUnicode < 97):
                messageUnicode += 26
        if (messageUnicode >= 65 and messageUnicode <= 90):
            messageUnicode  = messageUnicode + Amount
            if (messageUnicode < 65):
                messageUnicode += 26
        Out = Out + chr(messageUnicode)
    print("Your encided message is:",Out) # output
    end = input("Would you like to decode this?:")
    if (end.lower() == "yes"):
        print(message)
    
if (Start.lower() == "decode"): 
    MessageDe = input("Enter the encoded message:") # Input for the encoded message
    CodeDe = input("Enter the decode letter:") # Input that has the letter used in decodeing
    CodeDe = CodeDe.upper()
    AmountDe = ord(CodeDe) # changes the message into unicode
    AmountDe = AmountDe - 64
    UnicodeDe = 0
    OutDe = ""
    for i in range(len(MessageDe)): # Loop that decodes each letter
        UnicodeDe = ord(MessageDe[i])
        if (UnicodeDe >= 97 and UnicodeDe <=122):
            UnicodeDe = UnicodeDe + AmountDe
            if (UnicodeDe < 97):
                UnicodeDe += 26
            if (UnicodeDe > 122):
                UnicodeDe += -26
        if (UnicodeDe >= 65 and UnicodeDe <= 90):
            UnicodeDe = UnicodeDe + AmountDe
            if (UnicodeDe < 65):
                UnicodeDe += 26
            if (UnicodeDe > 90):
                UnicodeDe += -26
        OutDe = OutDe + chr(UnicodeDe) # output
    print("Your decodeed message is:",OutDe)
a=input("Press enter to end.") # To prevent Command Prompt from closing.
