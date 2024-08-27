package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class TestSolution {
    @Test
    public void testGetUniqueStates() {
        final List<Purchase> purchaseList = new ArrayList<>();
        purchaseList.add(new Purchase(100L, "MN"));
        purchaseList.add(new Purchase(100L, "CA"));
        purchaseList.add(new Purchase(300L, "FL"));
        purchaseList.add(new Purchase(100L, "MI"));
        purchaseList.add(new Purchase(100L, "NY"));
        purchaseList.add(new Purchase(500L, "MN"));
        purchaseList.add(new Purchase(100L, "CT"));
        purchaseList.add(new Purchase(100L, "CT"));
        purchaseList.add(new Purchase(300L, "MI"));
        purchaseList.add(new Purchase(100L, "NY"));
        purchaseList.add(new Purchase(200L, "HA"));
        purchaseList.add(new Purchase(50L, "AK"));
        purchaseList.add(new Purchase(100L, "WY"));
        purchaseList.add(new Purchase(100L, "OR"));

        final List<String> expectedStates = new ArrayList<>();
        expectedStates.add("MN");
        expectedStates.add("CA");
        expectedStates.add("FL");
        expectedStates.add("MI");
        expectedStates.add("NY");
        expectedStates.add("CT");
        expectedStates.add("HA");
        expectedStates.add("AK");
        expectedStates.add("WY");
        expectedStates.add("OR");

        final SolutionService solutionService = new SolutionService();
        assertEquals(expectedStates.stream()
                        .sorted()
                        .toList(),
                solutionService.getUniqueStates(purchaseList)
                        .stream()
                        .sorted()
                        .toList());
    }

    @Test
    public void testGetPurchaseAmountTotal() {
        final List<Purchase> purchaseList = new ArrayList<>();
        purchaseList.add(new Purchase(100L, "MN"));
        purchaseList.add(new Purchase(100L, "CA"));
        purchaseList.add(new Purchase(300L, "FL"));
        purchaseList.add(new Purchase(100L, "MI"));
        purchaseList.add(new Purchase(100L, "NY"));
        purchaseList.add(new Purchase(500L, "MN"));
        purchaseList.add(new Purchase(100L, "CT"));
        purchaseList.add(new Purchase(100L, "CT"));
        purchaseList.add(new Purchase(300L, "MI"));
        purchaseList.add(new Purchase(100L, "NY"));
        purchaseList.add(new Purchase(200L, "HA"));
        purchaseList.add(new Purchase(50L, "AK"));
        purchaseList.add(new Purchase(100L, "WY"));
        purchaseList.add(new Purchase(100L, "OR"));

        final SolutionService solutionService = new SolutionService();
        assertEquals(2250L, solutionService.getPurchaseAmountTotal(purchaseList));
    }

    @Test
    public void testGetTotalJustMinnesota() {
        final List<Purchase> purchaseList = new ArrayList<>();
        purchaseList.add(new Purchase(100L, "MN"));
        purchaseList.add(new Purchase(100L, "CA"));
        purchaseList.add(new Purchase(300L, "FL"));
        purchaseList.add(new Purchase(100L, "MI"));
        purchaseList.add(new Purchase(100L, "NY"));
        purchaseList.add(new Purchase(500L, "MN"));
        purchaseList.add(new Purchase(100L, "CT"));
        purchaseList.add(new Purchase(100L, "CT"));
        purchaseList.add(new Purchase(300L, "MI"));
        purchaseList.add(new Purchase(100L, "NY"));
        purchaseList.add(new Purchase(200L, "HA"));
        purchaseList.add(new Purchase(50L, "AK"));
        purchaseList.add(new Purchase(100L, "WY"));
        purchaseList.add(new Purchase(100L, "OR"));

        final SolutionService solutionService = new SolutionService();
        assertEquals(600L, solutionService.getPurchaseAmountTotalJustMinnesota(purchaseList));
    }
}