public class ListNode<Object> {
  public ListNode next;
  public Object data;

  public ListNode(Object data) {
    this.data = data;
  }
  public String toString() {
    return "[" + this.data + "]";
  }
}
