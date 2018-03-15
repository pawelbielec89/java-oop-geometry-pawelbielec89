# The story
Do you love geometry? Our young friend Zigy (Zygfryd) loves it too. Unfortunately it's one-sided love. He's studying hard for his high-school exam, but with minor success. You've got to help him!

But how?

You'll write an Object Oriented Java Application to teach him geometry. Don't worry! Our Finnish software architect Linus Coolvalds has already created a boilerplate for you. However he forgot to create a UML class diagram. You have to do it for him.


# Requirements
In order to help Zigy you have to:
- [ ] Implement all classes in `shapes` and `containers` packages
- [ ] Implement `Main` class.
- [ ] You are allowed to implement your own classes. Remember about clean code.
- [ ] Explain why Linus designed some methods to be static methods instead of instance methods.
- [ ] Remember about comments.
- [ ] Add UML.png file containing UML class diagram of classes from `shapes` and `containers` packages
- [ ] Focus most on the OOP not the ui.

Hint: you can reuse code from the previous assignments.

# Specifications
Here you can find information what you have to implement.

## Main.java
This is the main entrance of the program.   
The program allows user to create and add shapes to a list and do some things with it.

Running `Main` should show this menu:
~~~
Learn Geometry.
  What do you want to do?
  (1) Add new shape
  (2) Show all shapes
  (3) Show shape with the largest perimeter
  (4) Show shape with the largest area
  (5) Show formulas
  (0) Exit program
~~~


### Features
As you can see the program has 5 features.

#### 1. Add new shape
This feature allows user to add new shape to shapes list. User should be able to choose what kind of shapes he/she wants to add. Then he/she should specify attributes that a given shape requires.

#### 2. Show all shapes
This feature should print table containing all shapes added to the list. Take a look at class `ShapeList`, method `getShapesTable()`

#### 3. Show shape with the largest perimeter
This feature prints shape with the largest perimeter from a list.  

#### 4. Show shape with the largest area
This feature prints shape with the largest area from a list.

#### 5. Show formulas
This feature should allow user to choose shape type and print it's formulas (perimeter, area).

## Classes
This is the most important part of this assignment. You've got to implement all of them in `shapes` and `containers` packages in their own files.

### Shape Class
This is a so called _abstract class_. It means that we don't create instances of it. We only use it as a parent class for other concrete classes. This parent is a boilerplate for it's children. It contains attributes and methods that should be implemented in child classes.

#### Instance methods

##### ```double getArea()```
Returns the area of the shape.
##### ```double getPerimeter()```
Returns the perimeter of the shape.
##### ```String toString()```
Returns information about given shape as string.

