package org.example;

public class Purchase {
    private final Long amount;
    private final String state;

    public Long getAmount() {
        return amount;
    }

    public String getState() {
        return state;
    }

    public Purchase(Long amount, String state) {
        this.amount = amount;
        this.state = state;
    }
}
