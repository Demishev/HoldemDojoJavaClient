package com.nedogeek;

import org.junit.Test;

/**
 * User: Konstantin Demishev
 * Date: 26.03.13
 * Time: 3:06
 */
public class ClientTest {
    private String sampleMessage = "{\"gameRound\":\"BLIND\",\"dealer\":\"U31\",\"mover\":\"U31\",\"event\":[\"BLIND game round started.\"],\"players\":[{\"balance\":90,\"status\":\"SmallBLind\",\"name\":\"Random bot\",\"pot\":10}, {\"balance\":500,\"status\":\"BigBlind\",\"name\":\"Call bot\",\"pot\":20}, {\"balance\":77580,\"status\":\"NotMoved\",\"name\":\"U31\",\"pot\":0,\"cards\":[{\"cardValue\":\"K\",\"cardSuit\":\"♠\"},{\"cardValue\":\"J\",\"cardSuit\":\"♠\"}]}],\"combination\":\"High card King with Jack: [K♠, J♠]\",\"gameStatus\":\"STARTED\",\"deskCards\":[],\"deskPot\":30}";

    @Test
    public void parsingWorks() throws Exception {

    }
}
