package M138;

public class Node {
      int val;
      Node next;
      Node random;

      public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
      }

      public Node(int val, Node next) {
            this.val = val;
            this.next = next;
            this.random = null;
      }

      public void setNext(Node next) {
            this.next = next;
      }

      public void  setRandom(Node random) {
            this.random = random;
      }
  }
