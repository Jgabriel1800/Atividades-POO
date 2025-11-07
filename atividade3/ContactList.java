public class ContactList {
    private Contact[] contacts;
    private int count;

    public ContactList() {
        this.contacts = new Contact[2]; 
        this.count = 0;
    }

    public void add(Contact c) {
        if (count == contacts.length) {
            System.out.println("Aumentando a capacidade da lista de contatos...");
            Contact[] expandedArray = new Contact[contacts.length * 2];

            for (int i = 0; i < contacts.length; i++) {
                expandedArray[i] = contacts[i];
            }

            this.contacts = expandedArray;
            System.out.println("Contatos transferidos com sucesso!");
        }

        contacts[count] = c;
        count++;
    }

    /**
     * Exibe todos os contatos armazenados até o momento.
     */
    public void printAll() {
        System.out.println("Contatos na lista:");
        for (int i = 0; i < count; i++) {
            System.out.println(contacts[i].name + " : " + contacts[i].phone);
        }
        System.out.println("********\n");
    }

    /**
     * Exibe as referências de memória (endereços) dos objetos armazenados.
     */
    public void showReferences() {
        System.out.println("Referências de objetos Contact:");
        for (int i = 0; i < count; i++) {
            System.out.println(contacts[i]); 
        }
        System.out.println("***********\n");
    }

    public static void main(String[] args) {
    ContactList list = new ContactList();

    Contact c1 = new Contact("Lucas", "(11) 91234-5678");
    Contact c2 = new Contact("Fernanda", "(21) 99876-4321");
    Contact c3 = new Contact("João", "(31) 98765-1234");
    Contact c4 = new Contact("Mariana", "(47) 99654-7890");
    Contact c5 = new Contact("Thiago", "(61) 99123-4567");

    list.add(c1);
    list.add(c2);
    list.printAll();
    list.showReferences();

    list.add(c3);
    list.add(c4);
    System.out.println("Tamanho do array atual: " + list.contacts.length);

    list.add(c5);
    System.out.println("Tamanho do array atual: " + list.contacts.length);
    list.printAll();
    list.showReferences();
}

}
