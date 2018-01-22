You are going to write a simple console-style drawing board program.

Functions
The drawing board is very simple so only these functions are supported.

Function	Description
Create canvas	Create new empty canvas (filled with ' ') with given width and height
Draw line / rectangle	Draw the line with 'x' which connects the given points.
If the points are diagonal, a rectangle instead of diagonal line should be drawn
Fill color	Fill the entire area connected to the given point with given character, also known as "bucket fill" in paint programs
Output
Implement the drawCanvas method to return the string contains the entire canvas surrounded by borders with - and |.

Example
Empty canvas 4x2

------
|    |
|    |
------
Drawing 2 lines (0, 2) to (4, 2) and (2, 0) to (2, 4)

-------
|  x  |
|  x  |
|xxxxx|
|  x  |
|  x  |
-------
Drawing a rectangle (1, 1) to (5, 4) and fill with o

---------
|       |
| xxxxx |
| xooox |
| xooox |
| xxxxx |
|       |
---------
Error handling
For any invalid input, raise an error/exception depends on the language.

In Java should throw java.lang.IllegalArgumentException
In JavaScript should throw the string Out of bounds
The data type of the arguments is always valid, no need to do type checks.

Remarks
The drawing board functions should return the object itself to allow method chaining
The coordinates are zero-based, therefore the origin is (0, 0), which is at the top-left corner
The coordinates are inclusive in draw method
If the area is already filled with different color, fill method should do nothing