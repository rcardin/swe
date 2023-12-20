package it.unipd.math.swe.patterns.adapter;

public class Rectangle implements Shape {

  private final Point p1;
  private final Point p2;

  public Rectangle(Point p1, Point p2) {
    this.p1 = p1;
    this.p2 = p2;
  }

  public Point getP1() {
    return p1;
  }

  public Point getP2() {
    return p2;
  }

  public static class Point {
    private final double x, y;

    public Point(double x, double y) {
      this.x = x;
      this.y = y;
    }

    public double getX() {
      return x;
    }

    public double getY() {
      return y;
    }
  }
}
