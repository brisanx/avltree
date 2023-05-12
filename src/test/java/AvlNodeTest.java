import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.uma.ajnebro.AvlNode;

/**
 * Created with IntelliJ IDEA. User: Antonio J. Nebro Date: 09/07/13 Time: 15:29
 * @author modified by Alba S and Jose T
 */
public class AvlNodeTest {

  private AvlNode<Integer> node;

  @Before
  public void setUp() throws Exception {
    node = new AvlNode<Integer>(5);
  }

  @After
  public void tearDown() throws Exception {
    node = null;
  }

  @DisplayName("check if the node has a left child")
  @Test
  public void testHasLeft() {
    assertFalse("testHasLeft", node.hasLeft());
    AvlNode<Integer> node2 = new AvlNode<Integer>(6);
    node.setLeft(node2);
    assertTrue("testHasLeft", node.hasLeft());
  }
  @DisplayName("check if the node has a right child")
  @Test
  public void testHasRight() {
    assertFalse("testHasRight", node.hasRight());
    AvlNode<Integer> node2 = new AvlNode<Integer>(6);
    node.setRight(node2);
    assertTrue("testHasRight", node.hasRight());
  }

  @DisplayName("set the height of the node correctly")
  @Test
  public void testShouldSetHeight() {
    int expectedHeight = 1000213;
    node.setHeight(expectedHeight);
    assertEquals("Height is different from expected.", expectedHeight, node.getHeight());
  }
  @DisplayName("check if the node has only a right child")
  @Test
  public void testOnlyHaveARightChild(){
    assertFalse("testOnlyHaveARightChild", node.hasOnlyARightChild());
    node.setLeft(new AvlNode<>(2));
    assertFalse("testOnlyHaveARightChild", node.hasOnlyARightChild());

    AvlNode<Integer> newNode = new AvlNode<Integer>(1);
    newNode.setRight(new AvlNode<>(1));

    assertTrue("testOnlyHaveARightChild", newNode.hasOnlyARightChild());
  }
}
