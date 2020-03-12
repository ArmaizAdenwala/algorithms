class LinkedList<Object> {
  private ListNode<Object> first;

  public LinkedList() {
    this.first = null;
  }

  public void add(Object data) {
    ListNode<Object> newNode = new ListNode(data);
    ListNode<Object> lastNode = getLastNode(this.first);

    if (lastNode == null) {
      this.first = newNode;
    } else {
      lastNode.next = newNode;
    }
  }

  public void add(Object data, int index) {
    ListNode<Object> node = getNodeAtIndex(this.first, index);
    if (node != null) {
      node.data = data;
    }
  }

  public Object get(int index) {
    ListNode<Object> node = getNodeAtIndex(this.first, index);
    if (node == null) {
      return null;
    }
    return node.data;
  }

  public String toString() {
    return toStringHelper(this.first);
  }

  private String toStringHelper(ListNode<Object> node) {
    if (node == null) {
      return "empty";
    } else if (node.next == null) {
      return "[" + node.data + "]";
    }
    return "[" + node.data + "] -> " + toStringHelper(node.next);
  }

  private ListNode<Object> getNodeAtIndex(ListNode<Object> node, int index) {
    if (index < 0 || node == null) {
      return null;
    } else if (index == 0) {
      return node;
    }
    return getNodeAtIndex(node.next, index - 1);
  }

  private ListNode<Object> getLastNode(ListNode<Object> node) {
    if (node != null && node.next != null) {
      return getLastNode(node.next);
    }
    return node;
  }
}

