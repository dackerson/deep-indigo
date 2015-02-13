/**
 * Author: David Ackerson
 * File:   QuartoSearchNode.java
 * 
 * QuartoSearchNode is a single node in a QuartoSearchTree.
 */

import java.util.*;

public class QuartoSearchNode {

    public QuartoBoard state;
    public int depth;

    // A measure of how carefully we need to choose the next move.
    // Very low for the first state, very high for states closer to the end
    public int importance;

    public PriorityQueue<QuartoSearchEdge> child_edges;
    public QuartoSearchEdge parent_edge;

    public QuartoSearchNode(QuartoSearchEdge parent_edge) {
        this.parent_edge = parent_edge;
        // TODO
    }

}
