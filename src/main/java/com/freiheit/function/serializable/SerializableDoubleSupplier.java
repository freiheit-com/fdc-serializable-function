package com.freiheit.function.serializable;

import java.io.Serializable;
import java.util.function.DoubleSupplier;

/**
 * Serializable version of {@link DoubleSupplier}.
 * 
 * @see DoubleSupplier
 * @author Michael Bohn (initial creation)
 */
@FunctionalInterface
public interface SerializableDoubleSupplier extends DoubleSupplier, Serializable {
    //nothing
}
