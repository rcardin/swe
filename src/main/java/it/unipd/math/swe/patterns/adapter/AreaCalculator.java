package it.unipd.math.swe.patterns.adapter;

public final class AreaCalculator {

  public double rectangleArea(ExtPoint upper, ExtPoint lower) {
    // Calculate the area of a rectangle given the coordinates of the upper left and lower right
    return 0.0D;
  }

  public static class ExtPoint {
    private final double x, y;

    public ExtPoint(double x, double y) {
      this.x = x;
      this.y = y;
    }
  }
}
