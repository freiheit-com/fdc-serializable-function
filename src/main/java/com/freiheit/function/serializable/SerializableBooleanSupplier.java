package com.freiheit.function.serializable;

import java.io.Serializable;
import java.util.function.BooleanSupplier;

/**
 * Serializable version of {@link BooleanSupplier}.
 * 
 * @see BooleanSupplier
 * @author Michael Bohn (initial creation)
 */
@FunctionalInterface
public interface SerializableBooleanSupplier extends BooleanSupplier, Serializable {
    //nothing
}
