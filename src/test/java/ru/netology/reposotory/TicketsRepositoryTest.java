package ru.netology.reposotory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Ticket;

import static org.junit.jupiter.api.Assertions.*;

class TicketsRepositoryTest {
    private TicketsRepository ticketsRepository = new TicketsRepository();

    private Ticket testTicket1 = new Ticket(1, 5000, "VKO", "LED", 100);
    private Ticket testTicket2 = new Ticket(2, 5200, "LED", "VKO", 120);
    private Ticket testTicket3 = new Ticket(3, 6300, "VKO", "AER", 140);
    private Ticket testTicket4 = new Ticket(4, 6400, "AER", "VKO", 150);
    private Ticket testTicket5 = new Ticket(5, 5500, "VKO", "KGD", 100);
    private Ticket testTicket6 = new Ticket(6, 5600, "KGD", "VKO", 120);
    private Ticket testTicket7 = new Ticket(7, 8700, "VKO", "BHK", 220);
    private Ticket testTicket8 = new Ticket(8, 8800, "BHK", "VKO", 230);
    private Ticket testTicket9 = new Ticket(9, 2500, "VKO", "MRL", 130);
    private Ticket testTicket10 = new Ticket(10, 2800, "MRL", "VKO", 140);
    private Ticket ticketToAdd = new Ticket(9999, 9999, "NNN", "YYY", 2000);

    @BeforeEach
    void SetUp() {
        ticketsRepository.save(testTicket1);
        ticketsRepository.save(testTicket2);
        ticketsRepository.save(testTicket3);
        ticketsRepository.save(testTicket4);
        ticketsRepository.save(testTicket5);
        ticketsRepository.save(testTicket6);
        ticketsRepository.save(testTicket7);
        ticketsRepository.save(testTicket8);
        ticketsRepository.save(testTicket9);
        ticketsRepository.save(testTicket10);
    }

    @Test
    void shouldSaveAndGetAll() {
        ticketsRepository.save(ticketToAdd);
        Ticket[] expected = {
                testTicket1,
                testTicket2,
                testTicket3,
                testTicket4,
                testTicket5,
                testTicket6,
                testTicket7,
                testTicket8,
                testTicket9,
                testTicket10,
                ticketToAdd
        };
        Ticket[] actual = ticketsRepository.getAll();
        assertArrayEquals(expected, actual);
    }


}