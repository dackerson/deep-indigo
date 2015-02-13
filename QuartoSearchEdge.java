/**
 * Author: David Ackerson
 * File:   QuartoSearchEdge.java
 * 
 * QuartoSearchEdge is an edge between a parent QuartoSearchNode and a child QuartoSearchNode in a QuartoSearchTree.
 */

import java.util.*;

public class QuartoSearchEdge {

    public QuartoSearchNode parent;
    public QuartoSearchNode child;
    public QuartoMove move;

    public QuartoSearchEdge(QuartoSearchNode parent) {
        this.parent = parent;
        // TODO generate child node from move and parent's state
    }

}
