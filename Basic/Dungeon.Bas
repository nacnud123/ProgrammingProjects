1 P1 = 0: P2 = 0: P3 = 0
3 DIM W$(40,80)
4 FOR X = 0 TO 40
5 FOR Y = 0 TO 80
6 F = RND(1)
7 IF F >= .5 AND F <= .6 AND P3 <> 1 THEN 20
8 IF F <= .2 THEN 10
9 IF F > .2 THEN 29
10 W$(X, Y) = "#"
11 GOTO 30
20 W$(X,Y) = "P"
21 P1 = X
22 P2 = Y
23 P3 = 1
24 GOTO 30
29 W$(X, Y) = "."
30 NEXT Y
31 NEXT X
32 GOTO 1000
40 INPUT "ENTER A DIRECTION (W,A,S,D)(E TO END)"; D$
41 IF D$ = "W" THEN 100
42 IF D$ = "S" THEN 200
43 IF D$ = "A" THEN 300
44 IF D$ = "D" THEN 400
45 IF D$ = "E" THEN END
46 PRINT "RETRY INPUT"
47 GOTO 40
100 IF P1 - 1 < 0 THEN 103
101 IF W$(P1 - 1, P2) = "#" THEN 103
102 GOTO 105
103 PRINT "OH NO!"
104 GOTO 40
105 W$(P1, P2) = "."
106 W$(P1 - 1, P2) = "P"
107 P1 = P1 - 1
108 GOTO 1000
200 IF P1 + 1 > 40 THEN  203
201 IF W$(P1 + 1, P2) = "#" THEN 203
202 GOTO 205
203 PRINT "OH NO!"
204 GOTO 40
205 W$(P1, P2) = "."
206 W$(P1 + 1, P2) = "P"
207 P1 = P1 + 1
208 GOTO 1000
300 IF P2 - 1 < 0 THEN 303
301 IF W$(P1, P2 - 1) = "#" THEN 303
302 GOTO 305
303 PRINT "OH NO!"
304 GOTO 40
305 W$(P1, P2) = "."
306 W$(P1, P2 - 1) = "P"
307 P2 = P2 - 1
308 GOTO 1000
400 IF P2 + 1 > 80 THEN 403
401 IF W$(P1, P2 + 1) = "#" THEN 403
402 GOTO 405
403 PRINT "OH NO!"
404 GOTO 40
405 W$(P1, P2) = "."
406 W$(P1, P2 + 1) = "P"
407 P2 = P2 + 1
408 GOTO 1000
1000 FOR X1 = 0 TO 40
1001 PRINT: FOR Y1 = 0 TO 80: PRINT W$(X1, Y1);: NEXT Y1
1002 NEXT X1
1003 PRINT
1006 GOTO 40
