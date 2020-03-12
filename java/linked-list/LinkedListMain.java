class LinkedListMain {
  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList();
    System.out.println(list);
    list.add(1);
    System.out.println(list);
    list.add(2);
    System.out.println(list);
    list.add(3);
    System.out.println(list);
    System.out.println(list.get(0));
    System.out.println(list.get(1));
    System.out.println(list.get(2));
    System.out.println(list.get(3));
    System.out.println(list.get(-1));

    list.add(123, 2);
    System.out.println(list);
    System.out.println(list.get(2));
  }
}
