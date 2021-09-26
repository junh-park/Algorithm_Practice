package jun.algorithm.checktreetraversal;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class CheckTreeTraversalTest {

	@Test
	public void check() {
		int N = 5;
		int preorder[] = {1, 2, 4, 5, 3};
		int inorder[] = {4, 2, 5, 1, 3};
		int postorder[] = {4, 5, 2, 3, 1};
		
		assertThat(CheckTreeTraversal.checktree(preorder, inorder, postorder, N), is(true)); ;
	}
}
