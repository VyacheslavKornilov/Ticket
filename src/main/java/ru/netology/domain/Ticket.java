package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@NoArgsConstructor
@AllArgsConstructor
@Data
public
class Ticket implements Comparable<Ticket> {
    private int id;
    private int price;
    private String departure;
    private String arrival;
    private int travelTime;

    @Override
    public int compareTo(Ticket o) {
        return price - o.price;
    }
}