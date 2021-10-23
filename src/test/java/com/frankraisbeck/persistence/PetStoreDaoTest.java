package com.frankraisbeck.persistence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetStoreDaoTest {

    @Test
    void getPet() {
        PetStoreDao dao = new PetStoreDao();
        assertEquals("sweet", dao.getPet().getName());
    }
}