#### Static methods
##### ```boolean checkIfArgsGreaterThanZero(float... args)```
That method should be used in constructor of each specific shape. Returns true if any of args are greater than 0. Should raise `IllegalArgumentException` if any of the parameters is 0 or less (e.g. circle with negative radius doesn't exist).
##### ```String getAreaFormula()```
Returns formula for the area of the shape as a string.
##### ```String getPerimeterFormula()```
Returns formula for the perimeter of the shape.

Why these methods should be static methods? Edit this readme and give answer below:  
...........................

### Circle Class
This class represents circle shape.   
![alt](http://img.sparknotes.com/figures/4/4952adc59740c12b78738934e639a08a/circle.gif "Circle")
#### Parent class
Shape
#### Attributes
* `r`
  * data_type: float
  * description: circle radius length

#### Methods
`Circle(float r)` - constructor of the Cricle

Override (implement) other methods inherited from the parent class.  
Required formulas:
Perimeter = 2×π×r
Area = π×r<sup>2</sup>  

### Triangle Class
This class represents triangle shape.  
![alt](http://mathworld.wolfram.com/images/eps-gif/Triangle_700.gif "Triangle")
#### Parent class
Shape
#### Attributes
* `a`
  * data_type: float
  * description: one side's length of a triangle
* `b`
  * data_type: float
  * description: second side's length of a triangle
* `c`
  * data_type: float
  * description: third side's length of a triangle

#### Methods
`Triangle(float a, float b, float c)` - constructor of the Triangle

Override (implement) methods inherited from the parent class.     
Required formulas:  
Perimeter = a + b + c  
Area = sqrt(s(s-a)(s-b)(s-c)),  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; where s = (a+b+c)/2  
<sup>[Heron's Formula](https://en.wikipedia.org/wiki/Heron's_formula)</sup>

### Equilateral triangle Class
This is a triangle that has all sides equal.  
![alt](http://mathworld.wolfram.com/images/eps-gif/EquilateralTriangle_1000.gif "Equilateral triangle")
#### Parent class
Triangle
#### Attributes
Hint: check if you can reuse attributes from the parent class
* `a`
  * data_type: float
  * description: side's length of a triangle

#### Methods
`EquilateralTriangle(float a)` - constructor of the Equilateral Triangle

Decide on your own if you have to override inherited methods.

### Rectangle Class
This class represents rectangle shape.  
![alt](http://www.numberempire.com/shapes/images/rectangle_main.png "Rectangle")
##### Parent class
Shape
#### Attributes
* `a`
  * data_type: float
  * description: one side length
* `b`
  * data_type: float
  * description: second side length

#### Methods
`Rectangle(float a, float b)` - constructor of the Rectangle

Override (implement) other methods inherited from the parent class.      
Required formulas:  
Perimeter = 2a + 2b  
Area = a×b

### Square Class
This is a rectangle that has all sides equal.  
![alt](http://mathworld.wolfram.com/images/eps-gif/Square_1000.gif "Square")

#### Parent class
Rectangle
#### Attributes
Hint: check if you can reuse attributes from the parent class
* `a`
  * data_type: float
  * description: side's length of the square

#### Methods
`Square(float a)` - constructor of the Square

Decide on your own if you have to override inherited methods.

### Regular pentagon Class
This is a shape with 5 sides. All sides are of the same length.  
![alt](http://www.zdamy.pl/data/mat/planimetria/polepieciokata/rys1.gif "Regular pentagon")
#### Parent class
Shape
#### Attributes
* `a`
  * data_type: float
  * description: side's length of the pentagon

#### Methods
`RegularPentagon(float a)` - constructor of the RegularPentagon

Override (implement) other methods inherited from the parent class.      
Required formulas:  
Perimeter = 5a  
Area = (a<sup>2</sup> sqrt(5(5+2sqrt(5))))/4 (see image above)

### ShapeList Class
This class is meant to hold geometrical shapes (objects that inherit from Shape class).
#### Attributes
* `shapes`
  * data_type: list
  * description: list of Shape objects

#### Methods
##### `ShapeList()`
Constructs ShapeList object

##### `addShape(Shape shape)`
Adds shape to shapes list. This method should check if shape's has Shape class as it's ancestor. If not it should raise `TypeError`. Hint: check `isinstance` function. (This is a good example of so called _polymorphism_)
######  Arguments
* `shape`
  * data_type: Shape
  * description: object to be added to the shapes list

##### `String getShapesTable()`
This method returns shapes list as string formatted into table. This is sample output:  
~~~
 /------------------------------------------------------------------------------------------------------\
 |  idx   |       Class    |       toString       |   Perimeter  |   Formula   |   Area    |  Formula   |
 |--------|----------------|----------------------|--------------|-------------|-----------|------------|
 |   0    |      Circle    |    Circle, r = 3     |     18.85    |     2×π×r   |   28.27   |   π×r^2    |
 |--------|----------------|----------------------|--------------|-------------|-----------|------------|
 |   1    |      Square    |    Square, a = 2     |      8.00    |      4×a    |    4.00   |    a^2     |
 \------------------------------------------------------------------------------------------------------/
~~~
###### Return value
`String` object

##### `getLargestShapeByPerimeter()`
Returns shape with largest perimeter. Hint: have a look at [comparison methods]( )
###### Return value
`Shape` object

##### `getLargestShapeByArea()`
Returns shape with largest area. Hint: have a look at [comparison methods]( )
###### Return value
`Shape` object


# Extra
If you've fulfilled all the basic requirements and you're ambitious enough to continue, here's idea what you can do.

Help Zigy even more and implement quiz feature. This feature should generate random shape. Tell the user the type of shape and it's attributes. The user should calculate the perimeter and area. The program should check users answer.

Visualize shapes using [turtle]() library.

You can also add more shapes to the geometry class.
