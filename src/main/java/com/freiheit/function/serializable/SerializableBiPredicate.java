package com.freiheit.function.serializable;

import java.io.Serializable;
import java.util.function.BiPredicate;

/**
 * Serializable version of {@link BiPredicate}.
 * 
 * @param <T>
 *            the type of the first argument to the predicate
 * @param <U>
 *            the type of the second argument the predicate
 * 
 * @see BiPredicate
 * @author Michael Bohn (initial creation)
 */
@FunctionalInterface
public interface SerializableBiPredicate<T, U> extends BiPredicate<T, U>, Serializable {
    //nothing
}
