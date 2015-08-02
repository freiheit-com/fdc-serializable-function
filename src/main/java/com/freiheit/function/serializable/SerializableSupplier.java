package com.freiheit.function.serializable;

import java.io.Serializable;
import java.util.function.Supplier;

/**
 * Serializable version of {@link Supplier}.
 * 
 * @param <T>
 *            the type of results supplied by this supplier
 * 
 * @see Supplier
 * @author Michael Bohn (initial creation)
 */
@FunctionalInterface
public interface SerializableSupplier<T> extends Supplier<T>, Serializable {
    //nothing
}
