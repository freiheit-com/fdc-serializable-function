package com.freiheit.function.serializable;

import java.io.Serializable;
import java.util.function.BiConsumer;

/**
 * Serializable version of {@link BiConsumer}.
 *
 * @param <T>
 *            the type of the first argument to the operation
 * @param <U>
 *            the type of the second argument to the operation
 * 
 * @see {@link BiConsumer}
 * @author Michael Bohn (initial creation)
 */
@FunctionalInterface
public interface SerializableBiConsumer<T, U> extends BiConsumer<T, U>, Serializable {
    //nothing
}
