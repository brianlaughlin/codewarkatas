#Build a Car# Ever wondered how it is to build cars? Today you can have a taste of it and build your own, very simplified version of car using your programming skills. We are going to build vehicles like these below:

 ____            __________             ____________
|  []\          |        []\           |[]        []\
-o--o-'         -o-o------o-'          -o-o-o-----o-o'
(Hope that those resemble cars|buses|trucks).

###Short introduction### Single vehicle is built with 3 layers:

first: ' ____' second: | []\ third: -o--o-'

first layer (top), which consists of one space character ' ' and underscores '_';

second layer consists of vertical line (rear) |, empty spaces (filling) ' ', square brackets (doors) [] and a backslash (front) \ ;

third layer consists of dashes (frame) '-', lowercase O letters (axles|wheels) 'o' and one single quote (headlight) "'"

###Problem specification###

Your aim is to implement 'Car' class/constructor. The instance of 'Car' must contain 2 properties/members body and chassis which themselves are objects.

Each instance object (body and chassis) must contain one property called component.

Let's assume that car refers to an instance of Car, then, tests can refer to component properties by: car.chassis.component and car.body.component.

The component properties are of String type, and contain layers of the car. body.component constitutes of first two layers, whereas chassis.componentcontains the last, third layer.

In Java, all these properties/objects have to be public.

The Car constructor takes 2 integer arguments:

length specify length of car (in number of characters). Must be at least 7 characters wide (as the first car above), if not, the Exception | Error must be thrown;
doors specify the number of doors (square brackets) in the second layer. Must be at least 1, if not, the exception must be thrown. Another exception must be thrown when the doors parameter is too big for current car (when we cannot fit that number of doors in given length).
The specified error cases are the only 3 expected (in Java: throw an unchecked exception), therefore the tests will use only positive integers as parameters to Car()

#####Design guidelines#####

    _____________          ______          __________
   |[][]   [][][]\        |[][][]\        |        []\
   -o-o-o-----o-o-'       -o----o-'       -o-o------o-'
As we can see, our Car class is quite flexible in terms of number of axles and doors, and here the following applies.

As the length paramater increases, we want our cars|trucks to keep balance, hence the number of axles has to increase. The third axle has to be added at the length = 12 and the subsequent axles have to be added every time the given length is wider by 2 (next axle at length = 14 and so on) . As the parameter is big enough we add axles once to the rear (left), once to the front (right) part of the car - starting from the rear.

The situation works similarly with doors parameter. We try to fit given number of doors in given length. First door is added to the front, next to the rear, next again to the front.

One final guide,

first layer's length = length - 2
second layer's length = length - 1
third layer's length = length
first and second layers need a line feed character at their end: \n.

Link:
https://www.codewars.com/kata/build-a-car/train/java