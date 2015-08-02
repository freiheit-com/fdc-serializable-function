package com.freiheit.function.serializable;

import java.io.Serializable;
import java.util.function.LongPredicate;

/**
 * Serializable version of {@link LongPredicate}.
 * 
 * @see LongPredicate
 * @author Michael Bohn (initial creation)
 */
@FunctionalInterface
public interface SerializableLongPredicate extends LongPredicate, Serializable {
    //nothing
}
