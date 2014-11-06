package org.poet.PathFinder;

/**
 * @author Stefan Rimaila <stefan.rimaila@gmail.com>
 * @version 0.0.2
 */
public class Map {
  private Node[][] mapNodes;

  public Map () {
    int width = 10;
    int height = 5;

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
