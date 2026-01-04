import java.util.*;
import java.util.List;
import java.util.ArrayList;

public class uniuqe_BST {
  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
      this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }

  }

  TreeNode root;

  public void insert(int val) {
    root = insert(val, root);
  }

  private TreeNode insert(int val, TreeNode root) {
    if (root == null) {
      return new TreeNode(val);
    }
    if (root.val < val) {
      root.right = insert(val, root.right);
    } else {
      root.left = insert(val, root.left);
    }

    return root;
  }

  public void print() {
    print(root, 0);
  }

  private void print(TreeNode root, int height) {
    if (root == null)
      return;

    print(root.left, height + 1);
    if (height != 0) {
      for (int i = 0; i < height - 1; i++) {
        System.out.print("|   \t");
      }

      System.out.println("|------->" + root.val);
    } else {
      System.out.println(root.val);
    }

    print(root.right, height + 1);

  }

  public void permutation(int n) {
    StringBuilder str = new StringBuilder();
    for (int i = 1; i <= n; i++) {
      str.append(i);
    }

    List<TreeNode> list = new ArrayList();
    permutation("", str.toString(), list);

    for (TreeNode node : list) {
      System.out.println("list - ");
      print(node, 0);
      System.out.println();
    }

  }

  private void permutation(String up, String ori, List<TreeNode> list) {
    if (ori.isEmpty()) {
      root = null;
      for (char ch : up.toCharArray()) {
        insert((int) ch - 48);
      }
      list.add(root);
      return;

    }

    for (int i = 0; i < ori.length(); i++) {
      String first = ori.substring(0, i);
      String last = ori.substring(i + 1);

      permutation(up + ori.charAt(i), first + last, list);
    }

  }
}