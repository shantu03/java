import java.security.PublicKey;

class BST {
  public class Node {
    private int value;
    private Node left;
    private Node right;
    private int height;

    public Node(int value) {
      this.value = value;
    }

    public int getValue() {
      return value;
    }

    public int getHeight() {
      return root.height;
    }

    public Node getLeft() {
      return root.left;
    }
  }

  public Node getRoot() {
    return root;
  }

  private Node root;

  public BST() {

  }

  public int height(Node node) {
    if (node == null) {
      return -1;
    }
    return node.height;
  }

  public boolean isEmpty() {
    return root == null;
  }

  public void insert(int value) {
    root = insert(value, root);
  }

  private Node insert(int value, Node node) {
    if (node == null) {
      node = new Node(value);
      return node;
    }

    if (value < node.value) {
      node.left = insert(value, node.left);
    }

    if (value > node.value) {
      node.right = insert(value, node.right);
    }

    node.height = Math.max(height(node.left), height(node.right)) + 1;
    return rotate(node);

  }

  public Node leftRotate(Node node) {
    if (node == null)
      return node;

    Node temp = node.right;
    node.right = temp.left;
    temp.left = node;
    node.height = Math.max(height(node.left), height(node.right)) + 1;
    temp.height = Math.max(height(temp.left), height(temp.right)) + 1;
    return temp;

  }

  public Node rightRotate(Node node) {

    if (node == null)
      return node;
    Node temp = node.left;
    node.left = temp.right;
    temp.right = node;
    node.height = Math.max(height(node.left), height(node.right)) + 1;
    temp.height = Math.max(height(temp.left), height(temp.right)) + 1;

    return temp;

  }

  public Node rotate(Node node) {
    if (height(node.left) - height(node.right) > 1) {
      // left heavy
      if (height(node.left.left) - height(node.left.right) > 0) {
        // left left case
        return rightRotate(node);
      }
      if (height(node.left.left) - height(node.left.right) < 0) {
        // left right case
        node.left = leftRotate(node.left);
        return rightRotate(node);
      }
    }

    if (height(node.left) - height(node.right) < -1) {
      // right heavy
      if (height(node.right.left) - height(node.right.right) < 0) {
        // right right case
        return leftRotate(node);
      }
      if (height(node.right.left) - height(node.right.right) > 0) {
        // left right case
        node.right = rightRotate(node.right);
        return leftRotate(node);
      }
    }

    return node;
  }

  public void populate(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      this.insert(nums[i]);
    }
  }

  public void populatedSorted(int[] nums) {
    populatedSorted(nums, 0, nums.length);
  }

  private void populatedSorted(int[] nums, int start, int end) {
    if (start >= end) {
      return;
    }

    int mid = (start + end) / 2;

    this.insert(nums[mid]);
    populatedSorted(nums, start, mid);
    populatedSorted(nums, mid + 1, end);
  }

  public boolean balanced() {
    return balanced(root);
  }

  private boolean balanced(Node node) {
    if (node == null) {
      return true;
    }
    return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
  }

  public void display() {
    display(this.root, "Root Node: ");
  }

  private void display(Node node, String details) {
    if (node == null) {
      return;
    }
    System.out.println(details + node.value);
    display(node.left, "Left child of " + node.value + " : ");
    display(node.right, "Right child of " + node.value + " : ");
  }

  public void print() {
    print(root, 0);
  }

  private void print(Node root, int height) {
    if (root == null)
      return;

    print(root.left, height + 1);
    if (height != 0) {
      for (int i = 0; i < height - 1; i++) {
        System.out.print("|   \t");
      }

      System.out.println("|------->" + root.value);
    } else {
      System.out.println(root.value);
    }

    print(root.right, height + 1);

  }
}