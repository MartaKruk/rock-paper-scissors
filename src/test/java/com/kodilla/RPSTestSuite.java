package com.kodilla;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RPSTestSuite {

    @Test
    void testRPSRules() {
        //Given
        int rock = 1;
        int paper = 2;
        int scissors = 3;
        //When
        RPSRules rpsRules = new RPSRules();
        int winner1 = rpsRules.whoWon(rock, scissors);
        int winner2 = rpsRules.whoWon(scissors, paper);
        int winner3 = rpsRules.whoWon(paper, rock);
        //Then
        assertEquals(1, winner1);
        assertEquals(1, winner2);
        assertEquals(1, winner3);
    }

    @Test
    void testRPSLSRules() {
        //Given
        int rock = 1;
        int paper = 2;
        int scissors = 3;
        int lizard = 4;
        int spock = 5;
        //When
        RPSLSRules rpslsRules = new RPSLSRules();
        int winner1 = rpslsRules.whoWon(rock, lizard);
        int winner2 = rpslsRules.whoWon(lizard, spock);
        int winner3 = rpslsRules.whoWon(spock, scissors);
        int winner4 = rpslsRules.whoWon(scissors, lizard);
        int winner5 = rpslsRules.whoWon(lizard, paper);
        int winner6 = rpslsRules.whoWon(paper, spock);
        int winner7 = rpslsRules.whoWon(spock, rock);
        //Then
        assertEquals(1, winner1);
        assertEquals(1, winner2);
        assertEquals(1, winner3);
        assertEquals(1, winner4);
        assertEquals(1, winner5);
        assertEquals(1, winner6);
        assertEquals(1, winner7);
    }

    @Test
    void testIsNaturalNumber() {
        //Given
        boolean output = InputOutputController.isNaturalNumber("text");
        boolean output2 = InputOutputController.isNaturalNumber("2");
        //When&Then
        assertFalse(output);
        assertTrue(output2);
    }
}
