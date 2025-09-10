/* Welcome to lesson 1, for this assignment you need to find the area of a square and a triangle 
 */

 public class Assignment1Solution {
        public static void main(String[] args) {
            int squareSide = 4;

            int triangleBase = 4;
            int triangleHeight = 3;

            //continue from here and use division to find the triangles area ((b*h)/2)
            
            int squareArea = squareSide * squareSide;
            System.out.println("The area of the square is: " + squareArea);
            
            int triangleArea = ((triangleBase * triangleHeight)/2);
            System.out.println("The area of the triangle is: " + triangleArea);
        }
 }