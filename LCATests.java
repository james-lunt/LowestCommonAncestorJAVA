
import static org.junit.Assert.*;

import org.junit.Test;

public class LCATests {

	  @Test
	    public void testLCA() {
	        BinaryTree tree = new BinaryTree();
          tree.root = new Node(20); 
          tree.root.left = new Node(8); 
          tree.root.right = new Node(22); 
          tree.root.left.left = new Node(4); 
          tree.root.left.right = new Node(12); 
          tree.root.left.right.left = new Node(10); 
          tree.root.left.right.right = new Node(14); 
	        
          
        int n1 = 10, n2 = 14;
        Node t = tree.lca(tree.root, n1, n2);
        int expected = 12;
        int actual = t.data;
        assertEquals("LCA", expected, actual); 

        n1 = 14; 
        n2 = 8; 
        int expected = 8;
        int actual = t.data;
        assertEquals("LCA", expected, actual); 

        n1 = 10; 
        n2 = 22; 
        int expected = 20;
        int actual = t.data;
        assertEquals("LCA", expected, actual); 
	    }
	}