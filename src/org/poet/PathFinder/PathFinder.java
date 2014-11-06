package org.poet.PathFinder;

public class PathFinder {
  private Map map;
  private Point start;
  private Point end;

  /**
   *
   * @param map Map to perform path finding on
   */
  public PathFinder (Map map) {
    this.map = map;
  }

  /**
   *
   * @param start Findable path's start point
   * @param end Findable path's end point
   */
  public PathFinder (Point start, Point end) {
    this.start = start;
    this.end = end;
  }
}
