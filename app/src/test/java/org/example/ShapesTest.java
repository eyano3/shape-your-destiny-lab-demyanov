package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShapesTest {
  private static final double DELTA = 0.000001;

  @Test
  public void circleWithZeroRadiusHasZeroArea() {
    Circle circle = new Circle(0);

    assertEquals(0, circle.getArea(), DELTA);
  }

  @Test
  public void circleWithZeroRadiusHasZeroPerimeter() {
    Circle circle = new Circle(0);

    assertEquals(0, circle.getPerimeter(), DELTA);
  }

  @Test
  public void circleWithRadiusOneHasCorrectArea() {
    Circle circle = new Circle(1);

    assertEquals(Math.PI, circle.getArea(), DELTA);
  }

  @Test
  public void circleWithRadiusOneHasCorrectPerimeter() {
    Circle circle = new Circle(1);

    assertEquals(2 * Math.PI, circle.getPerimeter(), DELTA);
  }

  @Test
  public void circleWithLargerRadiusHasCorrectArea() {
    Circle circle = new Circle(5);

    assertEquals(25 * Math.PI, circle.getArea(), DELTA);
  }

  @Test
  public void circleWithLargerRadiusHasCorrectPerimeter() {
    Circle circle = new Circle(5);

    assertEquals(10 * Math.PI, circle.getPerimeter(), DELTA);
  }

  @Test
  public void rectangleWithZeroLengthHasZeroArea() {
    Rectangle rectangle = new Rectangle(0, 4);

    assertEquals(0, rectangle.getArea(), DELTA);
  }

  @Test
  public void rectangleWithZeroLengthHasCorrectPerimeter() {
    Rectangle rectangle = new Rectangle(0, 4);

    assertEquals(8, rectangle.getPerimeter(), DELTA);
  }

  @Test
  public void rectangleWithOneByOneDimensionsHasCorrectArea() {
    Rectangle rectangle = new Rectangle(1, 1);

    assertEquals(1, rectangle.getArea(), DELTA);
  }

  @Test
  public void rectangleWithOneByOneDimensionsHasCorrectPerimeter() {
    Rectangle rectangle = new Rectangle(1, 1);

    assertEquals(4, rectangle.getPerimeter(), DELTA);
  }

  @Test
  public void rectangleWithLargerDimensionsHasCorrectArea() {
    Rectangle rectangle = new Rectangle(6, 8);

    assertEquals(48, rectangle.getArea(), DELTA);
  }

  @Test
  public void rectangleWithLargerDimensionsHasCorrectPerimeter() {
    Rectangle rectangle = new Rectangle(6, 8);

    assertEquals(28, rectangle.getPerimeter(), DELTA);
  }

  @Test
  public void rectangleHasFourSides() {
    Rectangle rectangle = new Rectangle(6, 8);

    assertEquals(4, rectangle.numberOfSides());
  }

  @Test
  public void rectangleCanBeUsedAsPolygon() {
    Polygon polygon = new Rectangle(6, 8);

    assertEquals(4, polygon.numberOfSides());
  }

  @Test
  public void rightTriangleWithZeroLengthHasZeroArea() {
    RightTriangle triangle = new RightTriangle(0, 4);

    assertEquals(0, triangle.getArea(), DELTA);
  }

  @Test
  public void rightTriangleWithZeroLengthHasCorrectPerimeter() {
    RightTriangle triangle = new RightTriangle(0, 4);

    assertEquals(8, triangle.getPerimeter(), DELTA);
  }

  @Test
  public void rightTriangleWithOneByOneLegsHasCorrectArea() {
    RightTriangle triangle = new RightTriangle(1, 1);

    assertEquals(0.5, triangle.getArea(), DELTA);
  }

  @Test
  public void rightTriangleWithOneByOneLegsHasCorrectPerimeter() {
    RightTriangle triangle = new RightTriangle(1, 1);

    assertEquals(2 + Math.sqrt(2), triangle.getPerimeter(), DELTA);
  }

  @Test
  public void rightTriangleWithThreeFourFiveDimensionsHasCorrectArea() {
    RightTriangle triangle = new RightTriangle(3, 4);

    assertEquals(6, triangle.getArea(), DELTA);
  }

  @Test
  public void rightTriangleWithThreeFourFiveDimensionsHasCorrectPerimeter() {
    RightTriangle triangle = new RightTriangle(3, 4);

    assertEquals(12, triangle.getPerimeter(), DELTA);
  }

  @Test
  public void rightTriangleHasThreeSides() {
    RightTriangle triangle = new RightTriangle(3, 4);

    assertEquals(3, triangle.numberOfSides());
  }

  @Test
  public void rightTriangleCanBeUsedAsPolygon() {
    Polygon polygon = new RightTriangle(3, 4);

    assertEquals(3, polygon.numberOfSides());
  }

  @Test
  public void squareWithZeroSideLengthHasZeroArea() {
    Square square = new Square(0);

    assertEquals(0, square.getArea(), DELTA);
  }

  @Test
  public void squareWithZeroSideLengthHasZeroPerimeter() {
    Square square = new Square(0);

    assertEquals(0, square.getPerimeter(), DELTA);
  }

  @Test
  public void squareWithSideLengthOneHasCorrectArea() {
    Square square = new Square(1);

    assertEquals(1, square.getArea(), DELTA);
  }

  @Test
  public void squareWithSideLengthOneHasCorrectPerimeter() {
    Square square = new Square(1);

    assertEquals(4, square.getPerimeter(), DELTA);
  }

  @Test
  public void squareWithLargerSideLengthHasCorrectArea() {
    Square square = new Square(7);

    assertEquals(49, square.getArea(), DELTA);
  }

  @Test
  public void squareWithLargerSideLengthHasCorrectPerimeter() {
    Square square = new Square(7);

    assertEquals(28, square.getPerimeter(), DELTA);
  }

  @Test
  public void squareHasFourSides() {
    Square square = new Square(7);

    assertEquals(4, square.numberOfSides());
  }

  @Test
  public void squareCanBeUsedAsPolygon() {
    Polygon polygon = new Square(7);

    assertEquals(4, polygon.numberOfSides());
  }

  @Test
  public void squareCanBeUsedAsRectangle() {
    Rectangle rectangle = new Square(7);

    assertEquals(49, rectangle.getArea(), DELTA);
    assertEquals(28, rectangle.getPerimeter(), DELTA);
    assertEquals(4, rectangle.numberOfSides());
  }

  @Test
  public void isocelesRightTriangleWithZeroLegLengthHasZeroArea() {
    IsocelesRightTriangle triangle = new IsocelesRightTriangle(0);

    assertEquals(0, triangle.getArea(), DELTA);
  }

  @Test
  public void isocelesRightTriangleWithZeroLegLengthHasZeroPerimeter() {
    IsocelesRightTriangle triangle = new IsocelesRightTriangle(0);

    assertEquals(0, triangle.getPerimeter(), DELTA);
  }

  @Test
  public void isocelesRightTriangleWithLegLengthOneHasCorrectArea() {
    IsocelesRightTriangle triangle = new IsocelesRightTriangle(1);

    assertEquals(0.5, triangle.getArea(), DELTA);
  }

  @Test
  public void isocelesRightTriangleWithLegLengthOneHasCorrectPerimeter() {
    IsocelesRightTriangle triangle = new IsocelesRightTriangle(1);

    assertEquals(2 + Math.sqrt(2), triangle.getPerimeter(), DELTA);
  }

  @Test
  public void isocelesRightTriangleWithLargerLegLengthHasCorrectArea() {
    IsocelesRightTriangle triangle = new IsocelesRightTriangle(6);

    assertEquals(18, triangle.getArea(), DELTA);
  }

  @Test
  public void isocelesRightTriangleWithLargerLegLengthHasCorrectPerimeter() {
    IsocelesRightTriangle triangle = new IsocelesRightTriangle(6);

    assertEquals(12 + Math.sqrt(72), triangle.getPerimeter(), DELTA);
  }

  @Test
  public void isocelesRightTriangleHasThreeSides() {
    IsocelesRightTriangle triangle = new IsocelesRightTriangle(6);

    assertEquals(3, triangle.numberOfSides());
  }

  @Test
  public void isocelesRightTriangleCanBeUsedAsPolygon() {
    Polygon polygon = new IsocelesRightTriangle(6);

    assertEquals(3, polygon.numberOfSides());
  }

  @Test
  public void isocelesRightTriangleCanBeUsedAsRightTriangle() {
    RightTriangle triangle = new IsocelesRightTriangle(6);

    assertEquals(18, triangle.getArea(), DELTA);
    assertEquals(12 + Math.sqrt(72), triangle.getPerimeter(), DELTA);
    assertEquals(3, triangle.numberOfSides());
  }

  @Test
  public void circleCanBeUsedAsShape() {
    Shape shape = new Circle(5);

    assertEquals(25 * Math.PI, shape.getArea(), DELTA);
    assertEquals(10 * Math.PI, shape.getPerimeter(), DELTA);
  }

  @Test
  public void rectangleCanBeUsedAsShape() {
    Shape shape = new Rectangle(6, 8);

    assertEquals(48, shape.getArea(), DELTA);
    assertEquals(28, shape.getPerimeter(), DELTA);
  }

  @Test
  public void rightTriangleCanBeUsedAsShape() {
    Shape shape = new RightTriangle(3, 4);

    assertEquals(6, shape.getArea(), DELTA);
    assertEquals(12, shape.getPerimeter(), DELTA);
  }

  @Test
  public void squareCanBeUsedAsShape() {
    Shape shape = new Square(7);

    assertEquals(49, shape.getArea(), DELTA);
    assertEquals(28, shape.getPerimeter(), DELTA);
  }

  @Test
  public void isocelesRightTriangleCanBeUsedAsShape() {
    Shape shape = new IsocelesRightTriangle(6);

    assertEquals(18, shape.getArea(), DELTA);
    assertEquals(12 + Math.sqrt(72), shape.getPerimeter(), DELTA);
  }
}
