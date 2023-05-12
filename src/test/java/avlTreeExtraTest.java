import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.uma.ajnebro.AvlTree;

import java.util.Comparator;
import static org.mockito.Mockito.*;

public class avlTreeExtraTest {
    AvlTree<Integer> avlTree;
    Comparator<?> comparator;
    @Before
    public void setUp() throws Exception {
        comparator = mock(Comparator.class);
        avlTree = mock(AvlTree.class);
    }

    @After
    public void tearDown() throws Exception {
        avlTree = null;
        comparator = null;
    }
    @Test
    public void testInsertObjectInTree(){
        //When

        //Then

    }
}
