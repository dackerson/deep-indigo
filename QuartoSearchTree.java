/**
 * Author: David Ackerson
 * File:   QuartoSearchTree.java
 * 
 * QuartoSearchTree is a minimax model for the game Quarto
 */

import java.util.*;

public class QuartoSearchTree {

    public QuartoSearchNode root;

    public QuartoSearchTree() {
        root = new QuartoSearchNode(new QuartoBoard());
    }

}
