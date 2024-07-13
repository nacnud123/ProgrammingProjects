math.randomseed(os.time())
world = {}

maxRows = 20
maxCol = 20
player = false
playerY = 0
playerX = 0

-- Print the map
function printMap()
	for i = 0, maxRows, 1
	do
		for j = 0, maxCol, 1
		do
			io.write(world[i][j])
		end
	print()
	end
end
-- Make the map
function makeMap()
	for i = 0, maxRows, 1
	do
		world[i] = {}

		for j = 0, maxCol, 1
		do

			F = math.random()
			if(F >= .5 and F <= .6 and player ~= true)
			then
				world[i][j] = "P"
				playerX = i
				playerY = j
				player = true
			elseif(F <= .2)
			then
				world[i][j] = "#"
			elseif(F > .2)
			then
				world[i][j] = "."
			end
		end
	end
end


makeMap()
printMap()
userIn = ""
while(userIn ~= "e")
do
	print("ENTER A DIRECTION (W,A,S,D)(E TO END)")
	userIn = io.read()
	userIn = string.lower(userIn)

	if(userIn == "w")
	then
		if(playerX - 1 < 0)
		then
			print("OH NO!")
		elseif(world[playerX -1][playerY] == "#")
		then
			print("OH NO!")
		else
			world[playerX][playerY] = "."
			world[playerX - 1][playerY] = "P"
			playerX = playerX - 1
		end
	elseif(userIn == "s")
	then
		if(playerX + 1 > maxCol)
		then
			print("OH NO!")
		elseif(world[playerX + 1][playerY] == "#")
		then
			print("OH NO!")
		else
			world[playerX][playerY] = "."
			world[playerX + 1][playerY] = "P"
			playerX = playerX + 1
		end
	elseif(userIn == "a")
	then
		if(playerY - 1 < 0)
		then
			print("OH NO!")
		elseif(world[playerX][playerY - 1] == "#")
		then
			print("OH NO!")
		else
			world[playerX][playerY] = "."
			world[playerX][playerY - 1] = "P"
			playerY = playerY - 1
		end
	elseif(userIn == "d")
	then
		if(playerY + 1 > maxRows)
		then
			print("OH NO!")
		elseif(world[playerX][playerY + 1] == "#")
		then
			print("OH NO!")
		else
			world[playerX][playerY] = "."
			world[playerX][playerY + 1] = "P"
			playerY = playerY + 1
		end
	elseif(userIn == "e")
	then
		print("Goodbye")
	else
		print("Retry Input")
	end
	printMap()
end

