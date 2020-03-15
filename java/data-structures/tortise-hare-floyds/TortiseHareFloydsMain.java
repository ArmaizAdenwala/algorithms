class TortiseHareFloyds {
  public static void main(String[] args) {
    ListNode<Integer> node = buildLinkedList(false);
    ListNode<Integer> nodeLoop = buildLinkedList(true);
    System.out.println(isCycle(node));
    System.out.println(isCycle(nodeLoop));
  }

  private static ListNode<Integer> buildLinkedList(boolean loop) {
    ListNode<Integer> node1 = new ListNode(1);
    ListNode<Integer> node2 = new ListNode(2);
    ListNode<Integer> node3 = new ListNode(3);
    ListNode<Integer> node4 = new ListNode(4);
    ListNode<Integer> node5 = new ListNode(5);
    ListNode<Integer> node6 = new ListNode(6);

    node1.next = node2;
    node2.next = node3;
    node3.next = node4;
    node4.next = node5;
    node5.next = node6;
    if (loop) {
      node6.next = node3;
    }
    return node1;
  }

  private static boolean isCycle(ListNode<Integer> node) {
    ListNode<Integer> slow = node;
    ListNode<Integer> fast = node;
    while(fast != null && fast.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow.data == fast.data) {
        return true;
      }
    }
    return false;
  }
}

