package com.benjenkins.cofoja.contracts.violated;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * An example of a combined test of Cofoja's precondition and postcondition checks.
 *
 * @author Ben
 * @since 2/7/2018.
 */

class CombinedContractListTest {

    @Test
    @DisplayName("add with precondition and postcondition checks.")
    public void add() {
        CombinedContractList<String> contractList = new CombinedContractList<>();
        contractList.add(2, "cat");
    }


}