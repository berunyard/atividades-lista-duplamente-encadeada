public class NodePessoa {
    public class Node {
        Node next, prev;
        Pessoa pessoa;
    
        public Node(Node next, Node prev, Pessoa pessoa) {
            this.next = next;
            this.prev = prev;
            this.pessoa = pessoa;
        }
    
        public Node(Pessoa pessoa) {
            this.next = null;
            this.prev = null;
            this.pessoa = pessoa;
        }
    
        public void setPessoa(Pessoa pessoa) {
            this.pessoa = pessoa;
        }
    
        public Pessoa getPessoa() {
            return pessoa;
        }
    
        public void setPrev(Node prev) {
            this.prev = prev;
        }
    
        public Node getPrev() {
            return prev;
        }
    
        public void setNext(Node next) {
            this.next = next;
        }
    
        public Node getNext() {
            return next;
        }
    }
    
}
