package com.freiheit.function.serializable;

import java.io.Serializable;
import java.util.function.IntPredicate;

/**
 * Serializable version of {@link IntPredicate}.
 * 
 * @see IntPredicate
 * @author Michael Bohn (initial creation)
 */
@FunctionalInterface
public interface SerializableIntPredicate extends IntPredicate, Serializable {
    //nothing
}
