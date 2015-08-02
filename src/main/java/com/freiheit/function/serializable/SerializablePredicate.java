package com.freiheit.function.serializable;

import java.io.Serializable;
import java.util.function.Predicate;

/**
 * Serializable version of {@link Predicate}.
 * 
 * @param <T>
 *            the type of the input to the predicate
 * 
 * @see Predicate
 * @author Michael Bohn (initial creation)
 */
@FunctionalInterface
public interface SerializablePredicate<T> extends Predicate<T>, Serializable {
    //nothing
}
