## Build and Run
## test script
maven test

## build script
maven clean package

## running script
java -jar {your-local-target-path}/TicTacToe-1.0-SNAPSHOT.jar

#### input parameter is all from cmd scanner

Here is an example:

```
Game start...X first
example: 1,1
[ ][ ][ ]
[ ][ ][ ]
[ ][ ][ ]
User X Pls tic the position: 
1,1
[ ][ ][ ]
[ ][X][ ]
[ ][ ][ ]
User O Pls tic the position: 
0,0
[O][ ][ ]
[ ][X][ ]
[ ][ ][ ]
User X Pls tic the position: 
0,1
[O][X][ ]
[ ][X][ ]
[ ][ ][ ]
User O Pls tic the position: 
2,1
[O][X][ ]
[ ][X][ ]
[ ][O][ ]
User X Pls tic the position: 
0,2
[O][X][X]
[ ][X][ ]
[ ][O][ ]
User O Pls tic the position: 
2,0
[O][X][X]
[ ][X][ ]
[O][O][ ]
User X Pls tic the position: 
1,0
[O][X][X]
[X][X][ ]
[O][O][ ]
User O Pls tic the position: 
1,2
[O][X][X]
[X][X][O]
[O][O][ ]
User X Pls tic the position: 
2,2
[O][X][X]
[X][X][O]
[O][O][X]
No winner for this game
```