package com.freiheit.function.serializable;

import java.io.Serializable;
import java.util.function.IntSupplier;

/**
 * Serializable version of {@link IntSupplier}.
 * 
 * @see IntSupplier
 * @author Michael Bohn (initial creation)
 */
@FunctionalInterface
public interface SerializableIntSupplier extends IntSupplier, Serializable {
    //nothing
}
