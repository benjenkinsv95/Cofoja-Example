package com.benjenkins.cofoja.contracts.violated;

import com.google.java.contract.Ensures;
import com.google.java.contract.Invariant;
import com.google.java.contract.Requires;

import java.util.ArrayList;
import java.util.List;

/**
 * An example of Cofoja's precondition and postcondition checking combined.
 *
 * @author Ben
 * @since 2/7/2018.
 */
public class CombinedContractList<E> {

    private List<E> list = new ArrayList<>();

    @Requires({"index >= 0", "index <= size()"})
    @Ensures({"element.equals(get(index))"})
    public void add(int index, E element) {
        // TODO: Add implementation later.
    }

    // Used in the contract
    public int size() {
        return list.size();
    }

    public E get(int index) {
        return list.get(index);
    }

    private boolean hasUniqueElements() {
        for (E element : list) {
            if (list.indexOf(element) != list.lastIndexOf(element)) {
                return false;
            }
        }
        return true;
    }
}
