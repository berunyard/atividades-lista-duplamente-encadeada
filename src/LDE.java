import java.util.Objects;

public class LDE {
    Node head, tail;
    int size;

    public boolean isEmpty() {
        return this.head == null && this.tail == null && this.size == 0;
    }

    // ADD FIRST: condição n1 - adicionar qdo a lista estiver vazia.
    // else (regra geral).

    public void addFirst(Integer value) {
        Node newNode = new Node(value); // vai ser adicionado ao início.

        if (this.isEmpty()) {
            this.head = newNode;
            this.tail = newNode;
            // System.out.println("Valor adicionado com sucesso ao início da lista.");
        }
        // senão, tenho que fazer o primeiro apontar pro segundo.
        else {
            // para o novo node entrar no ínicio da lista, ele precisa apontar pra head.
            // a head irá apontar de volta para o new node.
            newNode.setNext(head);
            this.head.setPrev(newNode);
            this.head = newNode; // o novo node passa a ser a head.
            // System.out.println("Valor adicionado com sucesso ao início da lista.");
        }
        this.size++; // incrementa o tamanho da lista :)
    }

    public void addLast(Integer value) {
        Node newNode = new Node(value);

        if (this.isEmpty()) {
            this.tail = newNode;
            this.head = newNode;
            System.out.println("Valor adicionado com sucesso ao final da lista.");
        }
        // mesmo esquema, só que no final da lista.
        else {
            newNode.setPrev(tail);
            this.tail.setNext(newNode);
            this.tail = newNode; // o novo node passa a ser a tail.
            System.out.println("Valor adicionado com sucesso ao final da lista.");
        }
        this.size++;
    }

    public int qtdNodes() {
        return this.size; // retorna a qtd de nós (tamanho/size da LDE).
    }

    public Node search(Integer value) {
        Node aux = this.head;

        while (aux != null) { // (ou aux.getNext() != null)?
            // percorre a lista enquanto o prox valor for diferente de 0.
            if (Objects.equals(aux.getValue(), value)) {
                // (aux.getValue() == value)
                System.out.println("O valor procurado '" + value + "' está na lista.");
                return aux;
            }
            aux = aux.getNext(); // percorre o while
            // ex.: o aux vai ser diferente de null, então ele vai entrar no loop onde ele
            // vai ser o prox dele mesmo.
        }
        System.out.println("O valor procurado '" + value + "' não foi encontrado na lista.");
        return null; // não encontrou o valor na lista.
    }

    public void delete(Integer value) {
        // se a lista estiver vazia,
        // deletar a head,
        // deletar a tail,
        // deletar outro item.
        Node aux = search(value);

        if (this.isEmpty()) {
            System.out.println("Lista vazia. Impossível deletar.");
            return;
        } else if (aux == this.head) {
            head = head.getNext(); // head passa para a próxima posição
            head.setPrev(null); // deleta a posição anterior a head
        } else if (aux == this.tail) {
            tail = tail.getPrev(); // tail passa para a posição anterior
            tail.setNext(null); // deleta a posição a frente a tail
        } else {
            Node ant = aux.getPrev();
            Node prox = aux.getNext();
            ant.setNext(prox);
            prox.setPrev(ant);
        }
        this.size--;
    }

    public void deleteDuplicate() { // deleta todos os duplicados de uma vez.
        Node temp, aux, index;
        if (this.isEmpty()) {
            System.out.println("Lista vazia. Impossível deletar.");
            return;
        } else {
            for (aux = this.head; aux != null; aux = aux.getNext()) {
                for (index = aux.getNext(); index != null; index = index.getNext()) {
                    if (aux.getValue() == index.getValue()) { // se o valor do aux e index forem iguais...
                        temp = index; // pega o valor repetido e guarda no temp.
                        Node ant = temp.getPrev(); // valor anterior ao repetido
                        Node prox = temp.getNext(); // valor prox ao repetido
                        ant.setNext(prox);
                        prox.setPrev(ant);
                        // esquema acima para deletar o valor repetido
                        this.size--;
                    }
                }
            }
        }
    }

    public void deleteDuplicate(Integer value) { // deleta o valor duplicado escolhido.
        Node aux = this.head;
        Node index = aux.getNext();

        if (this.isEmpty()) {
            System.out.println("Lista vazia. Impossível deletar.");
            return;
        } else {
            for (aux = this.head; aux != null; aux = aux.getNext()) {
                for (index = aux.getNext(); index != null; index = index.getNext()) {
                    if (aux.getValue() == index.getValue()) {
                        this.delete(value);
                    }
                }
            }
        }
    }

    public void sortList() {
        Node aux, index;
        int temp;

        if (this.isEmpty()) {
            System.out.println("Lista vazia.");
            return;
        } else {
            for (aux = this.head; aux != null; aux = aux.getNext()) {
                for (index = aux.getNext(); index != null; index = index.getNext()) {
                    if (aux.getValue() > index.getValue()) {
                        temp = aux.getValue(); // Guarda o valor do temp
                        aux.setValue(index.getValue());
                        index.setValue(temp);
                    }
                }
            }
        }
    }

    public void exibirLista() {
        Node aux = this.head;

        if (this.isEmpty()) {
            System.out.println("Lista vazia. Impossível exibir.");
            return;
        } else {
            while (aux != null) {
                System.out.println(aux.getValue() + " ");
                aux = aux.getNext();
            }
            System.out.println();
        }
    }

}
