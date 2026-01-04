
public class SegmentTree {

  public class Node {

    int value = 0;
    int strIdx;
    int endIdx;

    Node left;
    Node right;

    public Node(int value, int st, int en) {
      this.value = value;
      this.strIdx = st;
      this.endIdx = en;
    }
  }

  private Node root;

  public SegmentTree() {

  }

  public void construct(int arr[]) {
    this.root = construct(arr, 0, arr.length - 1);
  }

  private Node construct(int arr[], int st, int ed) {

    if (st == ed) {
      Node root = new Node(arr[st], st, ed);
      return root;
    }
    int mid = (ed - st) / 2 + st;

    Node left = construct(arr, st, mid);
    Node right = construct(arr, mid + 1, ed);

    root = new Node(left.value + right.value, st, ed);

    root.left = left;
    root.right = right;

    return root;
  }

  public int query(int st, int en) {
    return query(st, en, root);
  }

  private int query(int st, int en, Node root) {

    if (st == root.strIdx && en == root.endIdx)
      return root.value;

    if (en < root.strIdx || st > root.endIdx)
      return 0;
    if (st > root.strIdx && en < root.endIdx)
      return (query(st, en, root.left) + query(st, en, root.right));

    System.out.println("one ");
    return 0;

  }

  public void update(int idx, int value) {
    update(idx, value, root);

  }

  public void update(int idx, int value, Node root) {
    if (root == null)
      return;

    if (idx == root.strIdx && idx == root.endIdx) {
      root.value = value;
      return;
    }

    if (idx < root.strIdx || idx > root.endIdx)
      return;
    else {
      update(idx, value, root.left);
      update(idx, value, root.right);

      root.value = root.left.value + root.right.value;
      return;
    }

  }

  public void print() {
    print(root, 0);
    System.out.println();
  }

  private void print(Node root, int height) {
    if (root == null)
      return;

    print(root.left, height + 1);
    if (height != 0) {
      for (int i = 0; i < height - 1; i++) {
        System.out.print("|   \t");
      }

      System.out.println("|------->" + root.value + "[" + root.strIdx + "-" + root.endIdx + "]");
    } else {
      System.out.println(root.value + " " + root.strIdx + " -- " + root.endIdx);
    }

    print(root.right, height + 1);

  }
}