package org.poet.PathFinder;

public class Node {
  private Point position;
  private boolean walkable;

  /**
   *
   * @param position Location of the node in the map
   */
  public Node (Point position) {
    this.position = position;
    this.walkable = true;
  }

  /**
   *
   * @param position Location of the node in the map
   * @param walkable Is the node walkable or not
   */
  public Node (Point position, boolean walkable) {
    this.position = position;
    this.walkable = walkable;
  }

  /**
   *
   * @param x Node's location in the x-axis
   * @param y Node's location in the y-axis
   */
  public Node (int x, int y) {
    this.position = new Point(x, y);
    this.walkable = true;
  }

  /**
   * @param x Node's location in the x-axis
   * @param y Node's location in the y-axis
   * @param walkable Whether the node is walkable or not
   */
  public Node (int x, int y, boolean walkable) {
    this.position = new Point(x, y);
    this.walkable = walkable;
  }

  public Point getPosition() {
    return position;
  }

  public void setPosition(Point position) {
    this.position = position;
  }

  @Override
  public String toString() {
    return "Node{" +
        "position=" + position +
        ", walkable=" + walkable +
        '}';
  }

  public boolean isWalkable() {
    return walkable;
  }

  public void setWalkable(boolean walkable) {
    this.walkable = walkable;
  }
}
