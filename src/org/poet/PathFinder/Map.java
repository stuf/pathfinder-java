package org.poet.PathFinder;

public class Map {
  private Node[][] mapNodes;
  private int width;
  private int height;

  /**
   * Create a default map
   */
  public Map () {
    this.width = 10;
    this.height = 5;

    this.createMap();
  }

  /**
   * @param width Map width
   * @param height Map height
   */
  public Map (int width, int height) {
    this.width = width;
    this.height = height;

    this.createMap();
  }

  /**
   * Create the node matrix that represents the map
   */
  private void createMap () {
    this.mapNodes = new Node[height][width];

    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        this.mapNodes[i][j] = new Node(j, i);
      }
    }
  }

  /**
   * Get the specified node from location
   * @param x x-axis
   * @param y y-axis
   * @return Returns node for the specified position
   */
  public Node getNode (int x, int y) {
    return this.mapNodes[y][x];
  }

  /**
   *
   * @return Gets the map's height (1-based)
   */
  public int getHeight () {
    return this.mapNodes.length;
  }

  /**
   *
   * @return Gets the map's width (1-based)
   */
  public int getWidth () {
    return this.mapNodes[0].length;
  }

  /**
   * @return Returns a string representation of this class
   */
  @Override
  public String toString () {
    String map = "";

    for (Node[] mapNodeRow : mapNodes) {
      for (Node n : mapNodeRow) {
        map += n.isWalkable() ? "." : "#";
      }

      map += "\n";
    }

    return map;
  }
}
