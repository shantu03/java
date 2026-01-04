// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {

  Stack<Integer> stack1;
  Stack<Integer> stack2;

  public Main() {
    stack1 = new Stack<Integer>();
    stack2 = new Stack<Integer>();
  }

  public static void main(String[] args) {

    // bt tree = new bt(5);
    // tree.insert(3);
    // tree.insert(2);
    // tree.insert(1);
    // tree.insert(4);
    // tree.insert(12);
    // // tree.insert(13);
    // tree.insert(7);
    // tree.insert(6);
    // tree.insert(8);

    // tree.print();

    // BST tree = new BST();
    // int[] nums = { 5, 2, 7, 1, 4, 6, 19, 18, 13, 10, 20, 26, 30 };
    // tree.populate(nums);
    // tree.populatedSorted(nums);

    // bt tree2 = new bt();
    // tree2.populate(new Scanner(System.in));

    // tree2.inOrder();
    // System.out.println();
    // tree2.preOrder();
    // System.out.println();
    // tree2.postOrder();

    // Main q = new Main();
    // List<Integer> a = new ArrayList<Integer>();
    // a.add(2);
    // a.add(2);
    // a.add(2);
    // a.add(2);
    // a.add(5);

    // List<Integer> b = new ArrayList<Integer>();

    // uniuqe_BST tree3 = new uniuqe_BST();
    // tree3.permutation(3);
    // b.add(5);
    // b.add(1);
    // b.add(1);
    // b.add(1);
    // b.add(1);
    // b.add(1);

    SegmentTree tree4 = new SegmentTree();

    tree4.construct(new int[] { 3, 6, -1, 5, -7, 3, 19 });
    tree4.print();

    // tree4.update(6, -7);

    tree4.print();

    System.out.println(tree4.query(2,4));

    // temp t = new temp(a, b);
    // System.out.println(t.twoStacks(10, a, b));

    // System.out.println(t.rec(new Stack<Integer>(), 10, 0));

  }

  public boolean offer(int k) {
    stack1.push(k);
    return true;
  }

  public int poll() {

    while (stack1.size() > 1) {
      stack2.push(stack1.pop());
    }
    int k = stack1.pop();
    while (!stack2.isEmpty()) {
      stack1.push(stack2.pop());
    }
    return k;

  }
  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
}