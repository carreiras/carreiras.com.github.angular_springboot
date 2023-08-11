package carreiras.com.github.helpdeskapi.domain;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Person {

    private List<Ticket> tickets = new ArrayList<>();

    public Customer() {
        super();
    }

    public Customer(Integer id, String name, String cpf, String email, String password) {
        super(id, name, cpf, email, password);
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }
}