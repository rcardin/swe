package it.unipd.math.swe.patterns.adapter;

public class AreaCalculatorAdapter implements Calculator {

  private final AreaCalculator areaCalculator;

  public AreaCalculatorAdapter(AreaCalculator areaCalculator) {
    this.areaCalculator = areaCalculator;
  }

  @Override
  public double area(Shape shape) {

    if (shape instanceof Rectangle) {
      Rectangle rectangle = (Rectangle) shape;
      return areaCalculator.rectangleArea(
          new AreaCalculator.ExtPoint(rectangle.getP1().getX(), rectangle.getP1().getY()),
          new AreaCalculator.ExtPoint(rectangle.getP2().getX(), rectangle.getP2().getY()));
    }

    return 0.0D;
  }
}
