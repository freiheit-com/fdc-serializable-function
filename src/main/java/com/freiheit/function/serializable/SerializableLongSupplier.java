package com.freiheit.function.serializable;

import java.io.Serializable;
import java.util.function.LongSupplier;

/**
 * Serializable version of {@link LongSupplier}.
 * 
 * @see LongSupplier
 * @author Michael Bohn (initial creation)
 */
@FunctionalInterface
public interface SerializableLongSupplier extends LongSupplier, Serializable {
    //nothing
}
