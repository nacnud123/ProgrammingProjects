# Duncan Armstrong 12/6/27 - 1/23/18
# This is for only for use with the Periodic Table project and all other versions. Thank you :)

name = input("Enter your name: ")
ename = input("Enter your element name: ")
elementtype = input("Is your element a metal, non-metal, or metalloid: ")
abbreviation = input("Enter the abbreviation of your element: ")
family = input("Enter the familty (column) of your element: ")
period = input("Enter the period (row) of your element: ")
number = input("Enter the atomic number of your element: ")
mass = input("Enter your element's mass number: ")
protons = input("Enter your element's number of protons: ")
neutrons = input("Enter your element's number of neutrons: ")
electrons = input("Enter your element's number of electrons: ")
properties = input("Enter physical appearance/properties of your element: ")
applications = input("Enter applications/ economic use/ societal use of your element: ")
history = input("Enter the history of your element: ")
info = input("Enter other information of your element: ")
infile = open(abbreviation+'.js','w')
print('function',abbreviation+'() { ', file=infile)
print('document.getElementById("popUpDiv").style.display = "block"; ', file=infile)
print('document.getElementById("popUpTitle").style.display = "block";', file=infile)
print('document.getElementById("transBackground").style.display = "block";', file=infile)
print('document.getElementById("element").innerHTML = "'+ename+'";', file=infile)
print('document.getElementById("otherInfo").innerHTML = "&emsp; By:',name,'<br />&emsp; Element name:',ename,'<br /><br />&emsp; Metal, Non-Metal, or Metalloid?:',elementtype,'<br /><br />&emsp; Symbolic Abbreviation:',abbreviation,'<br /><br /> &emsp;Period (row):',period,'<br /><br />&emsp;Family (Column):',family,'<br /><br />&emsp;Atomic Number:',number,'<br /><br />&emsp;Mass Number:',mass,'<br /><br />&emsp;Protons:',protons,'<br /><br />&emsp;Neutrons:',neutrons,'<br /><br />&emsp;Electrons:',electrons,'<br /><br />"; ', file=infile)
print('document.getElementById("info1").innerHTML= "&emsp; Physical Appearance/Properties:',properties,'<br /><br />&emsp; Applications/Economic Use/Societal Use:',applications,'<br /><br />&emsp; History:',history,"<br /><br />&emsp; Other Information:",info,'";', file=infile)
print("}", file=infile)
infile.close()
z = input("Press enter. If you do not get any errors, zip up the file and send it to: \n duncan_armstrong@minuteman.org \n or ethan_adams@minuteman.org \n or patrick_oulton@minuteman.org")
# Duncan is super cool.
            #    #
            #    #
            #    #
            #    #
        #      #     #
         #          #
          #        #
           ########

